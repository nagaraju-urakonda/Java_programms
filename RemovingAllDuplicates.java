public class RemovingAllDuplicates {
    void duplicates(String str){
        StringBuilder sc = new StringBuilder();
        boolean found[] = new boolean[26];
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            int index = ch - 'a';
            if(ch >= 'a' && ch <= 'z'){
                if(!found[index]){
                    sc.append(ch);
                    found[index] = true;
                }
            }
        }
        String result = sc.toString();
        System.out.println(result);
    }
    public static void main(String[] args) {
        RemovingAllDuplicates ob = new RemovingAllDuplicates();
        ob.duplicates("hello");
    }

}
