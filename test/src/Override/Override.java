package Override;

public class Override extends Animal{
	
	public void OverTest(){
		
		String aa = "test"; 
		
		System.out.println(aa);
		
	}
	
	
	public void bite(){
		
		System.out.println("�������̵��߽��ϴ�");
		
	}
	
	
	public void bite(String args){
		
		   System.out.println(args);		
		   System.out.println("�����ε��߽��ϴ�");
			
	}
	

}
