import java.util.Scanner;

public class LatestAttendanceTime {

	public static void main(String[] args) {
		// PGM 最遅出社時刻
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();//A駅までの時間a分
		int b = sc.nextInt();//A駅からB駅の乗車時間b分
		int c = sc.nextInt();//B駅から会社までの時間c分
		int N = sc.nextInt();//A駅から出る電車の本数を表す整数N
		int[] h = new int[N];
		int[] m = new int[N];
		int latestDepartureTime = -1;
		for(int i = 0;i<N;i++) {
			h[i] = sc.nextInt();
			m[i] = sc.nextInt();
			int departureTime  =  h[i] * 60 + m[i];//時刻表の時間
			int arrivalTime = departureTime + b + c;//時刻表の時間+会社までの時間
			if(arrivalTime < 539){
				//8:59 = 8 * 60 + 59
				latestDepartureTime = departureTime - a;
			}
		}
		if(latestDepartureTime == -1) {
			System.out.println("なし");
		}else {
			int hh = latestDepartureTime / 60;
			int mm = latestDepartureTime % 60;
			System.out.println(String.format("%02d:%02d",hh,mm));
		}
	}
}
