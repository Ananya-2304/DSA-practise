import java.util.Scanner;
public class BitCount{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Solution obj = new Solution();
        long L = sc.nextLong();
        long R = sc.nextLong();
        long count = obj.solve(L,R);
        System.out.println(count);
    }
}
class Solution{
    long solve(long L,long R){
        long x=0,i;
        for(i=L;i<=R;i++){
            if(isCount(i))
              x++;
        }
        return x;
    }
    boolean isCount(long n){             //Brian Kernighan’s Algorithm Solution 1 but takes O(n) time complexity
        int count=0;
        while(n!=0){
            n= n & (n-1);
            count++;
        }
        if(count==3)
          return true;
        else
          return false;
    }
}
class Solution{
    
    void precompute(){
        // Code Here
        return;
    }
    long solve(long L, long R){                       //Takes O(1) time
        // Code here
      int i,j,k;
      long ans=0;
      for(i=0;i<63;i++){
          for(j=i+1;j<63;j++){
              for(k=j+1;k<63;k++){
                  long curr = 0;
                  curr = curr|(1L<<i);
                  curr = curr|(1L<<j);
                  curr = curr|(1L<<k);
                  if(curr>=L && curr<=R)
                     ans++;
              }
          }
      }
      return ans;
}
}