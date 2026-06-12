import java.util.Scanner;
public class prime {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int a = sc.nextInt();
        int count =0;
        for(int i =2; i < Math.sqrt(a); i++){
            if(a % i == 0){
                count++;
            }
        }
        if(count < 2){
            System.out.print("it is a prime" + " " + a);
        }
         sc.close();
    }
}
