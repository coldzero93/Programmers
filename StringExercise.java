/*[��� ���� �������� - Level 1]
getMiddle�޼ҵ�� �ϳ��� �ܾ �Է� �޽��ϴ�.
�ܾ �Է� �޾Ƽ� ��� ���ڸ� ��ȯ�ϵ��� getMiddle�޼ҵ带 ����� ������.
�ܾ��� ���̰� ¦���ϰ�� ��� �α��ڸ� ��ȯ�ϸ� �˴ϴ�.
������� �Է¹��� �ܾ power�̶�� w�� ��ȯ�ϸ� �ǰ�, �Է¹��� �ܾ test��� es�� ��ȯ�ϸ� �˴ϴ�.*/

class StringExercise{
    String getMiddle(String word){
    	
    	return word.substring((word.length()-1)/2, word.length()/2+1);
    	
//    	int end = word.length()/2 + 1;
//    	int start = (word.length()%2 == 0) ? end-2 : end-1;
//    	return word.substring(start, end);
    	
//    	int len = word.length() / 2;
//    	return word.length()%2==0 ? word.substring(len-1,len+1) : word.substring(len, len+1);
    }
    // �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
    public static void  main(String[] args){
        StringExercise se = new StringExercise();
        System.out.println(se.getMiddle("power"));
    }
}