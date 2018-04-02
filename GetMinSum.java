/*[�ּڰ� ����� - Level 2]
�ڿ����� �̷���� ���̰� ���� ���� A,B�� �ֽ��ϴ�.
�ּڰ� ������ A, B���� ���� �� ���� ���ڸ� �̾� �� ���� ���� ���� �����Ͽ� ���մϴ�.
�̷��� ������ ������ ���̸�ŭ �ݺ��Ͽ� ���������� ������ ���� �ּҰ� �ǵ��� ����� ���� ��ǥ�Դϴ�.

���� ��� A = [1, 2] , B = [3, 4] ���
1. A���� 1, B���� 4�� �̾� ���Ͽ� ���մϴ�.
2. A���� 2, B���� 3�� �̾� ���Ͽ� ���մϴ�.

������ ���̸�ŭ �ݺ��Ͽ� �ּڰ� 10�� ���� �� ������, �� 10�� �ּڰ��� �˴ϴ�.
���� A,B�� �־��� ��, �ּڰ��� ��ȯ���ִ� getMinSum �Լ��� �ϼ��ϼ���.*/

import java.util.Arrays;

class GetMinSum
{
    public int getMinSum(int []A, int []B)
    {
    	Arrays.sort(A);
    	Arrays.sort(B);
    	int answer = 0;
    	int len = A.length-1;
    	for(int i=0; i<=len; i++)
    		answer += A[i] * B[len-i];
        return answer;
    }
    public static void main(String[] args)
    {
        GetMinSum test = new GetMinSum();
        int []A = {1,2};
        int []B = {3,4};
        System.out.println(test.getMinSum(A,B));
    }
}