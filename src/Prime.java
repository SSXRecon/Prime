

public class Prime {

    public static void main(String[]args){
        System.out.println(isPrime(257));
    }

    public static boolean isPrime(int num) {
        boolean flag = true;
        if (num <1) {
            flag = false;
        }
        for(int i = 2; i < (num - 1) && flag == true; i++) {
            if(num%i == 0) {
                flag = false;
            }
        }
        return flag;
    }
}