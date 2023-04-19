import java.util.Scanner;
public class LeetConversion {

	public static void main(String[] args) {
		//PGM Leet変換
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();		
		String outString = s
				.replace("A", "4")
				.replace("E", "3")
				.replace("G", "6")
				.replace("I", "1")
				.replace("O", "0")
				.replace("S", "5")
				.replace("Z", "2");
		System.out.println(outString);

	}

}
