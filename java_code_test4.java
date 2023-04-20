package java_code_test;
import java.util.*;

public class java_code_test4 {
	// main 함수가 포함된 클래스입니다.
	public static void main(String[] args) {
		// SeatSolution 클래스의 인스턴스를 생성합니다.
		SeatSolution T = new SeatSolution();
		
		// seatSolution 함수를 호출하고 반환된 배열을 출력합니다.
		System.out.println(Arrays.toString(T.seatSolution(6, 5, 12)));	
		System.out.println(Arrays.toString(T.seatSolution(6, 5, 20)));
		System.out.println(Arrays.toString(T.seatSolution(6, 5, 30)));
		System.out.println(Arrays.toString(T.seatSolution(6, 5, 31)));
	}
}

// 좌석 구조를 계산하는 클래스입니다.
class SeatSolution {
	// c, r, k 값을 받아 좌석 구조에서 k번째 좌석의 위치를 반환하는 함수입니다.
	public int[] seatSolution(int c, int r, int k){
		
		// 반환할 위치를 저장할 배열입니다.
		int[] answer = new int[2];
		
		// k가 좌석의 총 개수를 넘어서면 불가능한 경우이므로 [0, 0]을 반환합니다.
		if(k > c * r) return new int[] {0, 0};
		
		// 좌석 구조를 저장할 2차원 배열입니다.
		int[][] seat = new int[c][r];
		
		// 좌, 상, 우, 하 순서로 이동할 때 필요한 x, y 값 변화를 나타내는 배열입니다.
		int[] dx = {-1, 0, 1, 0};
		int[] dy = {0, 1, 0, -1};
		
		// 현재 위치와 이동 방향을 저장할 변수입니다.
		int x = 0, y =0, count = 1, d =1;
		
		// k번째 좌석을 찾을 때까지 반복합니다.
		while(count < k) {
			// 다음 위치를 계산합니다.
			int nx = x + dx[d];
			int ny = y + dy[d];
			
			// 다음 위치가 좌석 구조를 벗어나거나 이미 다른 좌석이 있는 경우에는 방향을 변경합니다.
			if(nx < 0 || nx >= c || ny < 0 || ny >= r || seat[nx][ny] > 0) {
				d = (d + 1) % 4;
				continue;
			}
			
			// 다음 위치에 좌석 번호를 할당하고, 좌석 번호를 1 증가시킵니다.
			seat[x][y] = count;
			count++;
			
			// 현재 위치를 업데이트합니다.
			x = nx;
			y = ny;
		}
		
		// k번째 좌석의 위치를 반환합니다. 좌석 번호와 좌석 위치는 1부터 시작하므로 1을 더해줍니다.
		answer[0] = x + 1;
		answer[1] = y + 1;
		 return answer;
		 
	}
	}


