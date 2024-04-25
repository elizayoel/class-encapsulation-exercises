import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanInt = new Scanner(System.in);
        Scanner scanStr = new Scanner(System.in);

        int menu = -1;

        pet [] p = new pet[100];
        int n = 0; // untuk looping array

        while(menu!=0){
            System.out.println("1. Lihat Pet ku");
            System.out.println("2. Tambah Pet");
            System.out.println("3. Beri Makan Pet");
            System.out.println("4. Mandikan Pet");
            System.out.println("5. Ganti Hari");
            System.out.println("0. Exit");
            System.out.println("Choice: ");
            menu = scanInt.nextInt();

            if (menu == 1){
                if(n == 0){
                    System.out.println("Belum ada pet, silahkan tambah pet.");
                } else {
                    for (int i = 0; i < n; i++) { // misal ada satu pet, berarti array ke nol, n nya 1, maka < 1
                        System.out.println();
                        System.out.println("PET " + (i+1));
                        p[i].display();
                    }
                }
                /*pet anjing = new pet("Casey");
                anjing.display();*/
            }
            else if (menu == 2){
                System.out.println("Nama\t: ");
                String nama = scanStr.nextLine();
                int ketemu = 0;
                for (int i = 0; i < n; i++) {
                    if(nama.equalsIgnoreCase (p[i].getNama())){
                        System.out.println("Nama sudah digunakan, silahkan masukkan nama baru");
                        ketemu++;
                        break;
                    }
                }
                if(ketemu == 0){
                    p[n] = new pet(nama);
                    n++;
                }
            }
            else if (menu == 3){
                System.out.println("Masukkan nama hewan yang ingin diberi makan : ");
                String nama = scanStr.nextLine();

                boolean foundPet = false;
                if(n == 0){
                    System.out.println("Belum ada pet, silahkan tambah pet");
                }
                else {
                    for (int i = 0; i < n; i++) {
                        if (nama.equalsIgnoreCase(p[i].getNama())) {
                            p[i].setHungry("no");
                            // jumlahmakan++
                            int tambah = p[i].getJumlahMakan() + 1;
                            p[i].setJumlahMakan(tambah);

                            // kalau makan lebih dari dua kali bertambah satu setiap kelebihannya
                            // 3 = +1 4 = +2
                            if (p[i].getJumlahMakan() > 2) {
                                // XXXXX int tambahberat = p[i].getJumlahMakan() - 2;
                                int beratbaru = p[i].getBerat() + 1;
                                p[i].setBerat(beratbaru);
                            }
                            foundPet = true;
                            break;
                        }
                        else{
                            System.out.println("Invalid name");
                        }
                    }
                }
            }
            else if (menu == 4) {
                System.out.println("Masukkan nama hewan yang ingin dimandikan : ");
                String nama = scanStr.nextLine();

                for (int i = 0; i < n; i++) {
                    if (nama.equalsIgnoreCase(p[i].getNama())) {
                        p[i].setClean("yes");
                        // kalau jumlah hari ga mandi lebih besar dr nol, akan dijadikan nol
                        if(p[i].getNoShower() > 0 && p[i].getSickday() > 0){
                            p[i].setNoShower(0);
                            p[i].setSickday(0);
                        }
                        System.out.println("setelah mandi, noShower = " + p[i].getNoShower());
                        p[i].setHealth("healthy");
                    }
                }
            }
            else if (menu == 5){
                System.out.println("Hari telah berganti");

                for (int i = 0; i < n; i++) {
                    // tambah umur
                    int umurtambah = p[i].getUmur()+1;
                    p[i].setUmur(umurtambah);
                    // waktu ganti hari jadi laper lagi
                    p[i].setHungry("yes");
                    // hari baru belom mandi semuanya
                    p[i].setClean("no");

                    // kalau ga dimandiin, jumlah hari ga mandi nambah 1, tapi nanti kalo sudah dimandiin, jumlah hari ga mandinya kurang
                    if(p[i].getClean().equalsIgnoreCase("no")){
                        int nsi = p[i].getNoShower() + 1;
                        p[i].setNoShower(nsi);

                        System.out.println("sebelum mandi, noShower = " + p[i].getNoShower());
                        if(p[i].getNoShower() >= 2){
                            System.out.println("Pet sudah tidak mandi selama " + p[i].getNoShower() + " hari");
                            p[i].setHealth("sick");
                            int nsdi = p[i].getSickday() + 1;
                            p[i].setSickday(nsdi);

                            // kalau sakit lebih dari dua hari
                            if(p[i].getSickday() >= 2) {
                                // pet akan mati -> terhapus
                                System.out.println("Pet telah mati karena sakit selama dua hari");
                                for (int j = n-1 ; j>=0 ; j--) {
                                    for (int k = j; k < n-1 ; k++) {
                                        p[k] = p[k+1];
                                    }
                                    n--; // array dihapus sebiji
                                }
                            } else{
                                p[i].setHealth("healthy");
                            }
                        } else {
                            p[i].setHealth("healthy");
                        }
                    } else {
                        p[i].setHealth("healthy");
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                if(p[i].getHungry().equalsIgnoreCase("yes") && p[i].getClean().equalsIgnoreCase("yes")){
                    p[i].setMood("fine");
                }
                else if(p[i].getHungry().equalsIgnoreCase("yes") && p[i].getClean().equalsIgnoreCase("no")){
                    p[i].setMood("sad");
                }
                else if(p[i].getHungry().equalsIgnoreCase("no") && p[i].getClean().equalsIgnoreCase("yes")){
                    p[i].setMood("happy");
                }
                else if(p[i].getHungry().equalsIgnoreCase("no") && p[i].getClean().equalsIgnoreCase("no")){
                    p[i].setMood("fine");
                }
            }
        }
    }
}
