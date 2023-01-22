import java.io.*;
public class largestNumber {
    public static void main(String args[])throws IOException{
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.println("Enter the three numbers");
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        if(a>b && a>c){
            System.out.println("Largest Number is:"+a);
        }
        else if(b>c){
            System.out.println("Largest Number is:"+b);
        }
        else{
            System.out.println("Largest Number is:"+c);
        }
    }
}
