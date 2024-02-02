import java.util.Scanner;
import java.util.HashMap;
public class SubArrays1{
    public static void main(String[] args){
        int i;
        Scanner sc = new Scanner(System.in);
        Solution obj = new Solution();
        System.out.println("Enter the size of the array ");
        int n= sc.nextInt();
        int[] arr = new int[n];
        for(i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter the sum of the subsets");
        int k= sc.nextInt();
        int count= obj.findNoOfSubsets(arr,k);
        System.out.println(count);
    }
}
class Solution{
    public static int findNoOfSubsets(int arr[], int k){
        HashMap<Integer,Integer> maps= new HashMap<>();
        int n = arr.length;
        int sum=0,removeSum,count=0;
        maps.put(0,1);
        for(int i=0;i<n;i++){
        sum += arr[i];
        removeSum= sum-k;
        if(maps.containsKey(removeSum)){
            count+= maps.get(removeSum);
        }
        maps.put(sum,maps.getOrDefault(sum,0)+1);
        }
        return count;
    }

}