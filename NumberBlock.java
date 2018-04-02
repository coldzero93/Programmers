/*숫자 블록 - Level 7
A시에서는 0으로 된 도로에 숫자 블록을 설치하기로 하였습니다.
숫자 블록의 규칙은 다음과 같습니다.

블록의 번호가 n일 때, 가장 처음 블록은 n*2 번 째 위치에 설치합니다.
그 다음은 n*3, 그 다음은 n*4, ... 로 진행합니다.
만약 기존에 블록이 깔려있는 자리라면 그 블록을 빼고 새로운 블록으로 집어넣습니다.

예를들어

1번 블록은 2,3,4,5,...인 위치에 우선 설치합니다.
2번 블록은 4,6,8,10,...인 위치에 설치합니다.
3번 블록은 6,9,...인 위치에 설치합니다.
이렇게 3번 블록까지 설치하고 나면 첫 10개의 블록은 0, 1, 1, 2, 1, 3, 1, 2, 3, 2이 됩니다.

A시는 길이가 100조나 되는 도로에 1번 블록부터 시작하여 1000만 번 블록까지 위의 규칙으로 모두 놓았습니다.
이 때, 두 수 a와 b를 입력받아 a와 b번 사이에 어떠한 블록이 깔렸는지 블록의 숫자를 배열로 반환하는 numberBlock 함수를 완성하세요.

예를 들어 99999999999990과 100000000000000가 입력된다면
[376830,9999997,7973704,9052401,5422,6414455,9999998,839,14,9999999,10000000]을 반환해 주면 됩니다.*/

import java.util.Arrays;

class NumberBlock {
	public int[] numberBlock(long begin, long end) {
		int[] answer = new int[(int)(end-begin+1)];
		int sqrt;
		int j;
		long div;
		int num=0;
		long total=0;
		for(long i=begin; i<=end; i++) {
			sqrt = (int)Math.sqrt(i);
			for(j=2; j<=sqrt; j++) {
				if(i % j == 0) {
					div = i / j;
					if(div <= 10000000) {
						answer[num] = (int)(div);
						break;
					} else answer[num] = Math.max(answer[num], j);
				}
			}
			if(i != 1 && answer[num] == 0) answer[num] = 1;
			System.out.println("i:" + i + ", j:" + j + ", answer:" + answer[num]);
			total+=sqrt-j+1;
			num++;
		}
		System.out.println("total:" + total);
		return answer;
	}

	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		NumberBlock nb = new NumberBlock();
//		System.out.println(Arrays.toString(nb.numberBlock(1, 100)));
//		System.out.println(Arrays.toString(nb.numberBlock(99999999999990L, 100000000000000L)));
//		System.out.println(Arrays.toString(nb.numberBlock(31097241562438L, 31097241562489L)));
		System.out.println(Arrays.toString(nb.numberBlock(54494632613516L, 54494632613592L)));
	}
}

//import java.util.Arrays;
//
//class NumberBlock {
//	public int[] numberBlock(long begin, long end) {
//		int[] answer = new int[(int)(end-begin+1)];
//		int std;
//		int j;
//		int num=0;
//		long total=0;
//		for(long i=begin; i<=end; i++) {
//			std = (int)Math.min(i-1, 10000000);
//			for(j=std; j>=2; j--) {
//				if(i % j == 0) {
//					answer[num] = j;
//					break;
//				}
//			}
//			if(i != 1 && answer[num] == 0) answer[num] = 1;
//			System.out.println("i:" + i + ", j:" + j + ", answer:" + answer[num]);
//			total+=std-j+1;
//			num++;
//		}
//		System.out.println("total:" + total);
//
//		return answer;
//	}
//
//	// 아래는 테스트로 출력해 보기 위한 코드입니다.
//	public static void main(String[] args) {
//		NumberBlock nb = new NumberBlock();
////		System.out.println(Arrays.toString(nb.numberBlock(1, 10)));
////		System.out.println(Arrays.toString(nb.numberBlock(99999999999990L, 100000000000000L)));
////		System.out.println(Arrays.toString(nb.numberBlock(31097241562438L, 31097241562489L)));
//		System.out.println(Arrays.toString(nb.numberBlock(54494632613516L, 54494632613592L)));
//
//	}
//}