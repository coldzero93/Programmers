/*[콜라츠 추측 - Level 2]
1937년 Collatz란 사람에 의해 제기된 이 추측은,
입력된 수가 짝수라면 2로 나누고, 홀수라면 3을 곱하고 1을 더한 다음,
결과로 나온 수에 같은 작업을 1이 될 때까지 반복할 경우 모든 수가 1이 된다는 추측입니다.
예를 들어, 입력된 수가 6이라면 6->3->10->5->16->8->4->2->1이 되어 총 8번 만에 1이 됩니다.
collatz 함수를 만들어 입력된 수가 몇 번 만에 1이 되는지 반환해주세요.
단, 500번을 반복해도 1이 되지 않는다면 -1을 반환해 주세요.*/

class Collatz {
	public int collatz(int num) {
		if(num == 1) return 0;
		long numL = (long) num;
		for(int cnt=1; cnt<=500; cnt++) {
			numL = (numL%2 == 0) ? numL/2 : numL*3 + 1;
			if(numL==1) return cnt;
		}
		return -1;
	}

	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		Collatz c = new Collatz();
		int ex = 704623;
		System.out.println(c.collatz(ex));
	}
}