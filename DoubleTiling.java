/*2 x n Ÿ�ϸ� - Level 5
1x1 ���簢�� 2���� �پ� �ִ� Ÿ���� �ֽ��ϴ�.
�� Ÿ���� �̿��Ͽ� �� 2xN �� �������� ä����� �մϴ�.
Ÿ���� ����, ���� �� ���� �������� ��ġ�� �� �ֽ��ϴ�.
�������� ���� N�� �־��� ��, 2xN�� Ÿ�Ϸ� ä�� �� �ִ� ����� ���� ��ȯ�ϴ� tiling �Լ��� �ϼ��ϼ���.

��, �����ϴ� ���ڰ� �ſ� Ŀ�� ���� �����Ƿ� ���ڰ� 5�ڸ��� �Ѿ�ٸ� �� ���ڸ� 5�ڸ��� �����ϼ���.
���� ��� N = 2�� ��� ���η� ��ġ�ϴ� ���� ���η� ��ġ�ϴ� ��찡 ���� �� �����Ƿ� 2�� ��ȯ�� �ָ� �˴ϴ�.
������ ���� ���� 123456789��� 56789�� ��ȯ���ָ� �˴ϴ�.
�����ϴ� ������ ���ڸ��� 0�� ��� 0�� ������ ���ڸ� �����ϼ���.
����Ÿ���� �������̾�� �մϴ�.*/

class DoubleTiling { // nCr�� �̿��� Ǯ�̵� �����ϱ� ��
	
	private int[][] dp;
	
	public int tiling(int n) {
		int answer = 0;
		dp = new int[n+1][n/2+1];
		for(int i=0; i<=n/2; i++)
			answer = (answer + nCr(n-i,i)) % 100000;
		return answer;
	}

	private int nCr(int n, int r) {
		if(dp[n][r] != 0) return dp[n][r];
		else if(r==0 || n==r) dp[n][r] = 1;
		else if((r > n-r)) dp[n][r] = nCr(n,n-r);
		else dp[n][r] = (nCr(n-1,r-1) + nCr(n-1,r)) % 100000;
		return dp[n][r];
	}

	public static void main(String args[]) {
		DoubleTiling tryHelloWorld = new DoubleTiling();
		// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
		System.out.println(tryHelloWorld.tiling(850));
	}
}

//class TryHelloWorld { // DP�� �����Ͽ� �Ǻ���ġ������ Ǫ�� ���� ���� ���
//	
//	public int tiling(int n) {
//		int fib, a = 1, b = 1;
//		for(int i=0; i<n-1; i++) {
//			fib = (a + b) % 100000;
//			a = b;
//			b = fib;
//		}
//		return b;
//	}
//
//	public static void main(String args[]) {
//		TryHelloWorld tryHelloWorld = new TryHelloWorld();
//		// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
//		System.out.println(tryHelloWorld.tiling(2));
//	}
//}