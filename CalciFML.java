import java.util.Scanner;
public class CalciFML{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
// Write code below...
char ch='0',in,op='0';
int flag=0;
double a=-1,b=-1,result=0,n1=0,n2=0;
for(int i=0;i<input.length();i++){
  in=input.charAt(i);
  ch = gui_map(in);
  if((ch=='0'|| ch=='1' ||ch=='2'||ch=='3'||ch=='4'||ch=='5'||ch=='6'||ch=='7'||ch=='8'||ch=='9')&& flag ==0){
    a = ch-'0';
    n1=n1*10+a;
  }
  else if((ch=='0'|| ch=='1' ||ch=='2'||ch=='3'||ch=='4'||ch=='5'||ch=='6'||ch=='7'||ch=='8'||ch=='9') && flag==1){
    b= ch-'0';
    n2 = n2*10+b;
  }
  else if(ch=='=')
    break;
  else{
     op=ch;
     flag=1;
  }
  }
if(ch=='='){
switch(op){
  case '+': result = n1+n2;break;
  case '-':result = n1-n2;break;
  case 'X':result = n1*n2;break;
  case '/':result =n1/n2;break;
  default:System.out.println("Tf");
}
  System.out.print(result);
}
  
}// The main() method ends here.
	
// A method that takes a character as input and returns the corresponding GUI character	
	static char gui_map(char in){
		char out = 'N';// N = Null/Empty
		char gm[][]={{'a','.'}
					,{'b','0'}
					,{'c','='}
					,{'d','+'}
					,{'e','1'}
					,{'f','2'}
					,{'g','3'}
					,{'h','-'}
					,{'i','4'}
					,{'j','5'}
					,{'k','6'}
					,{'l','X'}
					,{'m','7'}
					,{'n','8'}
					,{'o','9'}
					,{'p','/'}};
					
		// Checking for maps
		for(int i=0; i<gm.length; i++){
			if(gm[i][0]==in){
				out=gm[i][1];
				break;
			}
		}
		return out;
	}
}