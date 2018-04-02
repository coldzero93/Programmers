/*[나누어 떨어지는 숫자 배열 - Level 1]
divisible 메소드는 int형 배열 array와 int divisor를 매개변수로 받습니다.
array의 각 element 중 divisor로 나누어 떨어지는 값만 포함하는 새로운 배열을 만들어서 반환하도록 divisible에 코드를 작성해 보세요.
예를들어 array가 {5, 9, 7, 10}이고 divisor가 5이면 {5, 10}을 리턴해야 합니다.*/

import java.util.ArrayList;

import java.util.Arrays;

class Divisible {
	public int[] divisible(int[] array, int divisor) {
		//ret에 array에 포함된 정수중, divisor로 나누어 떨어지는 숫자를 순서대로 넣으세요.

		ArrayList<Integer> retList = new ArrayList<Integer>();

		for(int i=0; i<array.length; i++)
			if(array[i] % divisor == 0) retList.add(array[i]);
		
		int[] ret = new int[retList.size()];
		
		for(int i=0; i<retList.size(); i++)
			ret[i] = retList.get(i);

		return ret;
		
//		return Arrays.stream(array).filter(factor -> factor % divisor == 0).toArray(); // 가장 간단한 코드
	}
	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		Divisible div = new Divisible();
		int[] array = {5, 9, 7, 10};
		System.out.println( Arrays.toString( div.divisible(array, 5) ));
	}
}