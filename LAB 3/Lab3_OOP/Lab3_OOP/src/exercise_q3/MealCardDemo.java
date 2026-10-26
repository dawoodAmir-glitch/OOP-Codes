package exercise_q3;

class MealCard {
    String owner;
    int points;

    MealCard(String owner, int points) {
        this.owner = owner;
        this.points = points;
    }

    void addPoints(int p) {
        points += p;
    }

    boolean deductPoints(int p) {
        if (p <= points) {
            points -= p;
            return true;
        }
        return false;
    }

    // Subtract from this card and add the same amount to the other card
    void transfer(MealCard other, int p) {
        if (deductPoints(p)) {
            other.addPoints(p);
            System.out.println(p + " points moved from " + owner + " to " + other.owner);
        } else {
            System.out.println("Transfer failed: " + owner + " has only " + points + " points");
        }
    }

    void show() {
        System.out.println(owner + "'s card -> " + points + " points");
    }
}

public class MealCardDemo {
    public static void main(String[] args) {
        MealCard card1 = new MealCard("Ali", 100);
        MealCard card2 = new MealCard("Sara", 50);

        card1.transfer(card2, 30);
        card1.transfer(card2, 500);   // not enough points

        card1.show();
        card2.show();
    }
}
