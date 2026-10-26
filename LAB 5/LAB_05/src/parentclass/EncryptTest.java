package parentclass;

import java.io.FileWriter;
import java.io.IOException;

class Data {
    protected String data;

    Data(String d) { data = d; }
    public void setData(String d) { data = d; }
    public String getData() { return data; }
}

class EncryptedData extends Data {
    protected String encryptedarray[];
    protected boolean encrypted;
    protected int length;

    EncryptedData(String d) {
        super(d);
        encrypted = false;
    }

    public void encrypt() {
        if (encrypted) return;
        // Step 1: flip low byte, swap bytes, toggle bits
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < data.length(); i++) {
            int c = data.charAt(i);
            int low = (~c) & 0xFF;
            int high = (c >> 8) & 0xFF;
            int swapped = (low << 8) | high;
            swapped ^= 0x55;
            sb.append((char) swapped);
        }
        String s = sb.toString();
        length = s.length();
        // Step 2: column-wise fill of n Strings, pad with '*'
        int n = (int) Math.ceil(Math.sqrt(s.length()));
        char[][] grid = new char[n][n];
        for (int r = 0; r < n; r++)
            for (int c = 0; c < n; c++) grid[r][c] = '*';
        for (int k = 0; k < s.length(); k++) grid[k % n][k / n] = s.charAt(k);
        encryptedarray = new String[n];
        StringBuilder row = new StringBuilder();
        for (int r = 0; r < n; r++) {
            encryptedarray[r] = new String(grid[r]);
            row.append(encryptedarray[r]);
        }
        data = row.toString();
        encrypted = true;
    }

    public void decrypt() {
        if (!encrypted) return;
        int n = (int) Math.round(Math.sqrt(data.length()));
        StringBuilder s = new StringBuilder();
        for (int k = 0; k < length; k++) s.append(data.charAt((k % n) * n + k / n));
        StringBuilder sb = new StringBuilder();
        String t = s.toString();
        for (int i = 0; i < t.length(); i++) {
            int c = t.charAt(i) ^ 0x55;
            int low = c & 0xFF;
            int high = (c >> 8) & 0xFF;
            int orig = (low << 8) | ((~high) & 0xFF);
            sb.append((char) orig);
        }
        data = sb.toString();
        encrypted = false;
    }

    public String storeData() {
        String stored = encrypted + ":" + length + ":" + data;
        try (FileWriter fw = new FileWriter("data.txt")) {
            fw.write(stored);
        } catch (IOException e) {
            System.out.println("File error");
        }
        return stored;
    }

    public void loadData(String d) {
        String[] parts = d.split(":", 3);
        encrypted = Boolean.parseBoolean(parts[0]);
        length = Integer.parseInt(parts[1]);
        data = parts[2];
    }
}

public class EncryptTest {
    static String hex(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            sb.append(String.format("%04X ", (int) s.charAt(i)));
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        EncryptedData e1 = new EncryptedData("ABCDEFGHIJ");
        System.out.println("Original : " + e1.getData());
        e1.encrypt();
        System.out.println("Encrypted: " + hex(e1.getData()));
        String stored = e1.storeData();

        EncryptedData e2 = new EncryptedData("");
        e2.loadData(stored);
        e2.decrypt();
        System.out.println("Decrypted: " + e2.getData());
    }
}