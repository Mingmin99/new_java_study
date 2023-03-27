package algorithm;

public class IceAmericano {

	class Solution {
		public int[] solution(int money) {
			int[] answer = new int[2];
			int americanoPrice = 5500;
			answer[0] = (money / americanoPrice);
			answer[1] = (money % americanoPrice);

			return answer;
		}
	}

}
