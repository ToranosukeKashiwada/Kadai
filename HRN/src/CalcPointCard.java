import java.util.Scanner;

public class CalcPointCard {

	public static void main(String[] args) {
		//PGM ポイントカードの計算
		Scanner sc = new Scanner(System.in);
		int receiptNumber = sc.nextInt(); // レシートの枚数
		int totalPrice = 0;
		int totalPoint = 0;

		//日付と購入金額を取得
		for(int i=0;i<receiptNumber;i++) {
			int days  = sc.nextInt();//日付
			int price = sc.nextInt();//購入金額
			int point = (int)(price * 0.01);
			if(days % 10 == 3) {
				point = (int)(price * 0.03);
			}else if(days % 10 == 5) {
				point = (int)(price * 0.05);
			}
			totalPrice += price;
			totalPoint += point;
		}
		System.out.println(totalPrice + "円");
		System.out.println(totalPoint + "ポイント");

	}

}
