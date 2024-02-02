import java.util.Scanner;
public class ParenthesisChecker{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Solution obj = new Solution();
        String str= sc.next();
        if(obj.isPar(str)==true)
            System.out.println("Balanced");
        else
            System.out.println("Unbalanced");
    }
}
class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean isPar(String x)
    {
        // add your code here
        int n= x.length();
        int top=-1,flag=0;
        char[] stk= new char[n];
        char pop;
        for(int i=0;i<n;i++){
            char ch= x.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                top++;
                stk[top]=ch;
            }
            else if(top==-1 && (ch == ')' || ch == '}' || ch == ']'))
                return false;
            else if(ch == ')' || ch == '}' || ch == ']') {
                pop = stk[top];
                top--;
                if(pop == '(' && ch == ')')
                    flag=1;
                else if(pop == '{' && ch == '}')
                    flag=1;
                else if(pop == '[' && ch == ']')
                    flag=1;
                else 
                    return false;
            }
            else
                return false;
        }
        if(top>-1)
           return false;
        if(flag==1)
          return true;
        else
          return false;
    }
}
