public class pro2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,1,2,3,1,2,1};
        boolean[] seen = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (seen[i]) continue;

            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    seen[j] = true;
                }
            }

            if (count > 1) {
                System.out.println(arr[i] + " is repeated " + count + " times");
            }
        }
    }
}