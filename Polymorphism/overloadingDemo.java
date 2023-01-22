public class overloadingDemo {
    public static int add(int a, int b){
        return a+b;
    }
    public static int add(int a, int b, int c){
        return a+b+c;
    }
//    public static float add(float a, int b){
//        return a+b;
//    }
    public static void main(String args[]){
        overloadingDemo demo = new overloadingDemo();
        System.out.println(demo.add(2,3));
        System.out.println(demo.add(5,6,7));
//        System.out.println(demo.add(3.0,8));
    }
}
