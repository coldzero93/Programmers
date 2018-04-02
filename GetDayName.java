/*[2016년 - Level 2]
2016년 1월 1일은 금요일입니다. 2016년 A월 B일은 무슨 요일일까요?
두 수 A,B를 입력받아 A월 B일이 무슨 요일인지 출력하는 getDayName 함수를 완성하세요.
요일의 이름은 일요일부터 토요일까지 각각

SUN,MON,TUE,WED,THU,FRI,SAT

를 출력해주면 됩니다.

예를 들어 A=5, B=24가 입력된다면 5월 24일은 화요일이므로 TUE를 반환하면 됩니다.*/

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