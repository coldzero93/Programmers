/*[�ִ밪�� �ּҰ� - Level 1]
getMinMaxString �޼ҵ�� String�� ���� str�� �Ű������� �Է¹޽��ϴ�.
str���� �������� ���е� ���ڵ��� ����Ǿ� �ֽ��ϴ�.
str�� ��Ÿ���� ���� �� �ּҰ��� �ִ밪�� ã�� �̸� "(�ּҰ�) (�ִ밪)"������ String�� ��ȯ�ϴ� �޼ҵ带 �ϼ��ϼ���.
������� str�� "1 2 3 4"��� "1 4"�� �����ϰ�, "-1 -2 -3 -4"��� "-4 -1"�� �����ϸ� �˴ϴ�.*/

import java.util.Scanner;

public class GetMinMaxString {
    public String getMinMaxString(String str) {
    	
    	Scanner sc = new Scanner(str); // ScannerŬ���� ���, StringŬ������ split(" ") �޼ҵ带 Ȱ���ϴ� �͵� ���. (���� parseInt�� �ٷ�)
    	
    	int max = sc.nextInt();
    	int min = max;
    	int num;
    	
    	while(sc.hasNext()) {
    		num = sc.nextInt();
    		if(num > max) max = num;
    		if(num < min) min = num;
    	}
    	
    	sc.close();
    	
        return min + " " + max;
    }

    public static void main(String[] args) {
        String str = "1 2 3 4";
        GetMinMaxString minMax = new GetMinMaxString();
        //�Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
        System.out.println("�ִ밪�� �ּҰ���?" + minMax.getMinMaxString(str));
    }
}