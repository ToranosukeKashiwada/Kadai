import java.util.Scanner;

public class FindTimeDifference {

	public static void main(String[] args) {
		// PGM 時差を求める
		Scanner sc = new Scanner(System.in);
		//都市の総数取得
		int cityTotalCount = sc.nextInt();
		//都市のデータを格納する配列の作成
		String[] citys = new String[cityTotalCount];
		int[] times = new int[cityTotalCount];
		//都市のデータを入力して配列に格納
		for(int i = 0;i < cityTotalCount;i++) {
			citys[i] = sc.next();
			times[i] = sc.nextInt();
		}
		//ユーザのデータを取得
		String userCity = sc.next();
		String userTime = sc.next();
		//ユーザの都市と時刻を検索
		int userIndex = 0;
		for(int i = 0;i < cityTotalCount;i++) {
			if(userCity.equals(citys[i])) {
				userIndex = i;
				break;
			}
		}
		//日記の時刻計算
		int userHour   = Integer.parseInt(userTime.split(":")[0]);
		int userMinute = Integer.parseInt(userTime.split(":")[1]);
		//都市の時刻を計算＆出力
		for(int i = 0;i < cityTotalCount;i++) {
			int currentHour = userHour + times[i] - times[userIndex];
			if(currentHour < 0) {
				currentHour += 24;
			}else if(currentHour >= 24){
				currentHour -= 24;
			}
			System.out.printf("%s %02d:%02d\n",citys[i],currentHour,userMinute);
		}

	}

}
