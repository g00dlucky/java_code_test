package java_code_test;
import java.util.*;

public class java_code_test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		puppySolution T = new puppySolution();
		int[][] arr1 = {{0, 0, 0, 0, 0, 0, 1, 0, 0, 0}, 
			{0, 0, 0, 0, 1, 0, 0, 0, 0, 0}, 
			{0, 0, 0, 1, 0, 0, 0, 1, 0, 0}, 
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 
			{0, 0, 0, 1, 0, 0, 0, 2, 0, 0}, 
			{1, 0, 0, 0, 0, 0, 1, 0, 0, 0}, 
			{0, 0, 0, 1, 0, 0, 0, 0, 0, 0}, 
			{0, 0, 0, 0, 0, 3, 0, 0, 0, 1}, 
			{0, 0, 0, 1, 0, 1, 0, 0, 0, 0}, 
			{0, 1, 0, 1, 0, 0, 0, 0, 0, 0}}; 
		System.out.println(T.puppySolution(arr1));
		int[][] arr2 = {{1, 0, 0, 0, 1, 0, 0, 0, 0, 0}, 
			{0, 0, 0, 0, 0, 0, 1, 0, 0, 0}, 
			{0, 0, 1, 1, 0, 0, 0, 1, 0, 0}, 
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 
			{0, 0, 0, 1, 0, 1, 0, 0, 0, 0}, 
			{1, 0, 0, 0, 0, 0, 1, 0, 1, 0}, 
			{0, 0, 0, 1, 0, 0, 0, 0, 0, 0}, 
			{0, 0, 1, 0, 0, 0, 0, 0, 2, 1}, 
			{0, 0, 0, 1, 0, 1, 0, 0, 0, 1}, 
			{0, 1, 0, 1, 0, 0, 0, 0, 0, 3}}; 
		System.out.println(T.puppySolution(arr2));
	}

}

class puppySolution {
	public int puppySolution(int[][] board){
		
		int n = board.length;
		int dx[] = {-1,0,1,0}; //로봇이 이동할 수 있도록 하는 x좌표 배열
		int dy[] = {0,1,0,-1}; //로봇이 이동할 수 있도록 하는 y좌표 배열
		int x1 = 0, y1 = 0, x2 = 0, y2 = 0;
				
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(board[i][j] == 2) {//현수의 현재 좌표 찾기
					x1 = i;
					y1 = j;
				}
				if(board[i][j]== 3) {//강아지의 현재 좌표 찾기
					x2 = i;
					y2 = j;
				}
			}
		}
		
		int d1 = 0, d2 = 0, count = 0;
		
		
		while(count < 10000) {//10000초 만큼 로봇이 이동하도록 while문 수행
			count++;
			int nx1 = x1 + dx[d1]; //로봇의 다음 1초만큼의 x이동좌표를 저장할 nx 변수 생성
			int ny1 = y1 + dy[d1]; //로봇의 다음 1초만큼의 y이동좌표를 저장할 ny 변수 생성
			int nx2 = x2 + dx[d2]; //로봇의 다음 1초만큼의 x이동좌표를 저장할 nx 변수 생성
			int ny2 = y2 + dy[d2]; //로봇의 다음 1초만큼의 y이동좌표를 저장할 ny 변수 생성
			
			boolean flag1 = true, flag2 = true;
			if(nx1 < 0 || nx1 >= n || ny1 < 0 || ny1 >= n || board[nx1][ny1] == 1) {
				//만약 x이동좌표값과 y이동좌표값이 0보다 작거나, 보드 길이 보다 크거나같거나(5와 배열길이의 충돌), board배열값이 1이라면.. 
				d1 = (d1 + 1) % 4;// 로봇을 시계방향으로 90도 이동시킴. (dx[1] -> dx[2]/dy[1] -> [dy[2]
				flag1 = false;// 조건이 2개 이기 때문에 continue대신  boolean을 써준다.
			}
			
			if(nx2 < 0 || nx2 >= n || ny2 < 0 || ny2 >= n || board[nx2][ny2] == 1) {
				//만약 x이동좌표값과 y이동좌표값이 0보다 작거나, 보드 길이 보다 크거나같거나(5와 배열길이의 충돌), board배열값이 1이라면.. 
				d2 = (d2 + 1) % 4;// 로봇을 시계방향으로 90도 이동시킴. (dx[1] -> dx[2]/dy[1] -> [dy[2]
				flag2 =false;
			}
			if (flag1 == true) {
				x1 = nx1;
				y1 = ny1;
			}
			
			if (flag2 == true) {
				x2 = nx2;
				y2 = ny2;
			}
			if(x1 == x2 && y1 == y2) break;
		}
		if(count >= 10000) return 0;
		return count;
	}
}




