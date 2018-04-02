/*�ϳ����� ž - Level 5
�ϳ����� ž�� ��ǥ���� ������ �����Դϴ�.
�� ���� ����� �ְ� �� ������ ��տ��� ������ ũ�� ������� N���� �׿� �ֽ��ϴ�.
�̷��� �׿� �ִ� ������ ���� ������ ������� ��� �Űܾ� �մϴ�.
��, �� ���� ������ �ϳ��� �̵���ų �� �ְ�, ū ������ ���� ���� ���� ���� �� �����ϴ�.

N���� ������ �� 2^N -1 ���� ������ ���� �̵��� �� �ֽ��ϴ�.
������ ��� �������� ������ �Űܾ� 2^N -1 ������ �ű� �� �ִ����� ���� �𸨴ϴ�.
������ N�� ���� ��, Hanoi �Լ����� ��� �������� 2^N -1 ������ �ű� �� �ִ��� ������ �����ϼ���.

���ϰ��� ǥ�� ����� ������ �����ϴ�.

3���� ����� ������� ���� 1, 2, 3������ ǥ���մϴ�.
������ ���1���� ���3���� �̵��ߴٸ� [1, 3]���� ǥ���մϴ�.
������ ���3���� ���1�� �̵��ߴٸ� [3, 1]�� ǥ���մϴ�.
�̷��� �̵� ������ ��� �迭�� �����ϸ� �˴ϴ�.
������� N�� 2��� �Ʒ� �׸��� ���� �ű� �� �����Ƿ�
���ϰ��� [ [1,2], [1,3], [2,3] ]�Դϴ�.*/

import java.util.Arrays;

class Hanoi {
		
	public int[][] hanoi(int n) {
		int[][] answer = new int[(int)Math.pow(2, n)-1][2];
		int index = 0;
		hanoi(answer, index, n, 1, 3, 2);
		return answer;
	}
	
	private void hanoi(int[][] answer, int index, int n, int from, int to, int by) {
		if(n == 1) {
			answer[index][0] = from;
			answer[index][1] = to;
			index++;
		} else {
			hanoi(answer, index, n-1, from, by, to);
			answer[index][0] = from;
			answer[index][1] = to;
			index++;
			hanoi(answer, index, n-1, by, to, from);
		}
	}

	// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
	public static void main(String[] args) {
		Hanoi h = new Hanoi();
		System.out.println(Arrays.toString(h.hanoi(2)));
	}
	
}

//import java.util.Arrays;
//
//class Hanoi {
//	
//	private int[][] answer;
//	private int index;
//	
//	public int[][] hanoi(int n) {
//		answer = new int[(int)Math.pow(2, n)-1][2];
//		index = 0;
//		hanoi(n, 1, 3, 2);
//		return answer;
//	}
//	
//	private void hanoi(int n, int from, int to, int by) {
//		if(n == 1) {
//			int[] move = {from, to};
//			answer[index++] = move;
//		} else {
//			hanoi(n-1, from, by, to);
//			hanoi(1, from, to, by);
//			hanoi(n-1, by, to, from);
//		}
//
//	}
//
//	// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
//	public static void main(String[] args) {
//		Hanoi h = new Hanoi();
//		System.out.println(Arrays.toString(h.hanoi(2)));
//	}
//	
//}