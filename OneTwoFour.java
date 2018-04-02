/*[124나라의 숫자 - Level 5]
1,2,4 세 개의 숫자만 쓰는 124나라가 있습니다.
124나라에서 사용하는 숫자는 다음과 같이 변환됩니다.

10진법의 1 → 1
10진법의 2 → 2
10진법의 3 → 4
10진법의 4 → 11
10진법의 5 → 12
10진법의 6 → 14
10진법의 7 → 21
10진법의 8 → 22
10진법의 9 → 24
10진법의 10 → 41
10진법의 11 → 42
10진법의 12 → 44
10진법의 13 → 111

3 + 9 + 27 + 81

10진법의 수 N이 입력될 때, 124나라에서 쓰는 숫자로 변환하여 반환해주는 change124 함수를 완성해 보세요.
예를 들어 N = 10이면 “41”를 반환해주면 됩니다.
리턴 타입은 문자열입니다.*/

class OneTwoFour {
	public String change124(int n) {
		StringBuffer str = new StringBuffer();
		char[] num = {'1', '2', '4'};
		long mod;
		long div1 = 3;
		long div2 = 1;
		while(n > 0) {
			mod = (n % div1 != 0) ? n % div1 : div1;
			str.append(num[(int)(mod / div2 - 1)]);
			n -= mod;
			div1 *= 3;
			div2 *= 3;
//			System.out.println("n : " + n + ", mod : " + mod + ", div1 : " + div1 + ", div2 : " + div2);
		}
		return str.reverse().toString();
	}

	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		OneTwoFour oneTwoFour = new OneTwoFour();
//		System.out.println(oneTwoFour.change124(1054163027));
//		System.out.println(oneTwoFour.change124(1118879704));
		System.out.println(oneTwoFour.change124(1779071910));
//		System.out.println(oneTwoFour.change124(10));
	}
}