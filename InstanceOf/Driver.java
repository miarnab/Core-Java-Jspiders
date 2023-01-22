public class Driver {
    public static void main(String args[]){
        Ram ram = new Mala();
        if(ram instanceof Sheela){
            Sheela sheela = (Sheela) ram;
            System.out.println("Belongs to Sheela");
        }
        else if (ram instanceof Mala){
            Mala mala = (Mala) ram;
            System.out.println("Belongs to Mala");
        }
        else {
            Laila laila = (Laila) ram;
            System.out.println("Belongs to Laila");
        }
    }
}
