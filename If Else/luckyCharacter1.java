import java.io.*;

public class luckyCharacter1 {
    public static void main(String args[])throws IOException{
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.println("Enter the character");
        String s = br.readLine();
        int l = s.length();
        for(int i = 0;i<l;i++){
            char c = s.charAt(i);
            if (c>=65 && c<=90){
                System.out.println("Lucky Character");
            }
            else{
                System.out.println("Not a Lucky Character");
            }
        }
    }
}
