public class LargestOfThree {
    public static void main(String [] args){
        int arr [] = {10, 25, 13};
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.print(max);
    }
}
