import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class LandPriceExpected {

	public static void main(String[] args) {
		// PGM 土地の価格予想
		// 入力の受け取り
		Scanner sc = new Scanner(System.in);
		double targetX = sc.nextInt();
		double targetY = sc.nextInt();
		int k = sc.nextInt();
		int n = sc.nextInt();
		double[] x = new double[n];
		double[] y = new double[n];
		int[] p = new int[n];
		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
			p[i] = sc.nextInt();
		}

		// 各地点から目標点までの距離を計算し、距離の昇順にソートする
		double[] distance = new double[n];
		for (int i = 0; i < n; i++) {
			distance[i] = Math.sqrt(Math.pow(targetX - x[i], 2) + Math.pow(targetY - y[i], 2));
		}
		Map<Integer, Double> distanceIndexMap = new HashMap<>();
		for (int i = 0; i < n; i++) {
			distanceIndexMap.put(i, distance[i]);
		}
		List<Map.Entry<Integer, Double>> entries = new ArrayList<>(distanceIndexMap.entrySet());
		entries.sort(Map.Entry.comparingByValue());

		// k近傍法により予測値を算出する
		int sum = 0;
		for (int i = 0; i < k; i++) {
			int index = entries.get(i).getKey();
			sum += p[index];
		}
		int predictedValue = (int) Math.round(sum / (double)k);

		// 結果を出力する
		System.out.println(predictedValue);
	}
}
