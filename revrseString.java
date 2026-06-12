public class revrseString {
    public static void main(String[] args){
        String a = "nagaraju";
        String reverse = "";
        for(int i = a.length()-1; i >= 0; i --){
            reverse += a.charAt(i);
        }
        System.out.print(reverse);
    }
}
