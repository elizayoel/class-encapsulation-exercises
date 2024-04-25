import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanInt = new Scanner(System.in);
        Scanner scanStr = new Scanner(System.in);

        int uang = 500;
        int hari = 1;
        int menu = -1; // random angka yg penting bukan exit

        Plant [] p = new Plant[100]; // array khusus plant
        Plant [] a = new Plant[100]; // array animal

        int n = 0 ; // index tanaman
        int m = 0; // index hewan

        while (menu != 5){
            System.out.println("Uang\t: " + uang);
            System.out.println("Hari\t: " + hari);
            System.out.println("Menu\t: ");
            System.out.println("1. Lihat Kebun");
            System.out.println("2. Lihat Barn");
            System.out.println("3. Lihat Status");
            System.out.println("4. Ganti Hari");
            System.out.println("5. Exit");

            menu = scanInt.nextInt();

            if (menu == 1){
                int choice = 0;
                System.out.println("1. Tanam");
                System.out.println("2. Siram");
                System.out.println("3. Jual Tanaman");
                System.out.println("4. Kembali ke menu utama");
                choice = scanInt.nextInt();

                if (choice == 1){ // tanam
                    String nama = "";
                    String code = "";

                    System.out.println("Masukkan jenis tanaman:");
                    nama = scanStr.nextLine();

                    System.out.println("Kode tanaman: ");
                    code = scanStr.nextLine();

                    // buat tanaman, masuk ke array pertama, lsg masuk ke constructor
                    p[n] = new Plant(nama,code);
                    // dicek dulu uang cukup atau ga
                    if(uang-p[n].getBeli() >= 0){
                        uang = uang - p[n].getBeli();
                        n++;
                    } else{ // kalau uang ga cukup, n ga nambah, jadi isinya ga diterima di array
                        System.out.println("Saldo uang tidak mencukupi");
                    }

                }
                else if (choice == 2){
                    // siram semua tanaman yang ada dalam array
                    for (int i = 0; i < n; i++) {
                        p[i].setSiram("yes");
                    }
                }
                else if (choice == 3){
                    String code = "";
                    System.out.println("Masukkan code hewan/tumbuhan yang mau dijual: ");
                    code = scanStr.nextLine();

                    for (int i = 0; i < n; i++) {
                        // ambil code melalui getCode, lalu dilooping
                        // cek per arraynya
                        if(code.equalsIgnoreCase(p[i].getCode())){
                            if(p[i].isDewasa()){
                                uang = uang + p[i].getJual();
                                for (int j = n-1 ; j>=0 ; j--) {
                                    for (int k = j; k < n - 1; k++) {
                                        p[k] = p[k + 1];
                                    }
                                }
                                n--; // array dihapus sebiji
                                System.out.println("Tanaman telah terjual, saldo uang sekarang adalah " + uang);
                            } else {
                                System.out.println("Tanaman tidak bisa dijual karena belum dewasa");
                            }
                        }
                    }
                }
                else if (choice == 4){
                }
                else {
                    System.out.println("Invalid choice");
                }
            }
            else if (menu == 2){
                int choice = 0;
                System.out.println("1. Beli Hewan");
                System.out.println("2. Beri Makan");
                System.out.println("3. Jual Hewan");
                System.out.println("4. Kembali ke menu utama");
                choice = scanInt.nextInt();

                if(choice == 1){
                    System.out.println("Inputkan jenis hewan: ");
                    String nama = scanStr.nextLine();
                    System.out.println("Code hewan: ");
                    String code = scanStr.nextLine();

                    // masukin ke array
                    a[m] = new Plant(nama,code);
                    if(uang >= a[m].getBeli()){
                        // uang dikurang harga beli
                        uang = uang - a[m].getBeli();
                        m++;
                    } else {
                        System.out.println("Saldo uang tidak cukup");
                    }
                }
                else if(choice == 2){
                    for (int i = 0; i < m; i++) {
                        a[m].setSiram("yes");
                    }
                }
                else if(choice == 3){

                }
            }
            else if (menu == 3){
                int choice = 0;
                System.out.println("1. Lihat Status Tanaman");
                System.out.println("2. Lihat Status Hewan");
                System.out.println("3. Kembali ke menu utama");
                choice = scanInt.nextInt();

                if(choice==1){
                    for (int i = 0; i < n; i++) {
                        p[i].display();
                    }
                }
                else if(choice==2){
                    for (int i = 0; i < m; i++) {
                        a[i].display();
                    }
                }
            }
            else if (menu == 4){
                hari++;
                // kalau sudah disiram dan ganti hari, baru bisa nambah umur

                for (int i = 0; i < n; i++) {
                    // kalau tanaman sudah disiram baru bisa tambah umur
                    if(p[i].getSiram().equalsIgnoreCase("yes")) {
                        int umurtambah = p[i].getUmur() + 1;
                        p[i].setUmur(umurtambah);
                    }
                    // kalau belum disiram, umur ga nambah
                }
                for (int i = 0; i < m; i++) {
                    // kalau hewan sudah dikasi makan baru bisa tambah umur
                    if(p[i].getSiram().equalsIgnoreCase("yes")) {
                        int umurtambah = a[i].getUmur() + 1;
                        a[i].setUmur(umurtambah);
                    }
                }
            }
        }
    }
}
