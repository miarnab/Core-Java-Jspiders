import java.io.*;
public class luckyCharacter2 {
    public static void main(String args[])throws IOException{
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.println("Enter the character");
        String s = br.readLine();
        int l = s.length();
        for(int i = 0;i<l;i++){
            char c = s.charAt(i);
            if((c>=65 && c<=90)||(c>=97 && c<=122)){
                System.out.println("Character is an Alphabet");
            } else if (c>=48 && c<=57) {
                System.out.println("Character is a Number");
            }else{
                System.out.println("Character is a Special Character");
            }
        }
    }
}
