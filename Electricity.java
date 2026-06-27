import java.util.Scanner;
public class Electricity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter customers`s name : ");
        String name = sc.next();
        System.out.println("enter the no of units consumed :");
        int units = sc.nextInt();
        int charge = 0;
        int discount = 0;
        int finala = 0;
        if (units < 0) {
            System.out.println("Invalid Units");
            return;
        }
        if (units >= 1 && units <= 100) {
            charge = units * 2;
            finala = charge;
        }
        else if (units >= 101 && units <= 200) {
            charge = units * 3;
            finala = charge;
        }
        else if (units <= 200) {
            charge = units * 5;
            finala = charge;
        }
        
        if (charge > 1000) {
            discount = charge * 5 / 100;
            finala = charge - discount;
        }
        System.out.println("----------Electricty Bill--------");
        System.out.println("Customer name : "+ name);
        System.out.println("Units :"+ units);
        System.out.println("Bill Amount :"+ charge);
        System.out.println("Discount :"+ discount);
        System.out.println("Final amount :"+ finala);

    }
}
