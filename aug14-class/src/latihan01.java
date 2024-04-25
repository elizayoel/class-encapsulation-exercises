
// player
class Player{
    // attributes
    String name;
    double health;
    int level;
    // object member
    Weapon weapon;
    Armor armor;
    // constructor
    Player (String name, double health){
        this.name = name;
        this.health = health;
    }

    void equipWeapon(Weapon weapon){
        this.weapon = weapon;
    }
    void equipArmor(Armor armor){
        this.armor = armor;
    }
    void display(){
        System.out.println("Name : " + this.name);
        System.out.println("Health : " + this.health);
        this.weapon.display();
        this.armor.display();
    }
}

// weapon
class Weapon{
    double attackPower;
    String name;
    // constructor
    Weapon(String name, double attackPower){
        this.name = name;
        this.attackPower = attackPower;
    }
    void display(){
        System.out.println("Weapon : " + this.name + " , attack power : " + this.attackPower);
    }
}

// armor
class Armor{
    double defencePower;
    String name;
    Armor(String name, double defencePower){
        this.name = name;
        this.defencePower = defencePower;
    }
    void display(){
        System.out.println("Armor : " + this.name + " , defence power : " + this.defencePower);
    }
}

public class latihan01 {
    public static void main(String[] args) {
        // membuat object player
        Player player1 = new Player("ucup",100);
        // membuat object weapon
        Weapon pedang = new Weapon ("pedang",15);
        // armor
        Armor bajubesi = new Armor("baju besi" , 10);

        // equip senjata dan armor
        player1.equipWeapon(pedang);
        player1.weapon.display();

        player1.equipArmor(bajubesi);
        player1.armor.display();

        player1.display();
    }
}
