import java.util.Scanner;

public class CalcString {

	public static void main(String[] args) {
		// PGM 文字列での計算
		Scanner sc = new Scanner(System.in);
		String  S1 = sc.next();
		String  S2 = sc.next();
		// S1とS2を5進数に変換する
		int num1 = 0;
		int num2 = 0;
		for (int i = 0; i < S1.length(); i++) {
			char c = S1.charAt(i);
			num1 *= 5;
			num1 += c - 'A'; // 'A'を0に置き換える
		}
		for (int i = 0; i < S2.length(); i++) {
			char c = S2.charAt(i);
			num2 *= 5;
			num2 += c - 'A';
		}

		// 5進数で足し算を行う
		int num3 = num1 + num2;

		// 計算結果をジャバーランド表記に変換して出力する
		StringBuilder sb = new StringBuilder();
		if (num3 == 0) {
			System.out.println("A");
			return;
		}
		while (num3 != 0) {
			int r = num3 % 5;
			String c = "";
			if (r == 0) {
				c = "A"; // 0を'A'に置き換える
			} else {
				c = String.valueOf((char) ('A' + r)); // 1以上の数値を'B'から順に割り振る
			}
			sb.insert(0, c);
			num3 /= 5;
		}
		System.out.println(sb.toString());
	}
}


