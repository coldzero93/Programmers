/*[���� ������������ ��ġ�ϱ� - Level 2]
reverseInt �޼ҵ�� int�� n�� �Ű������� �Է¹޽��ϴ�.
n�� ��Ÿ���� ���ڸ� ū�ͺ��� ���� ������ ������ ���ο� ������ �������ּ���.
������� n�� 118372�� 873211�� �����ϸ� �˴ϴ�.
n�� ���� �����Դϴ�.*/

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
  
	// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
	public static void  main(String[] args){
		ReverseInt ri = new ReverseInt();
		System.out.println(ri.reverseInt(118372));
	}
}