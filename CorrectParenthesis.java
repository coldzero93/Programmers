/*올바른 괄호 - Level 8
올바른 괄호란 (())나 ()와 같이 올바르게 모두 닫힌 괄호를 의미합니다.
)(나 ())() 와 같은 괄호는 올바르지 않은 괄호가 됩니다.\
괄호를 이리저리 움직이며 올바른 괄호를 찾던 민호는 N개의 괄호쌍이 있을 때, 올바른 괄호를 만들 수 있는 경우의 수가 궁금해졌습니다.
괄호 쌍의 개수 N개가 주어졌을 때, 경우의 수를 반환하는 parenthesisCase 함수를 완성해 보세요.
예를 들어 N = 1일 경우는 () 의 1가지만 존재하므로 1을 리턴하면 됩니다.
3일 경우에는 ((())), (())(), ()(()), ()()(), (()()) 의 5가지가 존재하므로 5를 리턴하면 됩니다.*/

//import java.math.BigInteger;
//
//class CorrectParenthesis
//{
//	private BigInteger[][] dp;
//
//	public BigInteger parenthesisCase(int n)
//	{
//		dp = new BigInteger[n+1][n+1];
//		dp[0][0] = BigInteger.ONE;
//		return get(n, n);
//	}
//	
//	private BigInteger get(int open, int close) {
//		if(dp[open][close] == null) {
//			dp[open][close] = new BigInteger("0");
//			if(open > 0) dp[open][close] = dp[open][close].add(get(open-1, close));
//			if(open < close) dp[open][close] = dp[open][close].add(get(open, close-1));
//		}
//		return dp[open][close];
//	}
//
//	// 실행을 위한 main입니다.
//	public static void main(String[] args) {
//		CorrectParenthesis cp = new CorrectParenthesis();
//		if(cp.parenthesisCase(3).equals(new BigInteger("5")))
//		{
//			System.out.println("parenthesisCase(3)이 정상 동작합니다. 제출을 눌러서 다른 경우에도 정답인지 확인해 보세요.");
//		}
//		else
//		{
//			System.out.println("parenthesisCase(3)이 정상 동작하지 않습니다.");
//		}
//	}
//}

import java.math.BigInteger;

class CorrectParenthesis
{
	private BigInteger[][] dp = new BigInteger[101][101];

	public BigInteger parenthesisCase(int n)
	{
		dp = new BigInteger[n+1][n+1];
		dp[0][0] = BigInteger.ONE;
		return get(n, n);
	}
	
	private BigInteger get(int open, int close) {
		if(dp[open][close] == null) {
			dp[open][close] = new BigInteger("0");
			if(open > 0) dp[open][close] = dp[open][close].add(get(open-1, close));
			if(open < close) dp[open][close] = dp[open][close].add(get(open, close-1));
		}
		return dp[open][close];
	}

	// 실행을 위한 main입니다.
	public static void main(String[] args) {
		CorrectParenthesis cp = new CorrectParenthesis();
		for(int n=1; n<=100; n++)
			System.out.println("n=" + n + ", 괄호=" + cp.parenthesisCase(n));
	}
}