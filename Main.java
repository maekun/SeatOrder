package seating.order ;
import java.util.Scanner;

public class Main{

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args){

		System.out.print("参加人数：");
		int num = scanner.nextInt();
		Seat.seatingOrder(num);
		String[] arrayMembers = Seat.members();
		int[] arrayNumbers = Seat.numbers();


		for(int i = 0 ; i < arrayMembers.length ; i++){
			System.out.println("席番号  名前");
			System.out.print("  " + arrayNumbers[i] + "    ");
			System.out.println(arrayMembers[i]);
			System.out.println("------------------------");
		}
	}
}