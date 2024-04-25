
import java.util.Scanner;

public class object02 {
    public static void main(String[] args){
        int menu = 1;
        Scanner scanInt = new Scanner(System.in);
        Scanner scanStr = new Scanner(System.in);

        //ARRAY
        Person2 [] p = new Person2 [100];

        int n = 0;
        while(menu!=0){
            System.out.println("1. Input person data");
            System.out.println("2. Update data based on index");
            System.out.println("3. Delete data");
            System.out.println("4. Print data");
            System.out.println("5. Update data based on name");
            System.out.println("6. Delete data based on name");
            System.out.println("0. Exit");
            System.out.println("Choice: ");
            menu = scanInt.nextInt();

            if (menu == 1) {
                p[n] = new Person2();
                System.out.println("BIODATA INPUT");

                System.out.println("Nama : ");
                String nama = scanStr.nextLine();
                p[n].setNama(nama);

                System.out.println("Kota : ");
                String kota = scanStr.nextLine();
                p[n].setKota(kota);

                System.out.println("Umur : ");
                int umur = scanInt.nextInt();
                p[n].setUmur(umur);

                System.out.println("Jenjang :");
                String jenjang = scanStr.nextLine();
                p[n].setJenjang(jenjang);

                System.out.println("Gender : ");
                String gender = scanStr.nextLine();
                p[n].setGender(gender);

                n++;
                System.out.println("Sukses Input Data");
            }
            else if (menu == 2) {
                System.out.println("Enter index to update (0 -" + (n-1) + ") : ");
                int index = scanInt.nextInt();

                if (index >= 0 && index < n) {
                    System.out.println("UPDATE BIODATA FOR INDEX " +index);
                    System.out.println("Nama : ");
                    String nama = scanStr.nextLine();
                    p[index].setNama(nama);

                    System.out.println("Kota : ");
                    String kota = scanStr.nextLine();
                    p[index].setKota(kota);

                    System.out.println("Umur : ");
                    int umur = scanInt.nextInt();
                    p[index].setUmur(umur);

                    System.out.println("Jenjang :");
                    String jenjang = scanStr.nextLine();
                    p[index].setJenjang(jenjang);

                    System.out.println("Gender : ");
                    String gender = scanStr.nextLine();
                    p[index].setGender(gender);

                    System.out.println("Sukses Update Data");
                }
                else {
                    System.out.println("Invalid index");
                }
            }
            else if (menu == 3) {
                System.out.println("Enter index to delete (0-" + (n-1) + ") :");
                int idx = scanInt.nextInt();
                
                if(idx >= 0 && idx < n){
                    for (int i = idx; i < n-1 ; i++) {
                        p[i] = p[i+1];
                    }
                    n--;
                    System.out.println("Sukses Delete Data");
                }
            }
            else if (menu == 4) {
                System.out.println("1. Print Semua Data");
                System.out.println("2. Print Sesuai Index");
                int opt = 0;
                opt = scanInt.nextInt();
                if (opt == 1){
                    for (int i = 0; i < n; i++) {
                        // cara memanggil ACCESSOR
                        System.out.println("BIODATA KE-" + (i+1));
                        System.out.println("Nama " + p[i].getNama());
                        System.out.println("Kota " + p[i].getKota());
                        System.out.println("Umur " + p[i].getUmur());
                        System.out.println("Jenjang " + p[i].getJenjang());
                        System.out.println("Gender " + p[i].getGender());
                        System.out.println("----------------------------");
                    }
                }
                else if (opt == 2){
                    System.out.println("Enter index: ");
                    int idx = scanInt.nextInt();
                    for (int i = 0; i < n; i++) {
                        if (i == idx){
                            System.out.println("BIODATA KE-" + (i+1));
                            System.out.println("Nama " + p[i].getNama());
                            System.out.println("Kota " + p[i].getKota());
                            System.out.println("Umur " + p[i].getUmur());
                            System.out.println("Jenjang " + p[i].getJenjang());
                            System.out.println("Gender " + p[i].getGender());
                            System.out.println("----------------------------");
                        }
                    }
                }
                else {
                    System.out.println("Invalid choice");
                }
            }
            else if (menu == 5) {
                System.out.println("Enter name : ");
                String nama = scanStr.nextLine();

                for (int i = 0; i < n; i++) {
                    if(p[i].getNama().equalsIgnoreCase(nama)){
                        System.out.println("Updating data for " + nama);
                        System.out.println("Nama : ");
                        nama = scanStr.nextLine();
                        p[i].setNama(nama);

                        System.out.println("Kota : ");
                        String kota = scanStr.nextLine();
                        p[i].setKota(kota);

                        System.out.println("Umur : ");
                        int umur = scanInt.nextInt();
                        p[i].setUmur(umur);

                        System.out.println("Jenjang :");
                        String jenjang = scanStr.nextLine();
                        p[i].setJenjang(jenjang);

                        System.out.println("Gender : ");
                        String gender = scanStr.nextLine();
                        p[i].setGender(gender);

                    }
                    System.out.println("Sukses Update Data");
                }
            }
            else if (menu == 6){
                System.out.println("Enter name : ");
                String nama = scanStr.nextLine();

                for (int i = 0; i < n; i++) {
                    if (p[i].getNama().equalsIgnoreCase(nama)) {
                        for (int j = i; j < n-1 ; i++) {
                            p[j] = p[j+1];
                        }
                        n--;
                        System.out.println("Data has been deleted");
                        break;// bcs dont need to continue searching
                    }
                }
            }
        }
    }
}

// ENCAPSULATION = pengkapsulan antara attribute dan method
// public class cuma satu, sisanya class" aja

class Person2 // template cetakan object
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



