/**
 * @author Ramesh
 *
 */
public class For_Loop {

	/**
	 * @param args
	 */
	public static void main(String[] args)   {
		// 

		
		int limit =100 , i , j;
		System.out.println("Prime numbers 1 to "+limit);
		
		for(i=1 ; i<=100 ; i++){
			boolean isPrime=true;
			
			for(j=2; j<i ; j++){
				
				if(i%j==0){
					isPrime=false;
					break;
					
					}
			}
			if(isPrime){
				System.out.print(i+" ");
			}
			
			

		}
	}

}
