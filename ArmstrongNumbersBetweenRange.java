import java.util.Scanner;
public class ArmstrongNumbersBetweenRange {
    boolean armstrong(int num){
        int org = num;
        int result = 0;
        while(num != 0){
            int digit = num % 10;
            int arms = (int) Math.pow(digit, 3);
            result += arms;
            num = num / 10;
        }
        if(result == org){
            return true;
        }
        else return false;
    }
    public static void main(String[] args) {
        ArmstrongNumbersBetweenRange a = new ArmstrongNumbersBetweenRange();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the starting number ");
        int start = sc.nextInt();
        System.out.println("enter the ending number ");
        int end  = sc.nextInt();
        for(int i = start; i <= end; i++){
            if(a.armstrong(i)){
                System.out.println(i);
            }
        }
    }
}
