/*�ùٸ� ��ȣ - Level 8
�ùٸ� ��ȣ�� (())�� ()�� ���� �ùٸ��� ��� ���� ��ȣ�� �ǹ��մϴ�.
)(�� ())() �� ���� ��ȣ�� �ùٸ��� ���� ��ȣ�� �˴ϴ�.\
��ȣ�� �̸����� �����̸� �ùٸ� ��ȣ�� ã�� ��ȣ�� N���� ��ȣ���� ���� ��, �ùٸ� ��ȣ�� ���� �� �ִ� ����� ���� �ñ��������ϴ�.
��ȣ ���� ���� N���� �־����� ��, ����� ���� ��ȯ�ϴ� parenthesisCase �Լ��� �ϼ��� ������.
���� ��� N = 1�� ���� () �� 1������ �����ϹǷ� 1�� �����ϸ� �˴ϴ�.
3�� ��쿡�� ((())), (())(), ()(()), ()()(), (()()) �� 5������ �����ϹǷ� 5�� �����ϸ� �˴ϴ�.*/

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
//	// ������ ���� main�Դϴ�.
//	public static void main(String[] args) {
//		CorrectParenthesis cp = new CorrectParenthesis();
//		if(cp.parenthesisCase(3).equals(new BigInteger("5")))
//		{
//			System.out.println("parenthesisCase(3)�� ���� �����մϴ�. ������ ������ �ٸ� ��쿡�� �������� Ȯ���� ������.");
//		}
//		else
//		{
//			System.out.println("parenthesisCase(3)�� ���� �������� �ʽ��ϴ�.");
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

	// ������ ���� main�Դϴ�.
	public static void main(String[] args) {
		CorrectParenthesis cp = new CorrectParenthesis();
		for(int n=1; n<=100; n++)
			System.out.println("n=" + n + ", ��ȣ=" + cp.parenthesisCase(n));
	}
}