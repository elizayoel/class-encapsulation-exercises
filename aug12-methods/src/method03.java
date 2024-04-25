public class method03 {
    public static void main(String[] args) {
        int x = 3;
        int y = 4;

        int z = add(x,y); // WE CAN DECLARE VARIABLE TWICE IN DIFFERENT METHOD
        System.out.println(z);
        System.out.println(add(x,y));
    }
    static int add(int x , int y){
        int z = x + y;
        return z;
    }
}
