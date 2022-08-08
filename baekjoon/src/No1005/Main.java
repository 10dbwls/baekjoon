package No1005;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int case_num = scanner.nextInt();
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		Map<Integer, Boolean> avil = new HashMap<Integer, Boolean>();
		int time = 0;
		int build_cnt = 0, build_arr_cnt = 0;
		
		for (int i = 0; i < case_num; i++) {
			String build = scanner.next();
			String build_time = scanner.next();
			build_cnt = Integer.parseInt(build.split(" ")[0]);
			build_arr_cnt = Integer.parseInt(build.split(" ")[1]);
			map.put(i+1, Integer.parseInt(build_time.split(" ")[i]));
			avil.put(i+1, false);
		}
		
		for (int i = 0; i < build_arr_cnt; i++) {
			String build_arr = scanner.next();
			int first = Integer.parseInt(build_arr.split(" ")[0]);
			int second = Integer.parseInt(build_arr.split(" ")[1]);
			
			if (avil.get(first)) {
				if (time > map.get(first)) {
					if (time - map.get(first) < map.get(second)) {
						
					}
				}
			} else {
				time =+ map.get(first);
			}
		}
	}
}