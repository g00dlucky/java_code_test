package java_code_test2;
import java.util.*;
public class java_code_test2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Solution3 T = new Solution3();
		System.out.println(T.solution3("aaabbbcc"));	
		System.out.println(T.solution3("aaabbc"));	
		System.out.println(T.solution3("aebbbbc"));	
		System.out.println(T.solution3("aaabbbcccde"));	
		System.out.println(T.solution3("aaabbbcccdddeeeeeff"));	
	}

}

class Solution3 {
	public int[] solution3(String s){
		int answer= 0;
		int[] intArray = new int[s.length()];
		
		HashMap<Character,Integer> a = new HashMap<>();
		
		for(char x : s.toCharArray()) {
			a.put(x, a.getOrDefault(x, 0) + 1);
		}
		
		////max°ª È®ÀÎ 
		int max = Integer.MIN_VALUE;
        Collection<Integer> values = a.values();
        for (int value : values) {
            max = Math.max(max, value);
        }
       
        //
        for(int i = 0; i < s.length(); i++) {
        	intArray[i] = (a.get(s.charAt(i)) - 1);

        }
        
        return intArray;
        
		
	}
}