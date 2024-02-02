import java.util.Scanner;
public class ContainerWater{
    public static void main(String[] args){
        Scanner sc = new Scanner(String[] args);
        Solution obj = new Soution();
        int n = sc.nextInt();
        int[] arr = new int[n];
        long max= obj.maxArea(arr,n);
        System.out.println(max);
    }
}
class Solution{
   long maxArea(int A[], int len){
        // Code Here
        int i=0,j=len-1;
        long ans=0;
        while(i<j){
           ans = max(ans,min(((long)A[i]),((long)A[j]))*((long)(j-i))); 
           if(A[i]<A[j])
              i++;
           else
              j--;
        }
        return ans;
    }
    long min(long a,long b){
        if(a<=b)
           return a;
        else
           return b;
    }
    long max(long a,long b){
        if(a>=b)
           return a;
        else
           return b;
    }
}