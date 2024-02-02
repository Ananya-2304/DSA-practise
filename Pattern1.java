import java.util.Scanner;
class Pattern1{
    public static void main(String[] args){
        int i,j,space,n;
        System.out.println("Enter the no of rows");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        for(i=1;i<=n;i++)
        {
            for(space=0;space<n-i;space++)
            {   
                System.out.print(" ");
            }
            for(j=1;j<i;j++)
            {
                //System.out.print(j + " ");
                String s1 = String.format("%3d",j);
                System.out.print(s1);
            }
            System.out.print("\n");
        }
    }
}