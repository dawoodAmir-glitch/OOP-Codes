
interface Validator {
    void setPassword(String s);
}

class User implements Validator {
    private static final String DEFAULT_PASSWORD = "Uet1234";

    String UserID;
    String Password;

    User(String userid) {
        UserID = userid;
        Password = DEFAULT_PASSWORD;
    }

    User(String userid, String password) {
        UserID = userid;
        // no previous password yet, so only the UserID rule applies
        if (check(password, null)) {
            Password = password;
        } else {
            Password = DEFAULT_PASSWORD;
        }
    }

    // Same function implemented due to interface: sets a valid password
    public void setPassword(String PWord) {
        if (isValid(PWord)) {
            Password = PWord;
            System.out.println("  -> ACCEPTED: password changed to \"" + PWord + "\"");
        } else {
            System.out.println("  -> REJECTED: \"" + PWord + "\" is not valid, password unchanged");
        }
    }

    // Returns whether the password is valid
    public boolean isValid(String PWord) {
        return check(PWord, Password);
    }

    private boolean check(String p, String previous) {
        if (p == null || p.length() < 8) return false;

        // at least three of the four character types
        boolean upper = false, lower = false, digit = false, special = false;
        for (char c : p.toCharArray()) {
            if (Character.isUpperCase(c)) upper = true;
            else if (Character.isLowerCase(c)) lower = true;
            else if (Character.isDigit(c)) digit = true;
            else if ("!@#$%".indexOf(c) >= 0) special = true;
        }
        int types = (upper ? 1 : 0) + (lower ? 1 : 0) + (digit ? 1 : 0) + (special ? 1 : 0);
        if (types < 3) return false;

        // must not share 5 consecutive characters (ignoring case) with previous password or UserID
        if (sharesFiveChars(p, previous)) return false;
        if (sharesFiveChars(p, UserID)) return false;
        return true;
    }

    private static boolean sharesFiveChars(String p, String other) {
        if (other == null || other.length() < 5) return false;
        String a = p.toLowerCase();
        String b = other.toLowerCase();
        for (int i = 0; i + 5 <= a.length(); i++) {
            if (b.contains(a.substring(i, i + 5))) return true;
        }
        return false;
    }
}

public class PasswordTest {
    public static void main(String[] args) {
        User u = new User("dawood");
        System.out.println("Initial password: " + u.Password);

        String[] tests = {
            "Ab1!",            // too short
            "abcdefgh",        // only one type
            "abcdefg1",        // only two types
            "Abcdefg1",        // valid: upper, lower, digit
            "Xyz@9876",        // valid
            "Uet1234xy!",      // valid (previous password is now Xyz@9876, so no overlap)
            "MyDAWOO1#",       // contains "dawoo" -> matches UserID
            "Hello#2026",      // valid
            "hello#2026A"      // shares "hello" with previous password
        };

        for (String t : tests) {
            System.out.println("Trying: " + t);
            u.setPassword(t);
        }

        System.out.println("Final password: " + u.Password);

        System.out.println("\nConstructor with invalid password falls back to default:");
        User u2 = new User("ali", "bad");
        System.out.println("ali's password: " + u2.Password);

        System.out.println("Constructor with valid password keeps it:");
        User u3 = new User("sara", "Strong#99");
        System.out.println("sara's password: " + u3.Password);
    }
}
