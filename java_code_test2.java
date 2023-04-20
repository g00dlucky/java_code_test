package java_code_test;
import java.util.*;
public class java_code_test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RobotSolution T = new RobotSolution();
		int[][] arr1 = {{0, 0, 0, 0, 0}, 
			{0, 1, 1, 0, 0}, 
			{0, 0, 0, 0, 0}, 
			{1, 0, 1, 0, 1}, 
			{0, 0, 0, 0, 0}};
		System.out.println(Arrays.toString(T.robotSolution(arr1, 5)));
		int[][] arr2 = {{0, 0, 0, 1, 0, 1}, 
			{0, 0, 0, 0, 0, 0}, 
			{0, 0, 0, 0, 0, 1}, 
			{1, 1, 0, 0, 1, 0}, 
			{0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0}};
		System.out.println(Arrays.toString(T.robotSolution(arr2, 20)));
		int[][] arr3 = {{0, 0, 1, 0, 0}, 
			{0, 1, 0, 0, 0}, 
			{0, 0, 0, 0, 0}, 
			{1, 0, 0, 0, 1}, 
			{0, 0, 0, 0, 0}};
		System.out.println(Arrays.toString(T.robotSolution(arr3, 25)));
	}

}

class RobotSolution {
	public int[] robotSolution(int[][] board, int k){
		int[] answer = new int[2]; 
		
		int n = board.length;
		int dx[] = {-1,0,1,0}; //로봇이 이동할 수 있도록 하는 x좌표 배열
		int dy[] = {0,1,0,-1}; //로봇이 이동할 수 있도록 하는 y좌표 배열
		int x = 0, y = 0, d = 1, count = 0;//x와 y값은 청소기의 좌표위치변수, d는 dx와 dy의 인덱스변수(로봇의 방향을 바꿈),
										//주어진 k초 동안 while문이 돌아가게 하는 count 변수
		
		while(count < k) {//k초 만큼 로봇이 이동하도록 while문 수행
			count++;
			int nx = x + dx[d]; //로봇의 다음 1초만큼의 x이동좌표를 저장할 nx 변수 생성
			int ny = y + dy[d]; //로봇의 다음 1초만큼의 y이동좌표를 저장할 ny 변수 생성
			if(nx < 0 || nx >= n || ny < 0 || ny >= n || board[nx][ny] == 1) {
				//만약 x이동좌표값과 y이동좌표값이 0보다 작거나, 보드 길이 보다 크거나같거나(5와 배열길이의 충돌), board배열값이 1이라면.. 
				d = (d + 1) % 4;// 로봇을 시계방향으로 90도 이동시킴. (dx[1] -> dx[2]/dy[1] -> [dy[2]
				continue;//아래에서 좌표를 찍어주지 않고 바로 위로 되돌아간다.
			}
			x = nx;
			y = ny;
			
		}
		answer[0] = x;
		answer[1] = y;
		return answer;
	}
}


