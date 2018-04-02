/*[124������ ���� - Level 5]
1,2,4 �� ���� ���ڸ� ���� 124���� �ֽ��ϴ�.
124���󿡼� ����ϴ� ���ڴ� ������ ���� ��ȯ�˴ϴ�.

10������ 1 �� 1
10������ 2 �� 2
10������ 3 �� 4
10������ 4 �� 11
10������ 5 �� 12
10������ 6 �� 14
10������ 7 �� 21
10������ 8 �� 22
10������ 9 �� 24
10������ 10 �� 41
10������ 11 �� 42
10������ 12 �� 44
10������ 13 �� 111

3 + 9 + 27 + 81

10������ �� N�� �Էµ� ��, 124���󿡼� ���� ���ڷ� ��ȯ�Ͽ� ��ȯ���ִ� change124 �Լ��� �ϼ��� ������.
���� ��� N = 10�̸� ��41���� ��ȯ���ָ� �˴ϴ�.
���� Ÿ���� ���ڿ��Դϴ�.*/

class OneTwoFour {
	public String change124(int n) {
		StringBuffer str = new StringBuffer();
		char[] num = {'1', '2', '4'};
		long mod;
		long div1 = 3;
		long div2 = 1;
		while(n > 0) {
			mod = (n % div1 != 0) ? n % div1 : div1;
			str.append(num[(int)(mod / div2 - 1)]);
			n -= mod;
			div1 *= 3;
			div2 *= 3;
//			System.out.println("n : " + n + ", mod : " + mod + ", div1 : " + div1 + ", div2 : " + div2);
		}
		return str.reverse().toString();
	}

	// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
	public static void main(String[] args) {
		OneTwoFour oneTwoFour = new OneTwoFour();
//		System.out.println(oneTwoFour.change124(1054163027));
//		System.out.println(oneTwoFour.change124(1118879704));
		System.out.println(oneTwoFour.change124(1779071910));
//		System.out.println(oneTwoFour.change124(10));
	}
}