/*[������ �������� ���� �迭 - Level 1]
divisible �޼ҵ�� int�� �迭 array�� int divisor�� �Ű������� �޽��ϴ�.
array�� �� element �� divisor�� ������ �������� ���� �����ϴ� ���ο� �迭�� ���� ��ȯ�ϵ��� divisible�� �ڵ带 �ۼ��� ������.
������� array�� {5, 9, 7, 10}�̰� divisor�� 5�̸� {5, 10}�� �����ؾ� �մϴ�.*/

import java.util.ArrayList;

import java.util.Arrays;

class Divisible {
	public int[] divisible(int[] array, int divisor) {
		//ret�� array�� ���Ե� ������, divisor�� ������ �������� ���ڸ� ������� ��������.

		ArrayList<Integer> retList = new ArrayList<Integer>();

		for(int i=0; i<array.length; i++)
			if(array[i] % divisor == 0) retList.add(array[i]);
		
		int[] ret = new int[retList.size()];
		
		for(int i=0; i<retList.size(); i++)
			ret[i] = retList.get(i);

		return ret;
		
//		return Arrays.stream(array).filter(factor -> factor % divisor == 0).toArray(); // ���� ������ �ڵ�
	}
	// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
	public static void main(String[] args) {
		Divisible div = new Divisible();
		int[] array = {5, 9, 7, 10};
		System.out.println( Arrays.toString( div.divisible(array, 5) ));
	}
}