/*[�ﰢ������ϱ� - Level 1]
printTriangle �޼ҵ�� ���� ���� num�� �Ű������� �Է¹޽��ϴ�.
������ ������ *(��)�� ���̰� num�� �ﰢ���� ���ڿ��� �����ϴ� printTriangle �޼ҵ带 �ϼ��ϼ���
printTriangle�� return�ϴ� String�� ���๮��('\n')�� ������ �մϴ�.

1. ���̰� 3�϶�	2. ���̰� 5�϶�
*				*
**				**
***				***
				****
				*****
*/

public class PrintTriangle {
	public String printTriangle(int num){
		StringBuffer sb = new StringBuffer();
		StringBuffer star = new StringBuffer("*");
		for(int i=0; i<num; i++) {
			sb.append(star + "\n");
			star.append("*");
		}
		return sb.toString();		
	}

	// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
	public static void main(String[] args) {
		PrintTriangle pt = new PrintTriangle();
		System.out.println( pt.printTriangle(3) );
	}
}