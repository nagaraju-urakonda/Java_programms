import java.util.Scanner;
public class PerfectNumber {
    boolean method(int n){
        int sum =0 ;
        for(int i = 1; i <= n / 2; i++){
            if(n % i == 0){
                sum += i;
            }
        }
        if(sum == n){
            return true;
        }
        else return false;
    }
    public static void main(String[] args) {
        PerfectNumber p = new PerfectNumber();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number :");
        int num = sc.nextInt();
        if (p.method(num)) {
            System.out.println("yes it is a perfect number");
        }
        else System.out.println("no it is not a perfect number");
        sc.close();
    }
}
