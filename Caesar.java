/*[���� ��ȣ - Level 3]
� ������ �� ���ĺ��� ������ �Ÿ���ŭ �о �ٸ� ���ĺ����� �ٲٴ� ��ȣȭ ����� ���� ��ȣ��� �մϴ�.

A�� 3��ŭ �и� D�� �ǰ� z�� 1��ŭ �и� a�� �˴ϴ�. ������ �������� �ʽ��ϴ�.

���� ���ڿ� s�� �󸶳� ���� �˷��ִ� n�� �Է¹޾� ��ȣ���� ����� caesar �Լ��� �ϼ��� ������.

��a B z��,4�� �Է¹޾Ҵٸ� ��e F d���� �����մϴ�.*/

class Caesar {
	String caesar(String s, int n) {
		char[] code = s.toCharArray();
		for(int i=0; i<code.length; i++) {
			if(Character.isUpperCase(code[i]))
				code[i] = (char) ('A' + (code[i] - 'A' + n) % 26);
			else if(Character.isLowerCase(code[i]))
				code[i] = (char) ('a' + (code[i] - 'a' + n) % 26);
		}
		return new String(code);
	}

	public static void main(String[] args) {
		Caesar c = new Caesar();
		System.out.println("s�� 'a B z', n�� 4�� ���: " + c.caesar("a B z", 4));
	}
}