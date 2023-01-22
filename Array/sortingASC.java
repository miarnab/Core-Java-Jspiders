import java.util.*;
public class sortingASC {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements in the array: ");
        for(int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr);
    }
}
