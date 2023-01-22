public class Demo7 {
    public static void main(String args[]){
        int a = 10;
        int b = 20;
        boolean res = a++ > b && b++ < a;
        System.out.println(res);
        System.out.println(a);
        System.out.println(b);
    }
}
