import java.util.Scanner;
class CC_CHN09{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int T,t,i,a,b;
		String s[]=new String[100];
		int[] an= new int[100];
		
		//input
		T=in.nextInt();
		for(t=0;t<T;t++){
			a=0;b=0;
			s[t]=in.next();
			StringBuffer tx = new StringBuffer(s[t]);
			for(i=0;i<tx.length();i++){
				if(tx.charAt(i)=='a'){a++;}
				else if(tx.charAt(i)=='b'){b++;}					
			}
			if(a>=b){an[t]=b;
			}else if(a*b==0){an[t]=0;
			}else if(a<b){an[t]=a;
			}	
		}
		
		//output
		for(t=0;t<T;t++){
			System.out.println (an[t]);
		}
	}
}
