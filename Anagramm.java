import java.util.Arrays;
public class Anagramm {
    boolean isAnagramm(String str1,String str2){
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        char arr1[] = str1.toCharArray();
        char arr2 [] = str2.toCharArray();
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1,arr2)){
            return true;
        }
        else return false;
        
    }
    public static void main(String[] args) {
        Anagramm a = new Anagramm();
        String c = "listen";
        String b = "Silent";
        if(a.isAnagramm(c,b)){
            System.out.println("yes");
        }
        else System.out.println("no");
    }
}
