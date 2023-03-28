package algorithm;

import java.util.Arrays;

public class Average {
	class Solution {

		public double solution(int[] arr) {

			return Arrays.stream(arr).average().getAsDouble();

		}

	}
}
//		public double solution(int[] arr) {
//			double answer = 0;
//			double plusAll = 0;
//			for (int i = 0; i < arr.length; i++) {
//				plusAll += arr[i];
//				answer = plusAll / arr.length;
//			}
//			return answer;
//		}