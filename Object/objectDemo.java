public class objectDemo {
    int a;
    objectDemo(int a){
        this.a = a;
    }
    @Override
    public String toString(){
        return "a: "+a;
    }
    public static void main(String args[]){
        objectDemo demo = new objectDemo(5);
        System.out.println(demo);
    }
}
