import java.util.Arrays;
import java.util.Scanner;
public class Search {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of elements to be entered");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter the elements in the array");
            for(int i=0;i<n;i++)
            {
            arr[i]=sc.nextInt();
            }
            int pv = 0;
            int st = 0;
            for(int j=0;j<n-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                pv=j+1;
                break;
                }
            }
            System.out.println("Enter the element to be searched");
            int intkey=sc.nextInt();
            if(intkey<arr[0])
                System.out.println("The required element is present at the index:"+Arrays.binarySearch(arr,pv+1,n, intkey));
            else if(intkey>=arr[0])
                System.out.println("The required element is present at the index:"+Arrays.binarySearch(arr,st,pv+1, intkey));
            else
                System.out.println("The required element is not in the given array");
        }
    }

}
