import java.util.Scanner;
class CC_SPALNUM{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		StringBuffer st;		
		int t,i,T,L,R,sum;
		boolean p;
		int[] an = new int[100];
		
		//input
		T=in.nextInt();
		for(t=0;t<T;t++){
			sum=0;
			L=in.nextInt();
			R=in.nextInt();		
			st = new StringBuffer(Integer.toString(L));
			
			//proses
			for(;L<=R;L++){
				if(st.length()==1){
					sum+=L;	
				}
				else{
					p=true;
					for(i=0;i<st.length()/2;i++){						
						if(st.charAt(i)==st.charAt(st.length()-1-i)){
							p=true;
						}else{
							p=false;
							break;
						}
					}
					if(p==true){
						sum+=L;
					}
				}
				System.out.println (L);				
			an[t]=sum;
			}					
		}
		//cetak
		for(i=0;i<T;i++){
			System.out.println (an[i]);	
		}
		
	}
}
