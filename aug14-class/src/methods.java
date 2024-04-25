
class murid{
    String nama;
    String NIM;

    // constructor
    murid(String nama, String inputNIM){
        this.nama = nama;
        NIM = inputNIM;

        System.out.println(nama);
        System.out.println(NIM);
    }

    // method tanpa return dan parameter
    void show(){
        System.out.println("Nama : " + this.nama);
        System.out.println("TP : "+ this.NIM);
    }

    // method tanpa return dengan parameter
    void setNama(String nama){
        this.nama = nama;
    }

    //method return tanpa parameter
    String getNama(){
        return this.nama;
    }
    String getNIM(){
        return this.NIM;
    }

    // method dengan return dan parameter
    String sayHi (String message){
        return "halo " + message;
    }
}

class dosen {
    String nama;

    // constructor
    dosen(String nama){
        this.nama = nama;
    }
}
public class methods {
    public static void main(String[] args) {
        murid murid1 = new murid("eliza","TP100");
        // CONSTRUCTOR adalah METHOD khusus yang akan dipanggil ketika kita membuat object
        test();
        murid1.show();
        murid1.setNama("nama baru");
        murid1.show();

        System.out.println(murid1.getNama());
        System.out.println(murid1.getNIM());

        String data = murid1.sayHi("eliza");
        System.out.println(data);

        dosen dosen1 = new dosen("pak wawan");

    }
    // biasanya kita buat method disini (di dalam main)
    static void test(){ // AKAN DIPANGGIL OLEH MAIN
        System.out.println("TESTING");
    }
}
