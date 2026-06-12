import java.util.Scanner;

public class pro1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println(sum);
         sc.close();
    }
}