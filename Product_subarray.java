import java.util.*;
public class Product_subarray {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of elements to be entered in the array");
            int n=sc.nextInt();
            int[] arr = new int[n];
            int j = 0;
            int prod=1;
            int prev_prod=0;
            System.out.println("Enter the elements of the array");
            for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
            for(int i=0;i<n;i++)
            {
                while(j<n)
                {
                    prod=prod*arr[j];
                    if(prod>prev_prod)
                    prev_prod = prod;
                    j++;
                }
                j=i;
                prod=1;
            }
            System.out.println("The maximum product of a sub-array is "+prev_prod);
        }
    }
}
