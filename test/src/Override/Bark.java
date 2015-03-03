package Override;

public class Bark {

	public static void main(String[] args) {

		Animal ani = new Animal();
		Override over = new Override();
		
		
		ani.bite();
		over.bite();
		over.bite("마크바크");
		
		//System.out.println("aa");
	
		
	}
}
