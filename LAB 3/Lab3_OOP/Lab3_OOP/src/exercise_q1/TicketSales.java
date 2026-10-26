package exercise_q1;

import java.util.Scanner;

public class TicketSales {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of A seats sold: ");
        int numberOfA_Seats = input.nextInt();
        System.out.print("Enter price per A seat: ");
        double pricePerA_Seat = input.nextDouble();

        System.out.print("Enter number of B seats sold: ");
        int numberOfB_Seats = input.nextInt();
        System.out.print("Enter price per B seat: ");
        double pricePerB_Seat = input.nextDouble();

        System.out.print("Enter number of C seats sold: ");
        int numberOfC_Seats = input.nextInt();
        System.out.print("Enter price per C seat: ");
        double pricePerC_Seat = input.nextDouble();

        double totalSales = numberOfA_Seats * pricePerA_Seat
                          + numberOfB_Seats * pricePerB_Seat
                          + numberOfC_Seats * pricePerC_Seat;

        System.out.printf("Total Ticket Sales = Rs. %.2f%n", totalSales);
        input.close();
    }
}
