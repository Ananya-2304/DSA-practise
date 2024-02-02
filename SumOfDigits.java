import java.util.Scanner;
public class SumOfDigits{
    public static void main(String[] args){
        Solution obj = new Solution();
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int sum = obj.sumOfDigits(n,0);
        System.out.println(sum);
        int mul = obj.productOfDigits(n,1);
        System.out.println(mul);
    }
}
class Solution{
    int sumOfDigits(int n , int sum){
        if(n==0)
           return sum;
        return sumOfDigits(n/10, sum+(n%10));
    }
    int productOfDigits(int n,int prod){
        if(n==0)
           return prod;
        return productOfDigits(n/10,prod*(n%10));
    }
}