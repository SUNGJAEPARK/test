package BBopgi;

import java.io.*;
import java.util.*;

public class Bbopgi {

	static int random;

	public static void main(String[] args) throws IOException {

		int random = (int) (Math.random() * 10) + 1;;

		int cnt = 3;
		
		Scanner s = new Scanner(System.in);

		System.out.println("힌트:"+random);
		System.out.println("나는 1부터 10 까지의 숫자 중 하나입니다...내가 누군지 맞춰보세요..");
		do{
			System.out.println("기회가"+cnt+"회남았습니다");		
			cnt --;
			int input = s.nextInt();
			
			if(random!=input && cnt != 0){
				System.out.println("땡! 틀렸습니다! 더럽게 못 맞추네요!");
			}else if(random!=input && cnt == 0){
				System.out.println("GAME OVER");
				break;
			}else{
				System.out.println("맞췄네요! 운 좋은 줄 아세요! ㅋㅋ" );
				break;
			}
		}while(true);
	}

}



