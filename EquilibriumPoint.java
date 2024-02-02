import java.util.Scanner;
public class EquilibriumPoint{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        long arr[] = new long[n];
        for(int i=0;i<n;i++){
            arr[i]= in.nextLong();
        }
        Solution obj = new Solution();
        int pos= obj.equilibriumPoint(arr,n);
        System.out.println(pos);
    }
}
/*
//Brute force
class Solution {
        public static int suml(int k,long arr[]){
            int i,sum=0;
            for(i=0;i<k;i++)
               sum +=arr[i];
            return sum;
        }        // Your code here
        public static int sumr(int k,long arr[],int n){
            int i,sum=0;
            for(i=k+1;i<n;i++)
               sum +=arr[i];
            return sum;
        }
    public static int equilibriumPoint(long arr[], int n) {

        // Your code here

        int i;
        for(i=0;i<n;i++){
            if(suml(i,arr)==sumr(i,arr,n))
               return i;
        }
        return -1;
    }
}
*/

class Solution {

    public static int equilibriumPoint(long arr[], int n) {

        // Your code here

        int i;
        long sum=0,l=0,r;
        for(i=0;i<n;i++){
            sum += arr[i];
        }
        r=sum;
        for(i=0;i<n;i++){
            r=r-arr[i];
            if(l==r)
              return i+1;
            l += arr[i];
        }
        return -1;
    }
}
