/*[�ϻ���� - Level 2]
���� ���� x�� �ϻ��� ���̷��� x�� �ڸ����� ������ x�� ���������� �մϴ�.
������� 18�� �ڸ��� ���� 1+8=9�̰�, 18�� 9�� ������ �������Ƿ� 18�� �ϻ��� ���Դϴ�.

Harshad�Լ��� ���� ���� n�� �Ű������� �Է¹޽��ϴ�.
�� n�� �ϻ�������� �ƴ��� �Ǵ��ϴ� �Լ��� �ϼ��ϼ���.
������� n�� 10, 12, 18�̸� True�� ���� 11, 13�̸� False�� �����ϸ� �˴ϴ�.*/

public class HarshadNumber{
	public boolean isHarshad(int num){

		int n=num;
		int sum=0;
		
		while(n>0) {
			sum += n%10;
			n /= 10;
		}

		return num % sum == 0;
	}
  
       // �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
	public static void  main(String[] args){
		HarshadNumber sn = new HarshadNumber();
		System.out.println(sn.isHarshad(18));
	}
}