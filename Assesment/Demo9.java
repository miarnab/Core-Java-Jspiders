public class Demo9 {
    static int a = 20;
    public static void test(){
        System.out.println(a);
    }
    static {
        a = 10;
    }
    public static void main(String args[]){
        int a = 30;
        Demo9.test();
        System.out.println(a);
    }
}
