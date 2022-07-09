import java.util.*;
public class Repeat_Missing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements to be entered in the given array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter all the elements of the given array");
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        Arrays.sort(arr);
        int sum = 0;
        for(int i=0;i<n;i++)
        {
             if(arr[i] != (i+1))
             System.out.println("The number that occurs twice is "+arr[i]);
             else
             sum = sum+arr[i];
        }
        int sumcheck = (n*(n+1))/2;
        System.out.println("The missing number is "+(sumcheck-sum));
    }
}
