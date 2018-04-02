/*[����� �� - Level 1]
� ���� �Է¹޾� �� ���� ����� ��� ���� �� sumDivisor �Լ��� �ϼ��� ������.
���� ��� 12�� �Էµȴٸ� 12�� ����� [1, 2, 3, 4, 6, 12]�� �ǰ�,
�� ���� 28�� �ǹǷ� 28�� ��ȯ�� �ָ� �˴ϴ�.*/

class SumDivisor {
	public int sumDivisor(int num) {
		int sqrt = (int) Math.sqrt(num);
		int answer = (sqrt*sqrt == num) ? -sqrt : 0;
		for(int i=1; i<=sqrt; i++)
			if(num%i == 0) answer += (i + num/i);
		return answer;
	}

	// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
	public static void main(String[] args) {
		SumDivisor c = new SumDivisor();
		System.out.println(c.sumDivisor(12));
	}
}