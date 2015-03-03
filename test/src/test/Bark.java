package test;

public class Bark {

	public static void main(String[] args) {

		Animal ani = new Animal();
		ReturnTest turn = new ReturnTest();				
		
		String aa = turn.turn();
		
		Parameter param = new Parameter();
		
		ani.bite();	
		param.parameter(ani);
		System.out.println(aa);
		turn.turn2();
		
	}
}
