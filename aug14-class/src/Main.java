// MEMBUAT CLASS SEBAGAI TEMPLATE
class Mahasiswa {
    String nama;
    String TPnumber;
    String course;
    double GPA;
    int age;
}

public class Main {
    public static void main(String[] args) {

        // INITIATE / MEMBUAT OBJECT
        // Class_Type Object_Name = new Class_Type
        Mahasiswa mahasiswa1 = new Mahasiswa();

        // bisa masukkan template ke objectnya
        mahasiswa1.nama = "eliza";
        mahasiswa1.TPnumber = "TP068341";
        mahasiswa1.course = "Data Analytics";
        mahasiswa1.GPA = 4.0;
        mahasiswa1.age = 18;

        System.out.println(mahasiswa1.nama);
        System.out.println(mahasiswa1.TPnumber);
        System.out.println(mahasiswa1.course);
        System.out.println(mahasiswa1.GPA);
        System.out.println(mahasiswa1.age);

        Mahasiswa mahasiswa2 = new Mahasiswa();

        mahasiswa2.nama = "kayla";
        mahasiswa2.TPnumber = "TP068341";
        mahasiswa2.course = "Data Analytics";
        mahasiswa2.GPA = 4.0;
        mahasiswa2.age = 12;

        System.out.println(mahasiswa2.nama);
        System.out.println(mahasiswa2.TPnumber);
        System.out.println(mahasiswa2.course);
        System.out.println(mahasiswa2.GPA);
        System.out.println(mahasiswa2.age);
    }
}
