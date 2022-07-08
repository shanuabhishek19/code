import java.util.Arrays;
import java.util.Scanner;
public class Lexicographical {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of elements to be entered in the array");
             int n = sc.nextInt();
             int index1 = 0;
             int index2 = 0;
             int diff = Integer.MAX_VALUE;
             int dif = 0;
             int swap = 0;
             int[] arr = new int[n];
             System.out.println("Enter the elements of the array");
             for(int i=0;i<n;i++)
             arr[i] = sc.nextInt();
             System.out.print("Current permutation is:");
             for(int i=0;i<n;i++)
             System.out.print(arr[i]+",");
// now traversing the array in the reverse order to check where the left hand element is smaller than the right hand element
            for(int j=n-1;j>0;j--)
            {
                if(arr[j]>arr[j-1])
                {
                    index1=j-1;
                    break;
                }
            }
            System.out.println("Index1:"+index1);
// now we will find the next greatest number from the index1 to its right side
            for(int i=index1+1;i<n;i++)
            {
                dif = arr[i]-arr[index1];
                if(dif<diff && dif>0)
                {
                diff=dif;
                index2=i;
                }
            }
            System.out.println("Index2:"+index2);
            swap=arr[index1];
            arr[index1]=arr[index2];
            arr[index2]=swap;
            for(int i=index1+1;i<n;i++)
            Arrays.sort(arr,index1+1,n);
            System.out.println();
            System.out.print("The next permutation is:");
            for(int i=0;i<n;i++)
            System.out.print(arr[i]+",");
        }
    }
}