package lotto;

public class LottoMain{

	public static void main(String[] args) {

		System.out.println("즐거운 로또 시간입니다...");

		int intArray[];
		int result[];

		CountSec sec = new CountSec();
		RandomNumExport ran = new RandomNumExport();


		intArray = ran.lottoNumExport();

		for(int i=0;i<intArray.length; i++){

			System.out.println(intArray[i]);

		}
		
		System.out.println("득템하세요 ^^");
		
	}
	
}
