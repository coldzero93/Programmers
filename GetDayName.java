/*[2016�� - Level 2]
2016�� 1�� 1���� �ݿ����Դϴ�. 2016�� A�� B���� ���� �����ϱ��?
�� �� A,B�� �Է¹޾� A�� B���� ���� �������� ����ϴ� getDayName �Լ��� �ϼ��ϼ���.
������ �̸��� �Ͽ��Ϻ��� ����ϱ��� ����

SUN,MON,TUE,WED,THU,FRI,SAT

�� ������ָ� �˴ϴ�.

���� ��� A=5, B=24�� �Էµȴٸ� 5�� 24���� ȭ�����̹Ƿ� TUE�� ��ȯ�ϸ� �˴ϴ�.*/

class GetDayName
{
    public String getDayName(int a, int b)
    {
    	int[] daysOfMonth = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    	String[] dayName = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
    	int day = b;
    	
    	for(int i=0; i<a-1; i++) day += daysOfMonth[i];

        return dayName[day%7];
    }
    public static void main(String[] args)
    {
        GetDayName test = new GetDayName();
        int a=5, b=24;
        System.out.println(test.getDayName(a,b));
    }
}