import java.io.*;
public class calculation {
    public static void main(String args[])throws IOException{
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.println("Enter the two numbers");
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        System.out.println("1. Add\n2. Subtract\n3. Multiply\n4. Divide");
        System.out.println("Enter the user's choice");
        int choice = Integer.parseInt(br.readLine());
        switch (choice)
        {
            case 1:int sum = 0;
                    sum = a+b;
                    System.out.println("Addition = "+sum);
                    break;
            case 2:int diff = 0;
                    if(a>b){
                        diff = a-b;
                        System.out.println("Subtraction = "+diff);
                    }
                    else {
                        diff = b-a;
                        System.out.println("Subtraction = "+diff);
                    }
                    break;
            case 3:int prod = 1;
                    prod = a*b;
                    System.out.println("Multiplication = "+prod);
                    break;
            case 4:int quo = 1, rem = 1;
                    if(a>b){
                        quo = a/b;
                        rem = a%b;
                        System.out.println("Quotient = "+quo);
                        System.out.println("Remainder = "+rem);
                    }
                    else {
                        quo = b/a;
                        rem = b%a;
                        System.out.println("Quotient = "+quo);
                        System.out.println("Remainder = "+rem);
                    }
                    break;
            default:System.out.println("Invalid Choice");
        }
    }
}
