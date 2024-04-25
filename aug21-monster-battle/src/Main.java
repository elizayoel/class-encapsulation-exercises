import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();
        Monster player = new Monster("Vagabond",100,100,1000);
        int menu = -1;
        while(menu!=4){
            System.out.println("\n1. Battle");
            System.out.println("2. Power up");
            System.out.println("3. Lihat status");
            System.out.println("4. Exit");
            menu = scan.nextInt();

            int nyawa = 5;
            if(menu==1 && nyawa != 0){
                nyawa--;
                System.out.println("Nyawa: " + nyawa);
                System.out.println("BATTLE START");

                Monster musuh = new Monster("Viking",100,100,1000);
                while(musuh.getHP()>0 && player.getHP()>0){
                    System.out.println("\nPLAYER'S TURN");
                    System.out.println("Attack sebesar : " + player.getAtt());
                    System.out.printf("Vagabond\tHP : %d",player.getHP());
                    System.out.println();
                    int newHPMusuh = musuh.getHP()-player.getAtt();

                    if (newHPMusuh<0) newHPMusuh = 0;
                    musuh.setHP(newHPMusuh);

                    System.out.printf("Viking\tHP : %d",musuh.getHP());
                    System.out.println();
                    // jika musuh masih hidup baru bisa serang
                    if(musuh.getHP()>0 ) {
                        System.out.println("MUSUH'S TURN");
                        System.out.println("Attack sebesar : " + musuh.getAtt());
                        int newHPP = player.getHP() - musuh.getAtt();
                        if(newHPP < 0) newHPP = 0;
                        player.setHP(newHPP);
                    }
                    System.out.printf("Vagabond\tHP : %d",player.getHP());
                    System.out.printf("\nViking\tHP : %d",musuh.getHP());
                }
                if(player.getHP()>musuh.getHP()){
                    int manaWin = player.getMana()+300;
                    player.setMana(manaWin);
                    nyawa++;

                    System.out.println("PLAYER WIN");
                    System.out.println("YOU GET +300 MANA AND 1 MORE LIFE");
                    System.out.println("nyawa : " + nyawa);
                    System.out.println("Mana : " + player.getMana());
                }else {
                    System.out.println("YOU LOSE");
                    System.out.println("Nyawa: " + nyawa);
                }

                player.setHP(player.getHPmax());
                musuh.setHP(player.getHPmax());

            } else if (menu == 2){
                int choice;
                System.out.println("1. Power up HP");
                System.out.println("2. Power up Attack");
                System.out.println("Choice: ");
                choice = scan.nextInt();

                if(choice == 1){
                    System.out.println("HP max anda sekarang adalah " + player.getHP());
                    System.out.println("Mana : " + player.getMana());
                    if(player.getMana()>=300) {
                        int hpp = 1 + rnd.nextInt(10);
                        int newhpp = player.getHP() + hpp;
                        player.setHP(newhpp);
                        player.setHPmax(newhpp);
                        int newmana = player.getMana() - 300;
                        player.setMana(newmana);

                        System.out.printf("Anda berhasil power up HP anda sebanyak %d. Total HP anda adalah %d dan Total Mana adalah %d", hpp, player.getHP(), player.getMana());
                    }
                } else if (choice == 2){
                    System.out.println("attack power sekarang : " + player.getAtt());
                    System.out.println("Mana : " + player.getMana());
                    if(player.getMana()>=400) {
                        int natt = 1 + rnd.nextInt(3);
                        int newatt = player.getAtt() + natt;
                        player.setAtt(newatt);

                        int newmana = player.getMana() - 400;
                        player.setMana(newmana);

                        System.out.printf("Anda berhasil power up attack anda sebanyak %d. Total attack power anda adalah %d dan Total Mana adalah %d", natt, player.getAtt(), player.getMana());
                    } else {
                        System.out.println("Mana anda tidak mencukupi");
                    }
                }
            } else if (menu == 3){
                player.cetak();
            }
        }
    }
}

class Monster
{
    private String jenis;
    private int hp, hpmax, att, mana;
    Random rnd = new Random();
    public Monster(){
        jenis = "";
        hp = 0;
        hpmax = 0;
        att = 0;
        mana = 0;
    }

    public Monster(String jns, int hp, int hpmax, int mana){
        this.jenis = jns;
        this.hp = hp;
        this.hpmax = hpmax;
        if(jns.equalsIgnoreCase("Vagabond")){
            this.att = 6 + rnd.nextInt(5);
        }else{
            this.att = 5 + rnd.nextInt(5);
        }
        this.mana = mana;
    }
    public int getHP(){
        return hp;
    }
    public int getHPmax(){
        return hpmax;
    }
    public int getAtt(){
        return att;
    }
    public int getMana(){
        return mana;
    }
    public void setHP(int brp){
        hp = brp;
    }
    public void setHPmax(int brp){
        hpmax = brp;
    }
    public void setAtt(int brp){
        att = brp;
    }
    public void setMana(int brp){
        mana = brp;
    }
    public void cetak(){
        System.out.println("Monster jenis\t: " + jenis);
        System.out.println("HP\t\t\t: " + hp);
        System.out.println("Max HP\t\t: " + hpmax);
        System.out.println("Attack\t\t: " + att);
        System.out.println("Mana\t\t: " + mana);
    }
}