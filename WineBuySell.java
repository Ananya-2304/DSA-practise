//GFG The problem statement asked to find the minimum cost when buying and selling wine with -ve nos being wines to be sold +ve no s wines to bought.LEsser the distance between them lesser cost and work done.
//Intuition:Time Complexity:O(N);
//Stored all positive(buying) in one array along with their index in i+1 th position and similarly -ve values(selling) in another array.
//Future me pls consider using hashMaps because acc to my current knowledge u cant pop or access elements which are there in the array since it gets randomized.but not sure.
import java.util.Scanner;
public class WineBuySell{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Solution obj = new Solution();
        int n = sc.nextInt();
        int[] arr =new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        long minCost = obj.wineSelling(arr,n);
        System.out.println(minCost);
    }
}
class Solution{
    long wineSelling(int[] arr, int N){
        int count=0,i;
        long cost=0;
        for(i=0;i<N;i++)
        {
            if(arr[i]>=0)
                count++;
        }
        int[] buy = new int[2*count];
        int[] sell = new int[2*(N-count)];
        int k=0,j=0;
        for(i=0;i<N;i++){
            if(arr[i]>=0){
                buy[k]= arr[i];
                buy[k+1] = i;
                k=k+2;
            }
            else{
                sell[j]=arr[i];
                sell[j+1] = i;
                j +=2;
            }
        }
        i=0;
        j=0;
        while(i<buy.length && j<sell.length){
            if(buy[i]>Math.abs(sell[j])){
                buy[i]= buy[i]+sell[j];
                cost += Math.abs(sell[j])*(Math.abs(sell[j+1]-buy[i+1]));
                j +=2;
            }
            else if(buy[i]<=Math.abs(sell[j])){
                sell[j]= buy[i]+sell[j];
                cost += Math.abs(buy[i])*(Math.abs(sell[j+1]-buy[i+1]));
                i+=2;
            }
        }
        return cost;
    }
}