public class SecondLargest {
    public static void main(String[] args) {

        int arr [] = {1,2,3,4,11,23,144};
        int fmax = Integer.MIN_VALUE;
        int smax = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > fmax){
                smax = fmax;
                fmax = arr[i];
            }
            else if (arr[i] > smax && arr[i] != fmax){
                smax = arr[i];
            }
        }
        System.out.print("first maximum is : "+ fmax + " "+ "secind maximum is :" + smax);
    }
}
