/*���� ��� - Level 7
A�ÿ����� 0���� �� ���ο� ���� ����� ��ġ�ϱ�� �Ͽ����ϴ�.
���� ����� ��Ģ�� ������ �����ϴ�.

����� ��ȣ�� n�� ��, ���� ó�� ����� n*2 �� ° ��ġ�� ��ġ�մϴ�.
�� ������ n*3, �� ������ n*4, ... �� �����մϴ�.
���� ������ ����� ����ִ� �ڸ���� �� ����� ���� ���ο� ������� ����ֽ��ϴ�.

�������

1�� ����� 2,3,4,5,...�� ��ġ�� �켱 ��ġ�մϴ�.
2�� ����� 4,6,8,10,...�� ��ġ�� ��ġ�մϴ�.
3�� ����� 6,9,...�� ��ġ�� ��ġ�մϴ�.
�̷��� 3�� ��ϱ��� ��ġ�ϰ� ���� ù 10���� ����� 0, 1, 1, 2, 1, 3, 1, 2, 3, 2�� �˴ϴ�.

A�ô� ���̰� 100���� �Ǵ� ���ο� 1�� ��Ϻ��� �����Ͽ� 1000�� �� ��ϱ��� ���� ��Ģ���� ��� ���ҽ��ϴ�.
�� ��, �� �� a�� b�� �Է¹޾� a�� b�� ���̿� ��� ����� ��ȴ��� ����� ���ڸ� �迭�� ��ȯ�ϴ� numberBlock �Լ��� �ϼ��ϼ���.

���� ��� 99999999999990�� 100000000000000�� �Էµȴٸ�
[376830,9999997,7973704,9052401,5422,6414455,9999998,839,14,9999999,10000000]�� ��ȯ�� �ָ� �˴ϴ�.*/

import java.util.Arrays;

class NumberBlock {
	public int[] numberBlock(long begin, long end) {
		int[] answer = new int[(int)(end-begin+1)];
		int sqrt;
		int j;
		long div;
		int num=0;
		long total=0;
		for(long i=begin; i<=end; i++) {
			sqrt = (int)Math.sqrt(i);
			for(j=2; j<=sqrt; j++) {
				if(i % j == 0) {
					div = i / j;
					if(div <= 10000000) {
						answer[num] = (int)(div);
						break;
					} else answer[num] = Math.max(answer[num], j);
				}
			}
			if(i != 1 && answer[num] == 0) answer[num] = 1;
			System.out.println("i:" + i + ", j:" + j + ", answer:" + answer[num]);
			total+=sqrt-j+1;
			num++;
		}
		System.out.println("total:" + total);
		return answer;
	}

	// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
	public static void main(String[] args) {
		NumberBlock nb = new NumberBlock();
//		System.out.println(Arrays.toString(nb.numberBlock(1, 100)));
//		System.out.println(Arrays.toString(nb.numberBlock(99999999999990L, 100000000000000L)));
//		System.out.println(Arrays.toString(nb.numberBlock(31097241562438L, 31097241562489L)));
		System.out.println(Arrays.toString(nb.numberBlock(54494632613516L, 54494632613592L)));
	}
}

//import java.util.Arrays;
//
//class NumberBlock {
//	public int[] numberBlock(long begin, long end) {
//		int[] answer = new int[(int)(end-begin+1)];
//		int std;
//		int j;
//		int num=0;
//		long total=0;
//		for(long i=begin; i<=end; i++) {
//			std = (int)Math.min(i-1, 10000000);
//			for(j=std; j>=2; j--) {
//				if(i % j == 0) {
//					answer[num] = j;
//					break;
//				}
//			}
//			if(i != 1 && answer[num] == 0) answer[num] = 1;
//			System.out.println("i:" + i + ", j:" + j + ", answer:" + answer[num]);
//			total+=std-j+1;
//			num++;
//		}
//		System.out.println("total:" + total);
//
//		return answer;
//	}
//
//	// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
//	public static void main(String[] args) {
//		NumberBlock nb = new NumberBlock();
////		System.out.println(Arrays.toString(nb.numberBlock(1, 10)));
////		System.out.println(Arrays.toString(nb.numberBlock(99999999999990L, 100000000000000L)));
////		System.out.println(Arrays.toString(nb.numberBlock(31097241562438L, 31097241562489L)));
//		System.out.println(Arrays.toString(nb.numberBlock(54494632613516L, 54494632613592L)));
//
//	}
//}