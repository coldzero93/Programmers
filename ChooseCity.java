/*[공항 건설하기 - Level 4]
1보다 큰 N개의 도시 중 한 곳에 공항을 지을 예정입니다.
사람들의 편의를 위해 공항으로부터 각 사람들까지의 도시간 이동 거리가 최소가 되는 도시에 짓기로 하였습니다.
편의상 도시는 일직선상에 놓여있다고 가정하며 좌표의 범위는 음수가 포함됩니다. 또한 좌표는 정렬되어 있지 않습니다.
직선상의 위치와 그 도시에 사는 사람들의 수가 주어질 때,
공항을 지을 도시의 위치를 반환해주는 함수 chooseCity 함수를 완성하세요.
거리가 같은 도시가 2개 이상일 경우 위치가 더 작은 쪽의 도시를 선택하면 됩니다.

예를 들어 다음과 같은 정보의 도시가 있다고 가정해 봅시다.

위치	1	2	3
인구수	5	2	3

이 살 경우, 각각의 도시에 공항을 지었을 때의 사람들의 이동 거리는 8, 8, 12 이므로 1번 또는 2번에 지을 수 있지만,
1의 위치가 더 작으므로 1을 반환해주면 됩니다.*/

class ChooseCity {
	
    public int chooseCity(int n, int [][]city) {
    	
    	// 도시들의 위치와 인구수를 고려한 가중평균 산출
    	double weightedAvg = 0;
    	double weightSum = 0;
    	
    	for(int i=0; i<n; i++) {
    		weightedAvg += (double)city[i][0] * city[i][1];
    		weightSum += city[i][1];
    	}
    	
    	weightedAvg /= weightSum;  
    	
    	// 가중평균과 가장 가까운 왼쪽 도시와 오른쪽 도시 탐색
    	int cityLeft=Integer.MIN_VALUE;
    	int cityRight=Integer.MAX_VALUE;
    	
    	for(int i=0; i<n; i++) {
    		if(city[i][0] == weightedAvg) return (int)weightedAvg; // 가중평균과 정확히 일치하는 도시가 있다면 가중평균값을 캐스팅하여 반환
    		else if(city[i][0] < weightedAvg && city[i][0] > cityLeft) cityLeft = city[i][0];
    		else if(city[i][0] > weightedAvg && city[i][0] < cityRight) cityRight = city[i][0];
    	}
    	
    	// 가중평균과 가장 가까운 왼쪽 도시와 오른쪽 도시의 이동거리 산출
    	long distLeft = 0;
    	long distRight = 0;
    	
    	for(int i=0; i<n; i++) {
    		distLeft += (long)Math.abs(cityLeft - city[i][0]) * city[i][1];
    		distRight += (long)Math.abs(cityRight - city[i][0]) * city[i][1];
    	}
    	
    	// 이동거리가 더 작은 도시의 위치를 반환
    	if(distLeft <= distRight) return cityLeft; // 만약 이동거리가 동일하다면 왼쪽 도시의 위치를 반환
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
//  public int chooseCity(int n, int [][]city) // 시간복잡도가 O(n^2)이므로 비효율적인 알고리즘
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