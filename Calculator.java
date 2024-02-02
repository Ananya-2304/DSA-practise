import java.util.Scanner;
class Calculator{
    public static void main(String[] args){
        System.out.println("Enter the two numbers");
        Scanner input = new Scanner(System.in);
        String no;
        String[] list;
        no = input.nextLine();
        list = no.split(",");
        int a= Integer.parseInt(list[0]);
        int b = Integer.parseInt(list[1]);
    }
}