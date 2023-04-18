import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;



public class BookPurchaseCostRanking {

	public class Main {
		public static void main(String args[]) throws Exception {
			Scanner sc = new Scanner(System.in);
			//入力から社員の人数取得
			int N = sc.nextInt();
			//社員の名前を格納
			Map<String, Integer> bookPurchases = new HashMap<>();
			for (int i = 0; i < N; i++) {
				bookPurchases.put(sc.next(), 0);
			}
			//購入履歴を反映
			int M = sc.nextInt();
			for (int i = 0; i < M; i++) {
				String name = sc.next();
				int amount = sc.nextInt();
				//二度目以降の購入を累積加算する
				bookPurchases.put(name, bookPurchases.get(name) + amount);
			}
			//結果を格納
			List<Entry<String, Integer>> rankingList = new ArrayList<>(bookPurchases.entrySet());
			Collections.sort(rankingList, new Comparator<Map.Entry<String, Integer>>() {
				public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
					return o2.getValue().compareTo(o1.getValue());
				}
			});
			for (Entry<String, Integer> entry : rankingList) {
				System.out.println(entry.getKey());
			}
		}
	}
}