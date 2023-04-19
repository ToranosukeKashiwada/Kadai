import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class HateNumber {

	public static void main(String[] args) {
		//PGM 嫌いな数字
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //n = 嫌いな数字
		int m = sc.nextInt(); //m = 部屋の数
		List<String>rooms = new ArrayList<>();
		//部屋番号格納
		for(int i=0;i<m;i++) {
			rooms.add(sc.next());
		}
		sc.close();
		List<String> filteredRooms = rooms.stream()
				.filter(room -> !room.contains(String.valueOf(n)))
				.toList();
		//部屋があれば
		if (filteredRooms.size() > 0) {
			for (String room : filteredRooms) {
				System.out.println(room);
			}
		//部屋がなければ	
		} else {
			System.out.println("none");
		}

	}

}
