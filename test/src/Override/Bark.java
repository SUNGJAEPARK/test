package Override;

public class Bark {

	public static void main(String[] args) {

		Animal ani = new Animal();
		Override over = new Override();
		
		
		ani.bite();
		over.bite();
		over.bite("��ũ��ũ");
		
		//System.out.println("aa");
	
		
	}
}
