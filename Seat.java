package seating.order ;
import java.util.Random ;
import java.util.Scanner;

public class Seat{

	public static Random random = new Random();
	public static Scanner scanner = new Scanner(System.in);
	public static String[]members = new String[0];
	public static int[]selectedNumbers = new int[0];


	public static void seatingOrder(int num){

		// 人数と必要な乱数の数を指定
		members = new String[num];
		selectedNumbers = new int[num];

		// 参加人数分の氏名要求
		for( int i = 0 ; i < num ; i++){
			System.out.println("あなたの名前は？");
			System.out.print( (i + 1) + "人目：");
			String name = scanner.next();

		//配列に名前と数字を入れる
			members[i] = name ;
			selectedNumbers[i] = i + 1 ;
		}

		//配列selectedNumbersの箱をシャッフル
		for(int i = num - 1 ; i > 0 ; i-- ){
			int j = random.nextInt(num);
			int tmp = selectedNumbers[i];
			selectedNumbers[i] = selectedNumbers[j];
			selectedNumbers[j] = tmp;
		}




		}


	public static String[] members(){

		return members ;
	}
	public static int[] numbers(){
		return selectedNumbers ;
	}

	
}
