import java.util.Scanner;
public class vowels {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
    String name = sc.next();
    int count = 0;
    for(int i = 0 ; i < name.length(); i ++){
        char ch = name.charAt(i);
        if(ch == 'a'|| ch =='e' || ch == 'i' || ch == 'o' || ch == 'u'){
            count++;
        }
    }
    System.out.println(count);
    } 
}
