import java.util.Scanner;
public class palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String original = str;
        String rev = "";
        for(int i = str.length()-1; i >=0; i--){
            rev += str.charAt(i);
        }
        if(rev.equals(original)){
            System.out.print("yes it is palindrome");

        }
        else{
            System.out.print("no");
        }
         sc.close();

    }
}
