/*[���ڼ��ڼ��ڼ��ڼ��ڼ�? - Level 1]
water_melon�Լ��� ���� n�� �Ű������� �Է¹޽��ϴ�.
���̰� n�̰�, ���ڼ��ڼ�...�� ���� ������ �����ϴ� ���ڿ��� �����ϵ��� �Լ��� �ϼ��ϼ���.

������� n�� 4�̸� '���ڼ���'�� �����ϰ� 3�̶�� '���ڼ�'�� �����ϸ� �˴ϴ�.
*/

public class WaterMelon {
	public String watermelon(int n){
		
		StringBuffer result = new StringBuffer(); // StringŬ������ ���ڿ��� �����϶����� ���ο� �޸� ������ Ȯ���ϹǷ�, 
												  // n�� Ŀ�� ��츦 ����Ͽ� StringBufferŬ������ Ȱ���ϴ� ���� �ٶ�����.
		
		char soo = '��';
		char bak = '��';
		
		for(int i=0; i<n; i++) 
			result.append(i%2==0 ? soo : bak);

		return result.toString();
		// return new String(new char [n/2+1]).replace("\0", "����").substring(0,n); // ����¥�� �ڵ嵵 ������ ����.
	}

	// ������ ���� �׽�Ʈ�ڵ��Դϴ�.
	public static void  main(String[] args){
		WaterMelon wm = new WaterMelon();
		System.out.println("n�� 3�� ���: " + wm.watermelon(3));
		System.out.println("n�� 4�� ���: " + wm.watermelon(4));
	}
}