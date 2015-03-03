package lotto;

public class RandomNumExport {
	
	public int[] lottoNumExport(){
				
		int lot[] = new int[6];
		int result[];
		int i;
		
		
			
		lot[0] = (int) (Math.random() * 45)+1;
		
		
			for(i=1; i<lot.length; i++){
				
				lot[i] = (int) (Math.random() * 45)+1;	
				
				if(lot[i]==lot[i-1]){
				
					System.out.println("중쀍이발생하였습니다.^^ 중쀍은"+i+"번째 열에서 발생하였으며,"+lot[i]+"와"+lot[i-1]+"이중쀍입니다. 숫자를 다시 뽑습니다.^^");
					i--;
					
				}
				
			}
			
			return lot;
			
		
	}
}
