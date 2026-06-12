import java.util.Scanner;
public class evenorodd {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number  = sc.nextInt();
        if(number % 2 == 0){
            System.out.println("It is a even number: " + number);
        }
        else{
            System.out.println("It is a odd number: " + number);
        }
         sc.close();
    }
   
}
