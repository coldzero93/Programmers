/*[���ڿ� ������������ ��ġ�ϱ� - Level 1]
reverseStr �޼ҵ�� String�� ���� str�� �Ű������� �Է¹޽��ϴ�.
str�� ��Ÿ���� ���ڸ� ū�ͺ��� ���� ������ ������ ���ο� String�� �������ּ���.
str�� ���� ��ҹ��ڷθ� �����Ǿ� ������, �빮�ڴ� �ҹ��ں��� ���� ������ �����մϴ�.
������� str�� "Zbcdefg"�� "gfedcbZ"�� �����ϸ� �˴ϴ�*/

public class ReverseStr {
	public String reverseStr(String str){
		
		StringBuilder sb = new StringBuilder(str);
		StringBuilder result = new StringBuilder(str.substring(0, 1));
		
		int i, j;
		char a, b;
		
		for(i=1; i<sb.length(); i++) {
			a = sb.charAt(i);
			for(j=0; j<result.length(); j++) {
				b = result.charAt(j);
				if(a >= b) break;
				else continue;
			}
			result.insert(j, a);
		}
		
		return result.toString();
		
//		char[] array = str.toCharArray();
//		Arrays.sort(array);
//		return new StringBuilder(new String(array)).reverse().toString();
		
	}

	// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
	public static void main(String[] args) {
		ReverseStr rs = new ReverseStr();
		System.out.println( rs.reverseStr("Zbcdefg") );
	}
}