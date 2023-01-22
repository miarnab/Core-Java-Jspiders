public class Micro extends Cab{
    int numberOfPersons;
    public static void main(String args[]){
        Micro m = new Micro();
        Cab c = m; //Upcasting
        m = (Micro)c; //Downcasting
        System.out.println(m.cabType);
        System.out.println(m.numberOfPersons);
    }
}
