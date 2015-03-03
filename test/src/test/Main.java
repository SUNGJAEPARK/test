package test;

public class Main {

	public static int bb = 1;
	public static int cc = 1;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ReturnString rt = new ReturnString();

		Main m = new Main();
		//System.out.println(rt);
		int sum = 0;	
		
		cc=2;

		int[] score = {1 , 2, 3, 4, 5, 6, 7, 8, 9, 10};

		for(int i=0; i<10; i++){




			sum = sum + score[i];

			System.out.println("마크바크");
			System.out.println(sum);
			System.out.println(bb);
			System.out.println(cc);
		}


	}

}
