/*[수박수박수박수박수박수? - Level 1]
water_melon함수는 정수 n을 매개변수로 입력받습니다.
길이가 n이고, 수박수박수...와 같은 패턴을 유지하는 문자열을 리턴하도록 함수를 완성하세요.

예를들어 n이 4이면 '수박수박'을 리턴하고 3이라면 '수박수'를 리턴하면 됩니다.
*/

public class WaterMelon {
	public String watermelon(int n){
		
		StringBuffer result = new StringBuffer(); // String클래스는 문자열을 덧붙일때마다 새로운 메모리 공간을 확보하므로, 
												  // n이 커질 경우를 대비하여 StringBuffer클래스를 활용하는 것이 바람직함.
		
		char soo = '수';
		char bak = '박';
		
		for(int i=0; i<n; i++) 
			result.append(i%2==0 ? soo : bak);

		return result.toString();
		// return new String(new char [n/2+1]).replace("\0", "수박").substring(0,n); // 한줄짜리 코드도 있으니 참조.
	}

	// 실행을 위한 테스트코드입니다.
	public static void  main(String[] args){
		WaterMelon wm = new WaterMelon();
		System.out.println("n이 3인 경우: " + wm.watermelon(3));
		System.out.println("n이 4인 경우: " + wm.watermelon(4));
	}
}