import java.util.*;


public class nestedRecursive {
    public static void main(String[] args) {
        Scanner scanInt = new Scanner(System.in);
        System.out.println("Masukkan nilai n: ");
        int nilai = scanInt.nextInt();
        int nilai_fibonacci = fibonacci(nilai);
        System.out.println("Nilai fibonacci ke-" + nilai +" adalah " + nilai_fibonacci);
    }

    private static int fibonacci(int n){
        //berhenti dimana
        System.out.println("Fibo ke- " + n);
        if(n == 0 || n == 1){
            return n;
        }
        return fibonacci(n-1) + fibonacci (n-2);

    }
}
