import java.util.*;

public class recursiveFunction {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan nilai:");
        int nilai = scan.nextInt();
        System.out.println("Anda memasukkan nilai = " + nilai);
        printNilai(nilai);

        int jumlah = jumlahNilai(nilai);
        System.out.println("Jumlah = "+jumlah);

        int faktorial = hitungFaktorial(nilai);
        System.out.println("Hasil faktorial = " + faktorial);
    }

    // RECURSIVE FUNCTION =  RETURN SEBUAH FUNGSI
    private static  void printNilai (int parameter) {
        System.out.println("Nilai = " + parameter);
        //printNilai(parameter) -> ERROR karena akan berulang terus
        if(parameter==0){
            return;
        }
        parameter--;
        printNilai(parameter);
    }

    private static int jumlahNilai (int parameter){
        System.out.println("Parameter = " + parameter);
        if(parameter==0){
            return parameter;
        }
        return parameter + jumlahNilai(parameter-1);
    }

    private static int hitungFaktorial(int parameter){
        System.out.println("Parameter = " + parameter);
        if(parameter == 1){
            return parameter;
        }
        return parameter * hitungFaktorial(parameter-1);
    }
}
