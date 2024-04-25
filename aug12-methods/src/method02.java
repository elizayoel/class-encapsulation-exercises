import java.util.*;

public class method02 {
    public static void main(String[] args) {
        Scanner scanInt = new Scanner(System.in);
        System.out.println("Inputkan panjang: ");
        int panjang = scanInt.nextInt();
        System.out.println("Inputkan lebar: ");
        int lebar = scanInt.nextInt();


        gambar(panjang,lebar);
        luas(panjang,lebar);

        int keliling = keliling(panjang,lebar);
        System.out.println("Keliling = " + keliling);
    }

    private static void gambar(int panjang,int lebar){
        for (int i = 0; i < lebar; i++) {
            for (int j = 0; j < panjang; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static int luas(int panjang, int lebar){
        int luas = panjang*lebar;
        System.out.println("Luas = " + luas);
        return luas;
    }
    private static int keliling(int panjang, int lebar){
        int keliling = 2*panjang + 2*lebar;
        return keliling;
    }
}
