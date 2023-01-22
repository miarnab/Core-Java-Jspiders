public class Demo2 {
    public static void main(String ram[]){
        int i = 11;
        long j = 12l;
        ram(j,i);
    }
    public static void ram(long j, int i){
        System.out.println(j++);
        System.out.println(i++);
    }
}
