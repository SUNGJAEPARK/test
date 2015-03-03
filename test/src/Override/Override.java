package Override;

public class Override extends Animal{
	
	public void OverTest(){
		
		String aa = "test"; 
		
		System.out.println(aa);
		
	}
	
	
	public void bite(){
		
		System.out.println("오버라이드했습니다");
		
	}
	
	
	public void bite(String args){
		
		   System.out.println(args);		
		   System.out.println("오버로드했습니다");
			
	}
	

}
