/*[��ձ��ϱ� - Level 1]
�Լ��� �ϼ��ؼ� �Ű����� list�� ��հ��� return�ϵ��� ����� ������.
��� ũ���� list�� �͵� ��հ��� ���� �� �־�� �մϴ�.*/

public class GetMean {
    public int getMean(int[] array) {
    	int sum=0;
    	for(int num : array) sum += num;
        return sum / array.length;
//        return (int)Arrays.stream(array).average().orElse(0);
    }

    public static void main(String[] args) {
        int x[] = {5, 4, 3};
        GetMean getMean = new GetMean();
        // �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
        System.out.println("��հ� : " + getMean.getMean(x));
    }
}