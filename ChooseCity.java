/*[���� �Ǽ��ϱ� - Level 4]
1���� ū N���� ���� �� �� ���� ������ ���� �����Դϴ�.
������� ���Ǹ� ���� �������κ��� �� ���������� ���ð� �̵� �Ÿ��� �ּҰ� �Ǵ� ���ÿ� ����� �Ͽ����ϴ�.
���ǻ� ���ô� �������� �����ִٰ� �����ϸ� ��ǥ�� ������ ������ ���Ե˴ϴ�. ���� ��ǥ�� ���ĵǾ� ���� �ʽ��ϴ�.
�������� ��ġ�� �� ���ÿ� ��� ������� ���� �־��� ��,
������ ���� ������ ��ġ�� ��ȯ���ִ� �Լ� chooseCity �Լ��� �ϼ��ϼ���.
�Ÿ��� ���� ���ð� 2�� �̻��� ��� ��ġ�� �� ���� ���� ���ø� �����ϸ� �˴ϴ�.

���� ��� ������ ���� ������ ���ð� �ִٰ� ������ ���ô�.

��ġ	1	2	3
�α���	5	2	3

�� �� ���, ������ ���ÿ� ������ ������ ���� ������� �̵� �Ÿ��� 8, 8, 12 �̹Ƿ� 1�� �Ǵ� 2���� ���� �� ������,
1�� ��ġ�� �� �����Ƿ� 1�� ��ȯ���ָ� �˴ϴ�.*/

class ChooseCity {
	
    public int chooseCity(int n, int [][]city) {
    	
    	// ���õ��� ��ġ�� �α����� ����� ������� ����
    	double weightedAvg = 0;
    	double weightSum = 0;
    	
    	for(int i=0; i<n; i++) {
    		weightedAvg += (double)city[i][0] * city[i][1];
    		weightSum += city[i][1];
    	}
    	
    	weightedAvg /= weightSum;  
    	
    	// ������հ� ���� ����� ���� ���ÿ� ������ ���� Ž��
    	int cityLeft=Integer.MIN_VALUE;
    	int cityRight=Integer.MAX_VALUE;
    	
    	for(int i=0; i<n; i++) {
    		if(city[i][0] == weightedAvg) return (int)weightedAvg; // ������հ� ��Ȯ�� ��ġ�ϴ� ���ð� �ִٸ� ������հ��� ĳ�����Ͽ� ��ȯ
    		else if(city[i][0] < weightedAvg && city[i][0] > cityLeft) cityLeft = city[i][0];
    		else if(city[i][0] > weightedAvg && city[i][0] < cityRight) cityRight = city[i][0];
    	}
    	
    	// ������հ� ���� ����� ���� ���ÿ� ������ ������ �̵��Ÿ� ����
    	long distLeft = 0;
    	long distRight = 0;
    	
    	for(int i=0; i<n; i++) {
    		distLeft += (long)Math.abs(cityLeft - city[i][0]) * city[i][1];
    		distRight += (long)Math.abs(cityRight - city[i][0]) * city[i][1];
    	}
    	
    	// �̵��Ÿ��� �� ���� ������ ��ġ�� ��ȯ
    	if(distLeft <= distRight) return cityLeft; // ���� �̵��Ÿ��� �����ϴٸ� ���� ������ ��ġ�� ��ȯ
    	else return cityRight;
    }
	
    public static void main(String[] args) {
    	
        ChooseCity test = new ChooseCity();
        int tn = 3;
        int [][]tcity = {{1,5},{2,2},{3,3}};
        System.out.println(test.chooseCity(tn,tcity));
    }
}

//class TryHelloWorld
//{
//	
//  public int chooseCity(int n, int [][]city) // �ð����⵵�� O(n^2)�̹Ƿ� ��ȿ������ �˰���
//  {
//  	int answer = 0;
//  	long dist;
//  	long minDist = Long.MAX_VALUE;
//  	
//  	for(int i=0; i<n; i++) {
//  		dist = 0;
//  		for(int j=0; j<n; j++)
//  			dist += Math.abs(city[i][0] - city[j][0]) * city[j][1];
//  		if(dist < minDist) {
//  			minDist = dist;
//  			answer = city[i][0];
//  		}
//  	}
//      return answer;
//  }
//	
//  public static void main(String[] args)
//  {
//      TryHelloWorld test = new TryHelloWorld();
//      int tn = 3;
//      int [][]tcity = {{1,5},{2,2},{3,3}};
//      System.out.println(test.chooseCity(tn,tcity));
//  }
//}