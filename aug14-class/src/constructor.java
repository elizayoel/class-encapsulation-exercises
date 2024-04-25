
// CLASS DENGAN CONSTRUCTOR
class student {
    String name;
    String tp;
    String course;

    // CONSTRUCTOR = NAMA CLASS ()
    student() {
        System.out.println("Ini adalah constructor"); //dipanggil pertama kali saat object dibuat
    }
}

class stud {
    String name;
    String tp;
    String course;

    stud(String inputNama, String inputTP, String inputCourse){
        name = inputNama; // kalau namanya sama gapapa
        tp = inputTP;
        course = inputCourse;

        System.out.println(name);
        System.out.println(tp);
        System.out.println(course);
    }
}

public class constructor {
    public static void main(String[] args) {
        student student1 = new student(); // new student(); sudah jadi object, lalu ditangkap sama student1
        // proses pembuatan object akan langsung memanggil constructor nya
        new student(); // sudah jadi object, tapi tidak ditangkap oleh variabel
        // maka akan tetap dijalankan

        stud stud1 = new stud ("eliza","TP068341","DA"); // jadi ga perlu masukin student.nama = "eliza";
        stud stud2 = new stud("eliana","TP123123","DA");

        System.out.println(stud1.name); // supaya ga perlu sebutin satu satu, langsung masukin print nya di bagian constructor
        // constructor akan selalu dipanggil saat object nya dibuat
    }
}
