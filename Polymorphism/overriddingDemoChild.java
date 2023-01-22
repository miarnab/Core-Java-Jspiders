public class overriddingDemoChild extends overriddingDemoParent{
    public void test(){
        System.out.println("From Child");
    }
    public static void main(String args[]){
        overriddingDemoChild child = new overriddingDemoChild();
        overriddingDemoParent parent = new overriddingDemoParent();
        child.test();
        parent.test();
    }
}
