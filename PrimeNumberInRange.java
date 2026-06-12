public class PrimeNumberInRange {
    static boolean PrimeLogic(int n){
        if(n < 2){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(n); i ++){
            if(n % i == 0){
                return false;
            }
        }
        return true;

    }

public static void main(String args[]){
    int range = 100;
    for(int i = 2; i <= range; i++){
        if(PrimeLogic(i)){ 
            System.out.print(i + " ");
        }
    }
}
}