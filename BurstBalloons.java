import java.util.Scanner;
public class BurstBalloons{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Solution obj = new Solution();
        int n= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max= obj.maxCoins(n,arr);
        System.out.println(max);
    }
}
class Solution{
    public int maxCoins(int N, int[] arr) {
    // code here
    int[] b = new int[N+2];
    b[0]=b[N+1]=1;
    int window,left,right,i,windowMax;
    for(i=1;i<=N;i++){
        b[i]=arr[i-1];
    }
    int[][] dp = new int[N+2][N+2];
    for(window=1;window<N+1;window++){
        for(left=1;left<N-window+2;left++){
            right=left+window-1;
            for(i=left;i<right+1;i++){
                windowMax= b[left-1]*b[i]*b[right+1] +dp[left][i-1]+dp[i+1][right];
                if(dp[left][right]<windowMax)
                   dp[left][right]= windowMax;
            }
        }
    }
    return dp[1][N];
  }
}