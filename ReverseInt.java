/*[정수 내림차순으로 배치하기 - Level 2]
reverseInt 메소드는 int형 n을 매개변수로 입력받습니다.
n에 나타나는 숫자를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요.
예를들어 n이 118372면 873211을 리턴하면 됩니다.
n은 양의 정수입니다.*/

//import java.util.Arrays;

public class ReverseInt {
//	String res = "";
	public int reverseInt(int n){
		
		char[] array = Integer.toString(n).toCharArray();
		char temp;
		boolean isExchanged;
		
		for(int i=1; i<array.length; i++) {
			isExchanged = false;
			for(int j=0; j<array.length-i; j++) {
				if(array[j] < array[j+1]) {
					isExchanged = true;
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
			if(!isExchanged) break;
		}
		
		return Integer.parseInt(new String(array));
		
//        Integer.toString(n).chars().sorted().forEach(c -> res = Character.valueOf((char)c) + res);
//        return Integer.parseInt(res);
		
//		char[] array = Integer.toString(n).toCharArray();
//		Arrays.sort(array);
//		return Integer.parseInt(new StringBuilder(new String(array)).reverse().toString());
	}
  
	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void  main(String[] args){
		ReverseInt ri = new ReverseInt();
		System.out.println(ri.reverseInt(118372));
	}
}