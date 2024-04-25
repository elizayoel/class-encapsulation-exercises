public class main {
    public static void main(String[] args){
        //void = tidak mengembalikan nilai, tipe data kosong
        int y, x;

        x = 10;
        y = hitung(x);
        System.out.println("x = " + x + " y =" + y);

        x = 5;
        y = hitung(x);
        System.out.println("x = " + x + " y =" + y);

        x = 2;
        y = hitung(x);
        System.out.println("x = " + x + " y = " + y);

        System.out.println(simple());
        fungsiVoid("halo");
    }
    static int hitung(int input){
        int hasil;
        hasil = (input+2)*input;
        return hasil;
    }

    private static void fungsiVoid(String input){
        //fungsi/method tanpa kembalian
        //hanya melakukan aksi
        System.out.println(input);
    }
    private static float simple(){
        return 10.0f;
    }

    /*
    int hitung (int input){
        int hasil;
        hasil = (input + 2) * input;
        return hasil;
    }
    ERROR KARENA DI PSVM ADA STATIC
    */





}
