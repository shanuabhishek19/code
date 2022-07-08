import java.util.*;
public class Share_exchange {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of days for which you wanna trade");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter the price of stock on each day");
            for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
            int buy = Integer.MAX_VALUE;
            int buy_day = 0;
            int sell = 0;
            int sell_day = 0;
            for(int i=0;i<n;i++)
            {
                if(arr[i]<buy)
                {
                buy = arr[i];
                buy_day=i+1;
                }
            }
            System.out.println("Amount for which the stock should be bought = "+buy);
            System.out.println("The day on which the stock should be bought is "+buy_day);
            for(int i=buy_day;i<n;i++)
            {
                if(sell<arr[i])
                {
                    sell = arr[i];
                    sell_day = i+1;
                }
            }
            System.out.println("Amount for which the stock should be sold for max profit = "+sell);
            System.out.println("The day on which the stock should be sold for max profit is "+sell_day);
            int profit = sell-buy;
            System.out.println("Profit = "+profit);
        }
    }
}
