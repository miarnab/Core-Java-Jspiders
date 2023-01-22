import java.io.*;
public class food {
    public static void main(String args[])throws IOException{
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.println("1. Idly\n2. Dosa\n3. Vada\n4. Tea");
        System.out.println("Enter the user's choice");
        int choice = Integer.parseInt(br.readLine());
        switch(choice)
        {
            case 1:System.out.println("Idly is on the way");
                    break;
            case 2:System.out.println("Dosa is on the way");
                    break;
            case 3:System.out.println("Vada is on the way");
                    break;
            case 4:System.out.println("Tea is on the way");
                    break;
            default:System.out.println("Invalid Choice");
        }
    }
}
