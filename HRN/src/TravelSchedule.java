import java.util.Scanner;

public class TravelSchedule {

	public static void main(String[] args) {
		//　PGM 旅行の日程
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt(); //M = 休日の日数
		int N = sc.nextInt(); //N = 旅行の日数
		int[] days  = new int[M];
		int[] rates = new int[M];
		
		//休日の日付と降水確率を取得
		for(int i=0;i<M;i++) {
			days[i]  = sc.nextInt();
			rates[i] = sc.nextInt();
		}
		int minRateAvg = Integer.MAX_VALUE;
		int startDate  = 0;
		int endDate    = 0;
		
		//降水確率の平均が最も低くなる日程を算出
		for(int i=0;i<M-N+1;i++) {
			int sumRate = 0;
			for(int j=i;j<i+N;j++) {
				sumRate += rates[j];
			}
			int rateAvg = sumRate / N;
			if(rateAvg < minRateAvg) {
				minRateAvg = rateAvg;
				startDate = days[i];
				endDate = days[i+N-1];
			}
		}
		System.out.println(startDate + " " + endDate);
	}

}
