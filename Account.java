import java.util.Scanner;

public class Account {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int initialBalance = 10000;
        String lastTransaction = "No Transactions";

        while (true) {

            System.out.println("\n--------- BANK MENU ---------");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Mini Statement");
            System.out.println("5. Exit");

            System.out.print("Enter Your Option: ");
            int option = sc.nextInt();

            switch (option) {

                case 1:

                    System.out.print("Enter Deposit Amount: ");
                    int deposit = sc.nextInt();

                    if (deposit > 0) {
                        initialBalance += deposit;
                        lastTransaction = "Deposit ₹" + deposit;

                        System.out.println("Deposit Successful");
                        System.out.println("Current Balance: ₹" + initialBalance);
                    } else {
                        System.out.println("Invalid Amount");
                    }
                    break;

                case 2:

                    System.out.print("Enter Withdrawal Amount: ");
                    int withdrawal = sc.nextInt();

                    if (withdrawal <= 0) {
                        System.out.println("Invalid Amount");
                    }
                    else if (withdrawal > initialBalance) {
                        System.out.println("Insufficient Balance");
                    }
                    else {
                        initialBalance -= withdrawal;
                        lastTransaction = "Withdraw ₹" + withdrawal;

                        System.out.println("Withdrawal Successful");
                        System.out.println("Current Balance: ₹" + initialBalance);
                    }
                    break;

                case 3:

                    System.out.println("Current Balance: ₹" + initialBalance);
                    break;

                case 4:

                    System.out.println("\n------ MINI STATEMENT ------");
                    System.out.println("Current Balance : ₹" + initialBalance);
                    System.out.println("Last Transaction : " + lastTransaction);
                    break;

                case 5:

                    System.out.println("Thank You For Banking With Us!");
                    sc.close();
                    return;

                default:

                    System.out.println("Invalid Option");
            }
        }
    }
}