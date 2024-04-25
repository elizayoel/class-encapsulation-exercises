
// OVERLOADED METHODS = share the same name but have different PARAMETERS
// method name + parameters = method signature
// OVERLOAD METHOD : nyesuaiin sama polanya (float int, int int, float double,etc)

public class overloadMethod {
    public static void main(String[] args) {
        printangka(10);
        printangka(10.5f);
        printangka(16.787878d);

        int hasilInt;
        hasilInt = tambah(4,5);
        System.out.println("Penjumlahan integer : ");
        printangka(hasilInt);

        float hasilFlo;
        hasilFlo = tambah(4.5f,3.7f);
        System.out.println("Penjumlahan float : ");
        printangka(hasilFlo);
    }

    private static float tambah(float int1,float int2){
        return int1 + int2;
    }
    private static int tambah(int int1,int int2){
        return int1 + int2;
    }
    private static void printangka(double angka){
        System.out.println("Angka = " + angka);
    }
    private static void printangka(float angka){
        System.out.println("Angka = " + angka);
    }
    private static void printangka (int angka){
        System.out.println("Angka = " + angka);
    }
}
