import java.util.Scanner;
public class FactTail{
    public static void main(String[] args){
        Solution obj = new Solution();
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int fact = obj.fact(n,1);
        System.out.println(fact);
    }
}
class Solution{
    int fact(int n,int a){
        if(n==0)
          return a;
        return fact(n-1,n*a);
    }
}