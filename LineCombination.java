/*�� ���� ��� - Level 5
N���� ����� ���� ��, N���� ����� ���� �ٸ� ������� ���� ����� ����� N!���� �����մϴ�.

�� �� ������ ����鿡�� ��ȣ�� �Űܼ� ���� ���� ����� ǥ���մϴ�. ������� [1,2,3,4]�� 1�� ����� ���� �տ�, 2�� ����� 2�ι�°��... �� �ִ� ���¸� ��Ÿ���ϴ�.

�̷��� ������ ����� ���������� ���������� K��° ������� ���� ����� ����� ã�� ������ �մϴ�.

���� ��� 3���� ����� �ִٸ� �� 6���� ����� ������ ���� ������ �� �ֽ��ϴ�.

1��° ����� [1,2,3]
2��° ����� [1,3,2]
3��° ����� [2,1,3]
4��° ����� [2,3,1]
5��° ����� [3,1,2]
6��° ����� [3,2,1]
�� �� K�� 5�̸� [3,1,2]�� �� ����Դϴ�.

����� �� N�� ���� K�� �Է¹޾� K��° ������� ���� ����� setAlign �Լ��� �ϼ��� ������. ���� ��� setAlign(3,5)�� �Է¹޴´ٸ� [3,1,2]�� �������ָ� �˴ϴ�.*/

import java.util.ArrayList;
import java.util.Arrays;

class LineCombination {
	public int[] setAlign(int n, long k) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		int[] answer = new int[n];
		long fact=1;
		int q;
		k--;
		for(int i=1; i<=n; i++) {
			list.add(i);
			fact *= i;
		}
		for(int i=n; i>=1; i--) {
			fact /= i;
			q = (int)(k/fact);
			k %= fact;
			answer[n-i] = list.get(q);
			list.remove(q);
		}

		return answer;
	}

	// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
	public static void main(String[] args) {
		LineCombination lc = new LineCombination();
		System.out.println(Arrays.toString(lc.setAlign(3, 5)));
	}
}