package java_code_test2;
import java.util.*;
public class java_code_test2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution2 T = new Solution2();
		System.out.println(Arrays.toString(T.solution2("aaabc")));
//		System.out.println(Arrays.toString(T.solution2("aabb")));
//		System.out.println(Arrays.toString(T.solution2("abcde")));
//		System.out.println(Arrays.toString(T.solution2("abcdeabc")));
//		System.out.println(Arrays.toString(T.solution2("abbccddee")));
	}

}

class Solution2 { //max값 찾기
	public int[] solution2(String s){
		int[] answer = new int[5];
		String str1 = "abcde";
		
		HashMap<Character,Integer> a = new HashMap<>();
		
		for(char x : s.toCharArray()) {
			a.put(x, a.getOrDefault(x, 0) + 1);
		}
		//'de' 를 추가하는 법
		
		
		//max값 찾기
		int max = 0;
		for(int i = 0; i < answer.length; i++) {
			if(a.get(s.charAt(i)) > max) {
				max = a.get(s.charAt(i));
			}
		}
		System.out.println(max);
		
		
		
		//answer배열에 값 추가하기
		for(int i = 0; i < str1.length(); i++) {
			answer[i] = max - a.getOrDefault(str1.charAt(i),0);
		}
		
		
		
		
//		for(int i = 0; i < s.length(); i++) {
//			if(a.get(s.charAt(i))== 1)  {
//				
//			}
//		} 
		
		
		return answer; 
	}
}