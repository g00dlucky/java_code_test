package java_code_test;
import java.util.*;
public class java_code_test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution6 T = new Solution6();
		System.out.println(T.solution6(new int[][]{{10, 20, 30}, {12, 15, 20}, {20, 12, 15}, {15, 20, 10}, {10, 15, 10}}));
		System.out.println(T.solution6(new int[][]{{10, 9, 11}, {15, 20, 25}}));	
		System.out.println(T.solution6(new int[][]{{0, 3, 27}, {20, 5, 5}, {19, 5, 6}, {10, 10, 10}, {15, 10, 5}, {3, 7, 20}}));
		System.out.println(T.solution6(new int[][]{{3, 7, 20}, {10, 15, 5}, {19, 5, 6}, {10, 10, 10}, {15, 10, 5}, {3, 7, 20}, {12, 12, 6}, {10, 20, 0}, {5, 10, 15}}));
		
	}

}


class Solution6 {
	public int solution6(int[][] fruit){
		int answer = 0;
		
		
	
		return answer;
	}
	
	
	public int minCal(int[] fruit) {
		
		int min = 100;
		for(int x : fruit) {
			min = Math.min(min, x);
		}
		return min;
	}

	public int indexLine(int[] fruit) {
		int min = minCal(fruit);
		for(int i = 0; i < 3; i++) {
			if(fruit[i] == min) return i;
		}
	return 0; //if구문의 else느낌
	}
	
	
	
	
	
	
}


//public int minCal(int[] fruit) {
//int[] result = new int[fruit.length];
//int i = 0;
//
//for(int[] line : fruit) {
//	int min = line[0];
//	for(int num : line) {
//		if (num < min) {
//            min = num;
//        }
//	}
//	 result[i++] = min;
//}
//return result;
//
//}