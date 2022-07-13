import java.util.*;
public class Rain_water {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the total number of elements to be entered in the array");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter the elements of teh array");
            for(int i=0;i<n;i++)
             arr[i]=sc.nextInt();
            int[] left = new int[n];
            int[] right = new int[n];
            left[0] = arr[0];
            for(int i=1;i<n;i++)
            {
                left[i]=Math.max(left[i-1],arr[i]);
            }
            right[n-1] = arr[n-1];
            for(int i=n-2;i>=0;i--)
            {
                right[i]=Math.max(right[i+1],arr[i]);
            }
            int ans=0;
            for(int i=0;i<n;i++)
            {
                ans=ans+((Math.min(left[i],right[i]))-arr[i]);
            }
            System.out.println("The rainfall trapped in between the blocks is "+ans);
        }
    }
}