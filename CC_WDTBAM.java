import java.util.Scanner;
class CC_WDTBAM{
	public static void main(String[] args){
		StringBuffer ss,js;
		Scanner in = new Scanner(System.in);
		int i,T,t,N,X;
		String[][] s = new String[2][1000];		
		int[][] an = new int[2][1001];
 
		//input
		T=in.nextInt();
		for(t=0;t<T;t++){
			X=0;
			N=in.nextInt();
			s[0][t]=in.next();			
			s[1][t]=in.next();
			ss =new StringBuffer(s[0][t]);
			js =new StringBuffer(s[1][t]);								
 
			for(i=0;i<=N;i++){
				an[0][i]=in.nextInt();
			}
			//proses
			for(i=0;i<N;i++){
				if(ss.charAt(i)==js.charAt(i)){
					X++;
				}
			}
			an[1][t]=0;
			for(i=0;i<=X;i++){
				if(an[0][i]>an[1][t]){
					an[1][t]=an[0][i];
				}
			}
		}
 
		//print
		for(i=0;i<T;i++){
			System.out.println(an[1][i]);
		}
		
	}
}
