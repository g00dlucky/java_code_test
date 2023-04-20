package java_code_test;
import java.util.*;

public class java_code_test5 {
	// main 함수가 포함된 클래스입니다.
	public static void main(String[] args){
		// bitonicSolution 클래스의 인스턴스를 생성합니다.
		bitonicSolution T = new bitonicSolution();
		
		// bitonicSolution 함수를 호출하고 반환된 값(answer)을 출력합니다.
		System.out.println(T.bitonicSolution(new int[]{1, 2, 1, 2, 3, 2, 1}));
		System.out.println(T.bitonicSolution(new int[]{1, 1, 2, 3, 5, 7, 4, 3, 1, 2}));
		System.out.println(T.bitonicSolution(new int[]{3, 2, 1, 3, 2, 4, 6, 7, 3, 1}));
		System.out.println(T.bitonicSolution(new int[]{1, 3, 1, 2, 1, 5, 3, 2, 1, 1}));
	}
}

// bitonic sequence의 길이를 구하는 클래스입니다.
class bitonicSolution {
	// nums 배열의 bitonic sequence 길이를 반환하는 함수입니다.
	public int bitonicSolution(int[] nums){
		// bitonic sequence의 길이를 저장할 변수입니다.
		int answer = 0;
		// nums 배열의 길이입니다.
		int n = nums.length;
		
		// nums 배열에서 peak을 찾아서 ArrayList에 저장합니다.
		ArrayList<Integer>peaks = new ArrayList<>();
		for(int i = 1; i < n-1;i++) {
			if(nums[i-1] <nums[i] && nums[i] > nums[i+1]) {
				peaks.add(i);
			}
		}
		
		// ArrayList에 저장된 peak을 이용해서 bitonic sequence의 길이를 계산합니다.
		for(int x : peaks) {
			// x를 중심으로 좌우로 증가하는 부분 수열의 길이를 구합니다.
			int left = x;
			int right = x;
			int cnt = 1;
			
			// 좌측으로 증가하는 부분 수열의 길이를 구합니다.
			while(left-1>=0 && nums[left-1] < nums[left]) {
				left --;
				cnt++;
			}
			
			// 우측으로 증가하는 부분 수열의 길이를 구합니다.
			while(right+1 < n && nums[right]>nums[right+1]) {
				right++;
				cnt++;
			}
			
			// 좌우로 증가하는 부분 수열의 길이를 합해서 answer와 비교합니다.
			answer=Math.max(answer,cnt);	
		}
		
		// bitonic sequence의 길이를 반환합니다.
		return answer;
	}
}
//
//이 부분은 ArrayList에 저장된 peak을 이용하여 bitonic sequence의 길이를 계산하는 과정입니다.
//
//우선, for-each 문을 이용하여 peaks 리스트에 저장된 모든 peak을 하나씩 꺼냅니다. 
//peaks 리스트에 저장된 peak은 배열 nums에서 bitonic sequence의 정점(peak)이 위치한 인덱스입니다.
//
//그 다음, x를 중심으로 좌우로 증가하는 부분 수열의 길이를 구합니다. left와 right는 각각 좌우로 증가하는 부분 수열의 
//끝 인덱스를 나타냅니다. 초기값으로 x를 할당하고, cnt 변수를 1로 초기화합니다. cnt 변수는 좌우로 증가하는 부분 수열의 길이를 
//나타냅니다.
//
//좌측으로 증가하는 부분 수열의 길이를 구하기 위해서는 x에서 왼쪽 방향으로 이동하면서 nums 배열의 값이 증가하는 부분을 찾아야 합니다. 
//while 반복문을 이용해서 nums[left-1] < nums[left] 조건을 만족하는 동안 left를 감소시키면서 cnt를 1씩 증가시킵니다.
//
//우측으로 증가하는 부분 수열의 길이를 구하기 위해서는 x에서 오른쪽 방향으로 이동하면서 nums 배열의 값이 감소하는 부분을 찾아야 
//합니다. while 반복문을 이용해서 nums[right] > nums[right+1] 조건을 만족하는 동안 right를 증가시키면서 cnt를 1씩 증가시킵니다.
//
//마지막으로, 좌우로 증가하는 부분 수열의 길이를 합해서 answer와 비교합니다. answer 변수에는 이전에 찾은 bitonic sequence의 
//길이 중 가장 큰 값이 저장되어 있습니다. 따라서 answer와 좌우로 증가하는 부분 수열의 길이를 합쳐서 가장 큰 값을 answer에 
//저장합니다. 이 과정을 peaks 리스트에 저장된 모든 peak에 대해서 반복합니다.
//
//결과적으로, bitonicSolution 함수는 nums 배열에서 가장 긴 bitonic sequence의 길이를 반환합니다.

//cnt 변수를 1로 초기화하는 이유는 해당 peak이 bitonic sequence에서 시작점이 되는 경우를 고려하기 위해서입니다.
//
//peak의 좌우로 증가하거나 감소하는 부분 수열이 없는 경우, 즉 peak이 bitonic sequence의 시작점이 되는 경우에는 
//좌우 부분 수열의 길이를 0으로 계산해야 합니다. 
//이를 위해서는 초기값으로 cnt 변수를 1로 설정해야 합니다. 따라서 cnt 변수를 1로 초기화합니다.



//for(int i = 0; i < nums.length; i++) {
//	if (nums[i] > nums[i+1] && nums[i] > nums[i-1]) {
//		
//	}
//	
//}