import java.util.*;
class SevenSegmentDisplay{    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] encode = {
            {1,1,1,1,1,1,0},
            {0,1,1,0,0,0,0},
            {1,1,0,1,1,0,1},
            {1,1,1,1,0,0,1},
            {0,1,1,0,0,1,1},
            {1,0,1,1,0,1,1},
            {1,0,1,1,1,1,1},
            {1,1,1,0,0,0,0},
            {1,1,1,1,1,1,1},
            {1,1,1,1,0,1,1}
        };
        lightSegment(encode[n][0]==1," _ \n","  \n");
        lightSegment(encode[n][5]==1,"|"," ");
        lightSegment(encode[n][6]==1,"_"," ");
        lightSegment(encode[n][1]==1,"|\n"," \n");
        lightSegment(encode[n][4]==1,"|"," ");
        lightSegment(encode[n][3]==1,"_"," ");
        lightSegment(encode[n][2]==1,"|"," \n");
    }
    public static void lightSegment(boolean value,String onValue,String offValue){
        System.out.print(value?onValue:offValue);
    }
}