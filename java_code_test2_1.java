package java_code_test2;

import java.util.HashMap;

public class java_code_test2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Solution1 T = new Solution1();
		System.out.println(T.solution1("statitsics"));
		System.out.println(T.solution1("aabb"));
		System.out.println(T.solution1("stringshowtime"));
		System.out.println(T.solution1("abcdeabcdfg"));
		
		
		
	}

}


class Solution1 {
	public int solution1(String s){
		//int answer = 0;

		String str1 = s;
		HashMap<Character,Integer> a = new HashMap<>();
		
		for(int i = 0; i < str1.length(); i++) {
			char char1 = str1.charAt(i);
			a.put(char1, a.getOrDefault(char1, 0) + 1); //str1이 없으면 0. +1은 
		}
		
//		for(char x : str1.toCharArray()) {
//			a.put(x,a.getOrDefault(a, 0) + 1);
//		}
		
		for(int i = 0; i < str1.length(); i++) {
			if(a.get(str1.charAt(i))== 1) return i + 1;
		} 
			
		return -1;
	}
	
	
}