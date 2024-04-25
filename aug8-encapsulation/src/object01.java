public class object01 {
    public static void main(String[] args){
        Person a = new Person();
        // cara memanggil MUTATOR
        a.setNama("Budi");
        a.setKota("Semarang");
        a.setUmur(12);
        a.setJenjang("SMA");
        a.setGender("Male");

        // cara memanggil ACCESSOR
        System.out.println("Nama " + a.getNama());
        System.out.println("Kota " + a.getKota());
        System.out.println("Umur " + a.getUmur());
        System.out.println("Jenjang " + a.getJenjang());
        System.out.println("Gender " + a.getGender());
        System.out.println("----------------------------");

        a.printData();
    }
}

// ENCAPSULATION = pengkapsulan antara attribute dan method
// public class cuma satu, sisanya class" aja

class Person // template cetakan object
{
    // private -> hanya bisa diakses oleh class ini sendiri
    // attribute
    private String nama;
    private String kota;
    private int umur;
    private String gender;
    private String jenjang;

    // method
    // 1. SETTER = MUTATOR
    //    public -> bisa diakses diluar class
    public void setNama(String nama) {
        this.nama = nama;
        // this dipakai untuk membedakan variable nama (karena String nama)
    }
    public void setKota(String kota) {
        this.kota = kota;
    }
    public void setUmur(int age) {
        this.umur = age;
    }
    public void setGender(String gen) {
        gender = gen;
        // tidak perlu pakai this karena namanya beda
    }

    public void setJenjang(String jjg) {
        jenjang = jjg;
    }

    // 2. GETTER = ACCESSOR
    public String getNama(){
        return this.nama;
    }
    public String getKota(){
        return kota;
    }
    public int getUmur(){
        return this.umur;
    }
    public String getGender(){
        return this.gender;
    }
    public String getJenjang(){
        return this.jenjang;
    }
    public void printData(){
        System.out.println("Nama   : " + this.nama);
        System.out.println("Kota   : " + this.kota);
        System.out.println("Jenjang: " + this.jenjang);
        System.out.println("Umur   : " + this.umur);
        System.out.println("Gender : " + this.gender);
    }
}



