import java.util.*;
public class duplicate_element { 
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the length of the array");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter the elements of the array");
            for(int i = 0; i < n; i++)
            arr[i]= sc.nextInt();
            Arrays.sort(arr);
            for(int i = 0; i < n; i++)
            System.out.println(arr[i]);
            for(int i = 0; i < n-1; i++)
            {
                if(arr[i]==arr[i+1]){
                System.out.println("Duplicate element present");
                break;
                }
            }
            
        }

    }
    
}
