public class CountingVoewelsAndConsonants {
    void is_VC(String str){
        int vowelcount = 0;
        int consonantcount =0;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            ch = Character.toLowerCase(ch);
            if( ch >= 'a' && ch <= 'z'){
                if(ch == 'a' || ch == 'e'|| ch == 'i'|| ch == 'o'|| ch == 'u'){
                    vowelcount++;
                }
                else{
                    consonantcount++;
                }
            }
        }
                    System.out.println(vowelcount);
            System.out.println(consonantcount);
    }
    public static void main(String[] args) {
        CountingVoewelsAndConsonants ob = new  CountingVoewelsAndConsonants();
        ob.is_VC("Amma and nanna");
    }
}