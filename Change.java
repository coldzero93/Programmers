/*�Ž����� - Level 6
���� ������ ���� ���� �� ��� �Ž������� �����ְ� �˴ϴ�.
�Ž������� �� �ݾ��� ������ �� ���� ������, ���� �ݾ��� ������ ���� �Ž��� �� �� �ֽ��ϴ�.

�Ž������� N���� ��, 1��, 2��, 5�� ������ �ִٸ� �� ���� ������� ���� �Ž��� �� �� �������?
change �Լ��� ���� ����� ���� ��ȯ���ִ� �Լ��� ����� ������.

K���� ����� �� �ִ� ������ ������ ��� �ֽ��ϴ�.
���� ���, N = 5�̰� K = [1, 2, 5]�̸� 1��, 2��, 5�� ������ ������ 5���� ���ߴ� ����� ���� ã���� �˴ϴ�.

1�� 5��
1�� 3��, 2�� 1��
1�� 1��, 2�� 2��
5�� 1��
�̷��� �� 4���� ��찡 ������, 4�� ������ �ָ� �˴ϴ�.*/

class Change {
	
	public int change(int total, int[] coins) {
		int[] dp = new int[total+1];
		for(int i : coins) {
			dp[i]++;
			for(int j=i; j<=total; j++) dp[j] += dp[j-i];
		}
		return dp[total];
	}

	// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
	public static void main(String[] args) {
		Change c = new Change();
		int[] coins = { 1, 2, 5 };
		System.out.println(c.change(5, coins));
	}
}

//import java.util.Arrays;
//
//class Change {
//	public int change(int total, int[] coins) {
//		Arrays.sort(coins);
//		
//		for(int i=coins.length-1; i>=0; i++) {
//		}
//		
//		return 0;
//	}
//
//	// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
//	public static void main(String[] args) {
//		Change c = new Change();
//		int[] coins = { 1, 2, 5 };
//		System.out.println(c.change(5, coins));
//	}
//}

//import java.util.Arrays;
//
//class Change {
//	
//	private int[][] dp;
//	
//	public int change(int total, int[] coins) {
//		Arrays.sort(coins);
//		dp = new int[total+1][coins.length];
//		System.out.println(total + " " + Arrays.toString(coins));
//		int answer = changes(total, coins, coins.length-1);
//		dp = null;
//		return answer;
//	}
//	
//	private int changes(int total, int[] coins, int range) {
//		if(total < 0) return 0;
//		else if(dp[total][range] != 0) return dp[total][range];
//		else {
//			int sum=0;
//			for(int i=range; i>=0; i--) {
//				if(total - coins[i] == 0) dp[total][i] = 1;
//				else dp[total][i] += changes(total - coins[i], coins, i);
//				sum += dp[total][i];
//			}
//			return sum;
//		}
//	}
//
//	// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
//	public static void main(String[] args) {
//		Change c = new Change();
//		int[] coins = { 1, 2, 5 };
//		System.out.println(c.change(10, coins));
//	}
//}