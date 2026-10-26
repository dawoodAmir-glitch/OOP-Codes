
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

class Month {
    private final String name;
    private final float[] temps;

    Month(String name, float[] temps) {
        this.name = name;
        this.temps = temps;
    }

    String getName() { return name; }
    int getDays() { return temps.length; }

    float sum() {
        float s = 0;
        for (float t : temps) s += t;
        return s;
    }

    float average() { return temps.length == 0 ? 0 : sum() / temps.length; }

    float lowest() {
        float m = temps[0];
        for (float t : temps) if (t < m) m = t;
        return m;
    }

    float highest() {
        float m = temps[0];
        for (float t : temps) if (t > m) m = t;
        return m;
    }
}

public class TemperatureStats {
    static final String[] NAMES = { "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December" };

    // each line of the file = one month, daily temperatures separated by spaces
    static Month[] load(String file) throws IOException {
        Month[] months = new Month[12];
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            for (int i = 0; i < 12; i++) {
                String line = br.readLine();
                if (line == null) throw new IOException("File has fewer than 12 lines");
                StringTokenizer st = new StringTokenizer(line);
                float[] temps = new float[st.countTokens()];
                int k = 0;
                while (st.hasMoreTokens()) temps[k++] = Float.parseFloat(st.nextToken());
                months[i] = new Month(NAMES[i], temps);
            }
        }
        return months;
    }

    static int askMonth(Scanner in) {
        while (true) {
            System.out.print("Enter month number (1-12): ");
            if (in.hasNextInt()) {
                int m = in.nextInt();
                if (m >= 1 && m <= 12) return m - 1;
            } else {
                in.next();
            }
            System.out.println("Invalid month.");
        }
    }

    public static void main(String[] args) {
        Month[] months;
        try {
            months = load("temperatures.txt");
        } catch (IOException | NumberFormatException e) {
            System.out.println("Could not read temperatures.txt: " + e.getMessage());
            System.out.println("Place the file in the project root folder (next to src).");
            return;
        }

        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- Temperature Statistics ---");
            System.out.println("1. Monthly average of a given month");
            System.out.println("2. Yearly average");
            System.out.println("3. Lowest and highest temperature of a given month");
            System.out.println("0. Exit");
            System.out.print("Choose: ");
            if (!in.hasNextInt()) { in.next(); continue; }
            int choice = in.nextInt();

            if (choice == 0) break;
            switch (choice) {
                case 1: {
                    Month m = months[askMonth(in)];
                    System.out.printf("Average for %s: %.2f%n", m.getName(), m.average());
                    break;
                }
                case 2: {
                    float total = 0;
                    int days = 0;
                    for (Month m : months) { total += m.sum(); days += m.getDays(); }
                    System.out.printf("Yearly average: %.2f%n", total / days);
                    break;
                }
                case 3: {
                    Month m = months[askMonth(in)];
                    System.out.printf("%s: lowest = %.1f, highest = %.1f%n", m.getName(), m.lowest(), m.highest());
                    break;
                }
                default:
                    System.out.println("Invalid option.");
            }
        }
        in.close();
        System.out.println("Goodbye!");
    }
}
