package java_code_test;
import java.util.*;
public class java_code_test1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution T = new Solution();
		System.out.println(Arrays.toString(T.solution(5, new int[][]{{1, 3}, {2, 4}, {1, 4}})));
		System.out.println(Arrays.toString(T.solution(7, new int[][]{{1, 3, 5}, {1, 3, 6}, {2, 4}})));
		System.out.println(Arrays.toString(T.solution(8, new int[][]{{1, 5}, {2, 4, 7}, {1, 5, 7}, {2, 5, 7}})));
		System.out.println(Arrays.toString(T.solution(12, new int[][]{{1, 5, 8, 10}, {2, 4, 7}, {1, 5, 7, 9, 11}, {2, 5, 7, 10}, {3, 6, 8, 11}})));
	}
}
	class Solution {
		public char[] solution(int n, int[][] ladder){
			char[] answer = new char[n];//사람수 n값을 받아 char 자료형의 answer 배열에 길이로 지정. 
			
			if (n < 3 || n > 25) {
	            throw new IllegalArgumentException("n은 3 and 25사이의 변수여야 합니다");
	        }
	        if (ladder.length > 1000) {
	            throw new IllegalArgumentException("ladder의 길이는 1000을 넘을 수 없습니다");
	        }
	        for (int i = 0; i < ladder.length; i++) {
	            if (ladder[i].length > 10) { // ladder[i]의 길이를 검사
	                throw new IllegalArgumentException("ladder[i]의 길이는 10을 넘지 않습니다.");
	            }
	        }
			 
			 
			for(int i = 0; i < n; i++) { 
				answer[i] = (char)(65 + i);  //A,B,C,D,E 문자를 answer배열에 하나씩 저장.
			}
			
			for(int[] line : ladder) { //정수형 2차원 배열 ladder의 값 {1,3},{2,4},{1,4}를 정수형 일차원 배열 line으로 연결받아 저장. 
										//i가 한번 돌때마다 {1,3}이 line에 저장.
				for(int x : line) {// 정수형 1차원 배열 line의 값을 하나하나 int x에 저장. {1},{3},{2},{4},{1},{4} 
					char tmp = answer[x];//배열안의 값들을 swap시키는데 필요한 변수 tmp선언. 예를 들어 answer[1]의 값인 B가 tmp에 저장.
					answer[x] = answer[x-1]; // answer[1] = answer[0] answer 배열 1번에, answer0에 있던 'A'글자가 answer[1]위치로 이동.
					answer[x-1] = tmp; //answer[0] = tmp , answer 배열 0번에 tmp에 저장된 'B'값이 저장.
				}	
			}
			
			return answer;
			
			

		}
		
	}
