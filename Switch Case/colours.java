import java.io.*;
public class colours {
    public static void main(String args[])throws IOException{
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.println("1. Red\n2. Blue\n3. Yellow");
        System.out.println("Enter the user's choice");
        int choice = Integer.parseInt(br.readLine());
        switch(choice)
        {
            case 1:System.out.println("Red");
                    break;
            case 2:System.out.println("Blue");
                    break;
            case 3:System.out.print("Yellow");
                    break;
            default:System.out.println("Invalid Choice");
        }
    }
}
