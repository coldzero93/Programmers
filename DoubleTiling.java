/*2 x n 타일링 - Level 5
1x1 정사각형 2개가 붙어 있는 타일이 있습니다.
이 타일을 이용하여 총 2xN 의 보드판을 채우려고 합니다.
타일은 가로, 세로 두 가지 방향으로 배치할 수 있습니다.
보드판의 길이 N이 주어질 때, 2xN을 타일로 채울 수 있는 경우의 수를 반환하는 tiling 함수를 완성하세요.

단, 리턴하는 숫자가 매우 커질 수도 있으므로 숫자가 5자리를 넘어간다면 맨 끝자리 5자리만 리턴하세요.
예를 들어 N = 2일 경우 가로로 배치하는 경우와 세로로 배치하는 경우가 있을 수 있으므로 2를 반환해 주면 됩니다.
하지만 만약 답이 123456789라면 56789만 반환해주면 됩니다.
리턴하는 숫자의 앞자리가 0일 경우 0을 제외한 숫자를 리턴하세요.
리턴타입은 정수형이어야 합니다.*/

class DoubleTiling { // nCr을 이용한 풀이도 가능하긴 함
	
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
		// 아래는 테스트로 출력해 보기 위한 코드입니다.
		System.out.println(tryHelloWorld.tiling(850));
	}
}

//class TryHelloWorld { // DP를 연상하여 피보나치수열로 푸는 것이 가장 우수
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
//		// 아래는 테스트로 출력해 보기 위한 코드입니다.
//		System.out.println(tryHelloWorld.tiling(2));
//	}
//}