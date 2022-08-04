package No1002;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int case_num = 0;
		int x1, y1, r1, x2, y2, r2 = 0;
		
		Scanner scanner = new Scanner(System.in);
		case_num = scanner.nextInt();
		
		for (int i = 0; i < case_num; i++) {			
			x1 = scanner.nextInt();
			y1 = scanner.nextInt();
			r1 = scanner.nextInt();
			x2 = scanner.nextInt();
			y2 = scanner.nextInt();
			r2 = scanner.nextInt();
			
			// 두 터렛 간의 거리 계산
			int dx = x2 - x1, dy = y2 - y1;
			
			
			// 1.접점이 무한 
			// - 두 터렛의 위치와 적의 위치가 동일함
			if ((x1 == x2) && (y1 == y2) && (r1 == r2)) System.out.println(-1);
			
			// 2. 접점이 없음
			// - 두 점 사이의 거리가 각 원의 반지름 합보다 크다.
			// ((x2 - x1)제곱 + (y2 - y1)제곱) > (r1 + r2)제곱
			// - 한 원 안에 다른 원이 있으면서 접점이 없음
			// ((x2 - x1)제곱 + (y2 - y1)제곱) < (r2 - r1)제곱
			else if (((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)) > ((r2 + r1) * (r2 + r1))
				|| ((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)) < ((r2 - r1) * (r2 - r1))) 
				System.out.println(0);
			
			// 3. 접점이 한 개일 때
			// - 내접 할 때
			// ((x2 - x1)제곱 + (y2 - y1)제곱) = (r2 - r1)제곱
			// - 외접 할 때
			// ((x2 - x1)제곱 + (y2 - y1)제곱) = (r1 + r2)제곱
			else if (((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)) == ((r2 + r1) * (r2 + r1))
				|| ((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)) == ((r2 - r1) * (r2 - r1)))
				System.out.println(1);
			
			// 4. 접점이 두 개 일 때
			else System.out.println(2);
		}
		
	}
}