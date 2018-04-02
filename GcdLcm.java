/*[�ִ������� �ּҰ���� - Level 1]
�� ���� �Է¹޾� �� ���� �ִ������� �ּҰ������ ��ȯ���ִ� gcdlcm �Լ��� �ϼ��� ������.
�迭�� �� �տ� �ִ�����, �� ���� �ּҰ������ �־� ��ȯ�ϸ� �˴ϴ�.
���� ��� gcdlcm(3,12) �� �ԷµǸ�, [3, 12]�� ��ȯ���ָ� �˴ϴ�.*/

import java.util.Arrays;

class GcdLcm {
    public int[] gcdlcm(int a, int b) {
        int[] answer = new int[2];

        int max = Math.max(a, b);
        int min = Math.min(a, b);
        int temp;
        
        while(true) {
        	if(max % min == 0) {
        		answer[0] = min;
        		answer[1] = a * b / min;
        		break;
        	} else {
        		temp = min;
        		min = max % min;
        		max = temp;
        	}
        }
        
        return answer;
    }

    // �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
    public static void main(String[] args) {
        GcdLcm c = new GcdLcm();
        System.out.println(Arrays.toString(c.gcdlcm(3, 12)));
    }
}