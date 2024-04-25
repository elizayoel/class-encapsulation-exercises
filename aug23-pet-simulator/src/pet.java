import java.util.Random;

class pet {
    Random rand = new Random();
    private String nama;
    private int umur;
    private int berat;
    private String hungry;
    private String clean;
    private String health;
    private String mood;
    private int jumlahmakan;
    private int hari;
    private int noShower;
    private int sickday;

    /*public pet(){
        nama = "";
        umur = 0;
        berat = 0;
        hungry = "";
        clean = "";
        health = "";
        mood = "";
        jumlahmakan = 0;
        brpHariGaMandi = 0;
        brpHariSakit = 0;
    }*/
    public pet(String nm){
        this.nama = nm;
        this.umur = 1;
        this.berat = 4 + rand.nextInt(4);
        this.hungry = "";
        this.clean = "";
        this.health = "";
        this.mood = "";
        this.jumlahmakan = 0;
        this.hari = 1;
        this.noShower = 0;
        this.sickday = 0;
    }

    public void display(){
        System.out.println();
        System.out.println("Nama\t: " + nama);
        System.out.println("Umur\t: " + umur + " hari");
        System.out.println("Berat\t: " + berat + " kg");
        System.out.println("Hungry\t: " + hungry);
        System.out.println("Clean\t: " + clean);
        System.out.println("Health\t: " + health);
        System.out.println("Mood\t: " + mood);
    }

    public void setSickday(int brp){
        this.sickday = brp;
    }
    public void setNoShower(int brp){
        this.noShower = brp;
    }
    public void setUmur(int brp){
        this.umur = brp;
    }
    public void setHungry(String apa){
        this.hungry = apa;
    }
    public void setJumlahMakan(int brp){
        this.jumlahmakan = brp;
    }
    public void setClean(String apa){
        this.clean = apa;
    }
    public void setMood(String apa){
        this.mood = apa;
    }
    public void setHealth(String apa){
        this.health = apa;
    }
    public void setBerat(int brp){
        this.berat = brp;
    }


    public String getNama(){
        return nama;
    }
    public int getUmur(){
        return umur;
    }
    public int getBerat(){
        return berat;
    }
    public int getJumlahMakan(){
        return jumlahmakan;
    }
    public String getHungry(){
        return hungry;
    }
    public String getClean(){
        return clean;
    }
    public String getHealth(){
        return health;
    }
    public int getNoShower(){
        return noShower;
    }
    public int getSickday(){
        return sickday;
    }
}
