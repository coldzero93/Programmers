/*[�Ǻ���ġ �� - Level 1]
�Ǻ���ġ ���� F(0) = 0, F(1) = 1�� ��, 2 �̻��� n�� ���Ͽ� F(n) = F(n-1) + F(n-2) �� ����Ǵ� ��ȭ���Դϴ�.
2 �̻��� n�� �ԷµǾ��� ��, fibonacci �Լ��� �����Ͽ� n��° �Ǻ���ġ ���� ��ȯ�� �ּ���.
���� ��� n = 3�̶�� 2�� ��ȯ���ָ� �˴ϴ�. */

class Fibonacci {
	public long fibonacci(int num) {

		long[] fibo = new long[num+1];

		fibo[0] = 0;
		fibo[1] = 1;

		for(int i=2; i<=num; i++)
			fibo[i] = fibo[i-1] + fibo[i-2];
		
		return fibo[num];

	}

	// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
	public static void main(String[] args) {
		Fibonacci c = new Fibonacci();
		int testCase = 120;
		System.out.println(c.fibonacci(testCase));
	}
}