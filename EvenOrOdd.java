/*[¦���� Ȧ�� - Level 1]
evenOrOdd �޼ҵ�� int�� num�� �Ű������� �޽��ϴ�.
num�� ¦���� ��� "Even"�� ��ȯ�ϰ� Ȧ���� ��� "Odd"�� ��ȯ�ϵ��� evenOrOdd�� �ڵ带 �ۼ��� ������.
num�� 0�̻��� �����̸�, num�� ������ ���� �����ϴ�.*/

public class EvenOrOdd {
    String evenOrOdd(int num) {
      return num%2==0 ? "Even" : "Odd";
    }

    public static void main(String[] args) {
        EvenOrOdd evenOrOdd = new EvenOrOdd();
        //�Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
        System.out.println("��� : " + evenOrOdd.evenOrOdd(3));
        System.out.println("��� : " + evenOrOdd.evenOrOdd(2));
    }
}