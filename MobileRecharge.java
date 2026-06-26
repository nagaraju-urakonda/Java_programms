import java.util.Scanner;

public class MobileRecharge {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n------ MOBILE RECHARGE ------");
            System.out.println("1. ₹199 Plan (28 Days)");
            System.out.println("2. ₹399 Plan (56 Days)");
            System.out.println("3. ₹599 Plan (84 Days)");
            System.out.println("4. Exit");
            System.out.print("Choose Plan: ");

            int plan = sc.nextInt();

            if (plan == 4) {
                System.out.println("Thank You!");
                break;
            }

            System.out.print("Enter Amount: ");
            int amount = sc.nextInt();

            int price = 0;
            int validity = 0;

            switch (plan) {

                case 1:
                    price = 199;
                    validity = 28;
                    break;

                case 2:
                    price = 399;
                    validity = 56;
                    break;

                case 3:
                    price = 599;
                    validity = 84;
                    break;

                default:
                    System.out.println("Invalid Option");
                    continue;
            }

            if (amount >= price) {
                int change = amount - price;
                System.out.println("Recharge Successful");
                System.out.println("Validity: " + validity + " Days");
                System.out.println("Change: ₹" + change);
            } else {
                System.out.println("Insufficient Amount");
            }
        }

        sc.close();
    }
}