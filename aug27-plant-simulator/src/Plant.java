public class Plant {
    private String nama;
    private String code;
    private int dewasa;
    private int harga;
    private int jual;
    private int umur;
    private String siram;

    // constructor
    public Plant (String nm, String code){
        this.nama = nm;
        this.code = code;

        if(nm.equalsIgnoreCase("sawi")){
            this.dewasa = 2;
            this.harga = 20;
            this.jual = 100;
        } else if(nm.equalsIgnoreCase("kangkung")){
            this.dewasa = 1;
            this.harga = 30;
            this.jual = 150;
        } else if (nm.equalsIgnoreCase("tomat")) {
            this.dewasa = 3;
            this.harga = 50;
            this.jual = 300;
        } else if(nm.equalsIgnoreCase("sapi")){
            this.dewasa = 3;
            this.harga = 200;
            this.jual = 1000;
        } else if(nm.equalsIgnoreCase("kambing")){
            this.dewasa = 2;
            this.harga = 300;
            this.jual = 1500;
        } else if(nm.equalsIgnoreCase("ayam")){
            this.dewasa = 1;
            this.harga = 450;
            this.jual = 3000;
        }
        this.umur = 0;
        this.siram = "";
    }

    public void display(){
        System.out.println();
        System.out.println("Nama\t: " + nama);
        System.out.println("Kode\t: " + code);
        System.out.println("Dewasa\t: " + dewasa + " hari");
        System.out.println("Harga beli\t: " + harga);
        System.out.println("Jual\t: " + jual);
        System.out.println("Umur\t: " + umur + " hari");
    }

    public void setUmur (int brp){
        this.umur = brp;
    }
    public void setSiram (String apa){
        this.siram = apa;
    }

    public boolean isDewasa(){
        if(umur >= dewasa){
            return true;
        } else{
            return false;
        }
    }
    public String getNama(){
        return nama;
    }
    public String getCode(){
        return code;
    }
    public int getDewasa(){
        return dewasa;
    }
    public int getBeli(){
        return harga;
    }
    public int getJual(){
        return jual;
    }
    public int getUmur(){
        return umur;
    }
    public String getSiram(){
        return siram;
    }
}
