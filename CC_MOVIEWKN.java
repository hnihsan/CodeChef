#CC_MOVIEWKN

import java.util.Scanner;
class CC_MOVIEWKN{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int T,t,n,i,j;
		int[][] a = new int[2][100],b = new int[3][100];
		//input
		T=in.nextInt();
		for(t=0;t<T;t++){
			n=in.nextInt();
			for(i=0;i<2;i++){
				for(j=0;j<n;j++){
					a[i][j]=in.nextInt();
				}
			}
		//proses
			b[0][t]=0;
			b[1][t]=0;
			for(i=0;i<n;i++){
				if(a[0][i]*a[1][i]>b[0][t]){
					b[0][t] = a[0][i]*a[1][i];
					b[1][t] = a[1][i];
					b[2][t] = i+1;
				}else if(a[0][i]*a[1][i]==b[0][t]){
				if(a[1][i]>b[1][t] ){
					b[0][t] = a[0][i]*a[1][i];
					b[1][t] = a[1][i];
					b[2][t] = i+1;						
					}
				}
			}	
		}
		
		//output
		for(i=0;i<T;i++){
			System.out.println (b[2][i]);			
		}	
	}
}
