import java.util.Scanner;
public class SevenSegment {
   public static void main(String[] args) throws Exception {
           Scanner inr = new Scanner(System.in);
	      int n = inr.nextInt();
           // Add the necessary code in the below space
          switch(n){
       case 0:System.out.print(" _\n| |\n|_|");
              break;
       case 1:System.out.print("  |\n  |");
              break;
       case 2:System.out.print(" _\n _|\n|_");
              break;
       case 3:System.out.print(" _\n _|\n _|");
              break;
       case 4: System.out.print("|_|\n  |");
       break;
       case 5:System.out.print(" _\n|_\n _|");
       break;
       case 6:System.out.print(" _\n|_\n|_|");
              break;
       case 7:System.out.print(" _\n  |\n  |");
              break;
       case 8:System.out.print(" _\n|_|\n|_|");
              break;
       case 9:System.out.print(" _\n|_|\n _|");
              break;
     }
   }
} 
