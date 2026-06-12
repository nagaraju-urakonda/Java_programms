import java.util.Scanner;
public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int org = num;
        int result = 0;

        while(num != 0){
            int digit = num % 10;
            int arms = (int) Math.pow(digit, 3);
            result += arms;
            num = num / 10;
        }
        if(result == org){
            System.out.println("yes it is armstrong number");
        }
        else{
            System.out.println("no it is not");
        }
    }
}
