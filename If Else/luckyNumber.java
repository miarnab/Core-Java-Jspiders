import java.io.*;

public class luckyNumber {
    public static void main(String args[])throws IOException{
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.println("Enter the number");
        int number = Integer.parseInt(br.readLine());
        if(number%5==0){
            System.out.println("Lucky Number");
        }
        else{
            System.out.println("Not a Lucky Number");
        }
    }
}
