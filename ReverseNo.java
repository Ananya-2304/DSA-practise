import java.util.Scanner;
public class ReverseNo{
    public static void main(String[] args){
        Solution obj = new Solution();
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int rev = obj.reverse(n,0);
        System.out.println(rev);
        if(rev == n)
          System.out.println("Palindrome");
        else
          System.out.println("Not Palindrome");
    }
}
class Solution{
    int reverse(int n,int a){
        if(n==0)
          return a;
        return reverse(n/10,10*a+(n%10));
    }
}