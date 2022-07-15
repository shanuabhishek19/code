import java.util.*;
public class Three_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements to be entered in the array");
        int n = sc.nextInt();
        int[] arr = new int[n]; 
        System.out.println("Enter the elements in the array");
        for(int i=0;i<n;i++)
        arr[i] = sc.nextInt();
        int j=1;
        int k=2;
        int i=0;
        while(i<n)
        {
            while(j<n)
            {
                while(k<n)
                {
                    if(((arr[i]+arr[j]+arr[k])==0)&&(i!=j && j!=k && k!=i) )
                    {
                        System.out.println("[ "+arr[i]+" , "+arr[j]+" , "+arr[k]+" ]");
                        i=k+1;
                        j=k+2;
                        k=k+3;
                    }
                    else
                    {
                        if(k==n-1)
                        {
                            System.out.println("No such triplets found");
                            i++;
                            j++;
                            k++;
                        }
                        else
                        {
                            i++;
                            j++;
                            k++;
                        }
                    }
                }
            }
        }
    }
}
