/*[�ְ��� ���� - Level 4]
�ڿ��� N���� �̷���� ���� �߿�, �� ������ ���� S�� �Ǵ� ���� ������ ���� ������ �����մϴ�.
�ְ��� ������, ���� ������ �����ϴ� ���� �� �� ������ ���� �ִ밡 �Ǵ� ������ �ǹ��մϴ�.
���� ������ ���� n�� ���ҵ��� �� s�� �־�����,
�ְ��� ������ ã�� ���Ҹ� ������������ ��ȯ���ִ� bestSet �Լ��� ����� ������.
���� ������ �����ϴ� ������ ���� ���� �迭 �� �տ� -1�� ��� ��ȯ�ϸ� �˴ϴ�.
���� ��� n=3, s=13�̸� [4,4,5]�� ��ȯ�˴ϴ�.
(�ڹٴ� ������ ���� ��� ũ�Ⱑ 1�� �迭�� -1�� ��� ��ȯ���ּ���.)*/

import java.util.Arrays; //�׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.

public class BestSet {

    public int[] bestSet(int n, int s){
    	int[] answer;
    	if(n > s) {
    		answer = new int[1];
    		answer[0] = -1;
    	} else {
    		answer = new int[n];
    		int q1 = s / n;
    		int q2 = q1 + 1;
    		int r = s % n;
    		for(int i=0; i<n-r; i++) answer[i] = q1;
    		for(int i=n-r; i<n; i++) answer[i] = q2; 
    	}
    	return answer;
    }
    public static void main(String[] args) {
        BestSet c = new BestSet();
        //�Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
        System.out.println(Arrays.toString(c.bestSet(3,13)));
    }

}