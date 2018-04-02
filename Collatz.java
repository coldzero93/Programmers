/*[�ݶ��� ���� - Level 2]
1937�� Collatz�� ����� ���� ����� �� ������,
�Էµ� ���� ¦����� 2�� ������, Ȧ����� 3�� ���ϰ� 1�� ���� ����,
����� ���� ���� ���� �۾��� 1�� �� ������ �ݺ��� ��� ��� ���� 1�� �ȴٴ� �����Դϴ�.
���� ���, �Էµ� ���� 6�̶�� 6->3->10->5->16->8->4->2->1�� �Ǿ� �� 8�� ���� 1�� �˴ϴ�.
collatz �Լ��� ����� �Էµ� ���� �� �� ���� 1�� �Ǵ��� ��ȯ���ּ���.
��, 500���� �ݺ��ص� 1�� ���� �ʴ´ٸ� -1�� ��ȯ�� �ּ���.*/

class Collatz {
	public int collatz(int num) {
		if(num == 1) return 0;
		long numL = (long) num;
		for(int cnt=1; cnt<=500; cnt++) {
			numL = (numL%2 == 0) ? numL/2 : numL*3 + 1;
			if(numL==1) return cnt;
		}
		return -1;
	}

	// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
	public static void main(String[] args) {
		Collatz c = new Collatz();
		int ex = 704623;
		System.out.println(c.collatz(ex));
	}
}