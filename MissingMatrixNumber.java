import java.util.Scanner;
public class MissingMatrixNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Solution obj= new Solution();
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        long ans = obj.MissingNo(mat);
        System.out.println(ans);
    }
}
class Solution{
    public long MissingNo(int[][] mat){
        int N= mat[0].length;
        int i,j,idx=-1,jdx=-1,flag=1;
        long[] row = new long[N];
        long[] col = new long[N];
        long dia1=0,dia2=0,sum,ans;
        for(i=0;i<N;i++){
            for(j=0;j<N;j++){
                row[i] += mat[i][j];
                col[j] += mat[i][j];
                if(mat[i][j]==0){
                    idx=i;
                    jdx=j;
                }
                if(i==j){
                   dia1 += mat[i][j] ;
                }
                if(j==N-i-1){
                   dia2 += mat[i][j];
                }                
            }
        }
        if(idx<N-1)
          sum= row[idx+1];
        else
          sum = row[idx-1];
        ans = sum-row[idx];
        for(i=0;i<N;i++){
            if(i==idx || i==jdx){
                continue;
            }
            else if((sum!=row[i]) || (sum!=col[i])){
                flag=0;
                return -1;
            }
        }
        if(idx==jdx){
            dia1 += ans;
        }
        if(jdx==N-idx-1){
            dia2 += ans;
        }
        if(dia1!=dia2)
          flag=0;
        if(flag==0 ||ans<=0)
           return -1;
        else
           return ans;
    }
}