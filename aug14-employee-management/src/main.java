import java.util.ArrayList;
import java.util.Scanner;

/*
nama, bulan, tahun, gender, gajipokok

1. input data pegawai
2. cetak data pegawai
3. ubah data pegawai
4. delete data pegawai berdasarkan nama
5. delete data pegawai berdasarkan bulan lahir
6. cetak data pegawai yang lahir tahun diinputkan
7. cetak data pegawai yang gapok > angka tertentu
0. exit
 */

public class main {
    public static void main(String[] args) {
        int menu = 1; // angka random
        Scanner scanInt = new Scanner(System.in);
        Scanner scanStr = new Scanner(System.in);
        Scanner scanDou = new Scanner(System.in);

        // ARRAY
        pegawai [] p = new pegawai [100];

        int n = 0; // untuk looping nya
        while(menu!=0){
            System.out.println("1. input data pegawai");
            System.out.println("2. cetak data pegawai");
            System.out.println("3. ubah data pegawai");
            System.out.println("4. delete data pegawai berdasarkan nama");
            System.out.println("5. delete data pegawai berdasarkan bulan lahir");
            System.out.println("6. cetak data pegawai yang lahir pada tahun yang diinputkan");
            System.out.println("7. cetak data pegawai yang gaji pokok > angka tertentu");
            System.out.println("8. cetak data berdasarkan gender");
            System.out.println("9. cetak data berdasarkan gaji pokok ascending");
            System.out.println("10.cetak data berdasarkan umur descending");
            System.out.println("0. exit");
            System.out.println("PILIHAN : ");
            menu = scanInt.nextInt();

            if(menu == 1){
                p[n] = new pegawai();
                System.out.println("INPUT BIODATA PEGAWAI");
                System.out.println("Nama : ");
                String nama = scanStr.nextLine();
                p[n].setNama(nama);

                System.out.println("Bulan : ");
                String bulan = scanStr.nextLine();
                p[n].setBulan(bulan);

                System.out.println("Tahun :");
                int tahun = scanInt.nextInt();
                p[n].setTahun(tahun);

                System.out.println("Gender : ");
                String gender = scanStr.nextLine();
                p[n].setGender(gender);

                System.out.println("Gaji pokok : ");
                double gajipokok = scanDou.nextDouble();
                p[n].setGaji(gajipokok);

                n++;
                System.out.println("Sukses input data");
            }
            else if(menu == 2){
                for (int i = 0; i < n; i++) {
                    System.out.println("BIODATA KE - " + (i+1));
                    System.out.println("Nama : " + p[i].getNama());
                    System.out.println("Bulan : " + p[i].getBulan());
                    System.out.println("Tahun : " + p[i].getTahun());
                    System.out.println("Gender : " + p[i].getGender());
                    System.out.println("Gaji pokok : " + p[i].getGaji());
                    System.out.println("--------------------------------");
                }
            }
            else if(menu == 3){
                System.out.println("Masukkan index data yang mau diganti : ");
                int index = scanInt.nextInt();

                if (index >= 0 && index < n){
                    System.out.println("UPDATE BIODATA UNTUK INDEX " + index);
                    System.out.println("Nama : ");
                    String nama = scanStr.nextLine();
                    p[index].setNama(nama);

                    System.out.println("Bulan : ");
                    String bulan = scanStr.nextLine();
                    p[index].setBulan(bulan);

                    System.out.println("Tahun :");
                    int tahun = scanInt.nextInt();
                    p[index].setTahun(tahun);

                    System.out.println("Gender : ");
                    String gender = scanStr.nextLine();
                    p[index].setGender(gender);

                    System.out.println("Gaji pokok : ");
                    double gajipokok = scanDou.nextDouble();
                    p[index].setGaji(gajipokok);

                    System.out.println("SUKSES UPDATE DATA");
                }
            }
            else if(menu == 4){
                // delete data pegawai berdasarkan nama
                System.out.println("DELETE DATA BERDASARKAN NAMA");
                System.out.println("Enter nama yang ingin dihapus: ");
                String nd = scanStr.nextLine();

                for (int i = 0; i < n; i++) {
                    if(p[i].getNama().equalsIgnoreCase(nd)){
                        for (int j = 0; j < n-1; j++) {
                            p[j] = p[j+1];
                        }
                        n--;
                        System.out.println("DATA SUKSES DIHAPUS");
                        break; //supaya tidak lanjut searching
                    }
                }
            }
            else if(menu == 5){
                System.out.println("DELETE DATA BERDASARKAN BULAN LAHIR");
                System.out.println("Enter bulan yang ingin dihapus : ");
                String bd = scanStr.nextLine();

                for (int i = n-1; i >= 0; i--) {
                    if(p[i].getBulan().equalsIgnoreCase(bd)){
                        for (int j = i; j< n-1; j++) {
                            p[j] = p[j+1];
                        }
                        n--;
                        System.out.println("DATA SUKSES DIHAPUS");
                        break;
                    }
                }
            }
            else if(menu == 6){
                System.out.println("CETAK DATA BERDASARKAN INPUT TAHUN LAHIR");
                System.out.println("Enter tahun lahir : ");
                int ct = scanInt.nextInt();

                for (int i = 0; i < n; i++) {
                    if (p[i].getTahun() == ct){
                        System.out.println("Nama : " + p[i].getNama());
                        System.out.println("Bulan : " + p[i].getBulan());
                        System.out.println("Tahun : " + p[i].getTahun());
                        System.out.println("Gender : " + p[i].getGender());
                        System.out.println("Gaji pokok : " + p[i].getGaji());
                    }
                }
            }
            else if(menu == 7){
                System.out.println("CETAK DATA BERDASARKAN GAJI > INPUT");
                System.out.println("Masukkan nilai minimum gaji :");
                double cg = scanDou.nextDouble();
                for (int i = 0; i < n; i++) {
                    if(p[i].getGaji() > cg){
                        System.out.println("Nama : " + p[i].getNama());
                        System.out.println("Bulan : " + p[i].getBulan());
                        System.out.println("Tahun : " + p[i].getTahun());
                        System.out.println("Gender : " + p[i].getGender());
                        System.out.println("Gaji pokok : " + p[i].getGaji());
                    }
                }
            }
            else if(menu == 8){
                System.out.println("CETAK DATA BERDASARKAN PENGELOMPOKAN GENDER");
                ArrayList<pegawai> femaleEm = new ArrayList<>();
                ArrayList<pegawai> maleEm = new ArrayList<>();

                for (int i = 0; i < n; i++) {
                    if(p[i].getGender().equalsIgnoreCase("female")){
                        femaleEm.add(p[i]);
                    }
                    else if(p[i].getGender().equalsIgnoreCase("male")){
                        maleEm.add(p[i]);
                    }
                }

                System.out.println("FEMALE: ");
                for (int i = 0; i < femaleEm.size(); i++) {
                    System.out.println("Biodata ke -" + (i+1));
                    System.out.println(femaleEm.get(i).getNama());
                    System.out.println(femaleEm.get(i).getBulan());
                    System.out.println(femaleEm.get(i).getTahun());
                    System.out.println(femaleEm.get(i).getGender());
                    System.out.println(femaleEm.get(i).getGaji());
                }

                System.out.println("----------------------------------");
                System.out.println("MALE: ");
                for (int i = 0; i < maleEm.size(); i++) {
                    System.out.println("Biodata ke -" + (i+1));
                    System.out.println(maleEm.get(i).getNama());
                    System.out.println(maleEm.get(i).getBulan());
                    System.out.println(maleEm.get(i).getTahun());
                    System.out.println(maleEm.get(i).getGender());
                    System.out.println(maleEm.get(i).getGaji());
                }
            }
            else if (menu == 9){
                for (int i = 0; i < n-1; i++) {
                    for (int j = i+1; j < n; j++) {
                        if(p[i].getGaji()>p[j].getGaji()){
                            pegawai temp = p[i];
                            p[i] = p[j];
                            p[j] = temp;
                        }
                    }
                }
                for (int i = 0; i < n; i++) {
                    System.out.println("Nama : " + p[i].getNama());
                    System.out.println("Bulan : " + p[i].getBulan());
                    System.out.println("Tahun : " + p[i].getTahun());
                    System.out.println("Gender : " + p[i].getGender());
                    System.out.println("Gaji pokok : " + p[i].getGaji());
                }
            }
            else if(menu == 10){
                for (int i = 0; i < n-1; i++) {
                    for (int j = i+1; j < n; j++) {
                        if(p[i].getUmur() > p[j].getUmur()){
                            pegawai temp = p[i];
                            p[i] = p[j];
                            p[j] = temp;
                        }
                    }
                }
                for (int i = 0; i < n; i++) {
                    System.out.println("Nama : " + p[i].getNama());
                    System.out.println("Bulan : " + p[i].getBulan());
                    System.out.println("Tahun : " + p[i].getTahun());
                    System.out.println("Gender : " + p[i].getGender());
                    System.out.println("Gaji pokok : " + p[i].getGaji());
                }
            }
        }
    }
}

class pegawai {
    // ATTRIBUTE
    private String nama;
    private String bulan;
    private int tahun;
    private String gender;
    private double gajipokok;

    public void setNama (String inputNama){
        nama = inputNama;
    }
    public void setBulan (String inputBulan){
        bulan = inputBulan;
    }
    public void setTahun (int inputTahun){
        tahun = inputTahun;
    }
    public void setGender (String inputGender){
        gender = inputGender;
    }
    public void setGaji (double gaji){
        gajipokok = gaji;
    }


    public String getNama (){
        return this.nama;
    }
    public String getBulan(){
        return this.bulan;
    }
    public int getTahun(){
        return this.tahun;
    }
    public String getGender(){
        return this.gender;
    }
    public double getGaji(){
        return this.gajipokok;
    }
    public int getUmur(){
        return 2023-this.tahun;
    }
}
