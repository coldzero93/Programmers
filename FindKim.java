/*[���￡���輭��ã�� - Level 1]
findKim �Լ�(�޼ҵ�)�� String�� �迭 seoul�� �Ű������� �޽��ϴ�.

seoul�� element�� "Kim"�� ��ġ x�� ã��, "�輭���� x�� �ִ�"�� String�� ��ȯ�ϼ���.
seoul�� "Kim"�� ���� �� ���� ��Ÿ���� �߸��� ���� �ԷµǴ� ���� �����ϴ�.*/

public class FindKim {
	public String findKim(String[] seoul){
		//x�� �輭���� ��ġ�� �����ϼ���.
		int x = 0;

		for(int i=0; i<seoul.length; i++) {
			if(seoul[i].equals("Kim")) {
				x = i;
				break;
			}
		}
		
		return "�輭���� "+ x + "�� �ִ�";
		
		// int x = Arrays.asList(seoul).indexOf("Kim");
		// return "�輭���� "+ x + "�� �ִ�";
		
	}
	
	// ������ ���� �׽�Ʈ�ڵ��Դϴ�.
	public static void main(String[] args) {
		FindKim kim = new FindKim();
		String[] names = {"Queen", "Tod","Kim"};
		System.out.println(kim.findKim(names));
	}
}