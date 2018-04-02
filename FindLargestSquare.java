/*[가장 큰 정사각형 찾기 - Level 4]
O와 X로 채워진 표가 있습니다.
표 1칸은 1 x 1 의 정사각형으로 이루어져 있습니다.
표에서 O로 이루어진 가장 큰 정사각형을 찾아 넓이를 반환하는 findLargestSquare 함수를 완성하세요.

예를 들어
1	2	3	4	5
X	O	O	O	X
X	O	O	O	O
X	X	O	O	O
X	X	O	O	O
X	X	X	X	X
가 있다면 정답은

1	2	3	4	5
X	O	O	O	X
X	O	O	O	O
X	X	O	O	O
X	X	O	O	O
X	X	X	X	X
가 되며 넓이는 9가 되므로 9를 반환해 주면 됩니다.*/

class FindLargestSquare {

	public int findLargestSquare(char [][]board) {    	
		int answer = 0;
		int[][] dp = new int[board.length][board[0].length];
		for(int i=0; i<board.length; i++) {
			for(int j=0; j<board[0].length; j++) {
				if(board[i][j] == 'O') {
					if(i==0 || j==0) dp[i][j]=1;
					else dp[i][j] = Math.min(dp[i-1][j-1], Math.min(dp[i-1][j], dp[i][j-1])) + 1;
					answer = Math.max(answer, dp[i][j]);
				}
			}
		}
		return answer*answer;
	}

	public static void main(String[] args) {

		FindLargestSquare test = new FindLargestSquare();
		char [][]board ={
				{'X','O','O','O','X'},
				{'X','O','O','O','O'},
				{'X','X','O','O','O'},
				{'X','X','O','O','O'},
				{'X','X','X','X','X'}};

		System.out.println(test.findLargestSquare(board));
	}
}



//for(int i=0; i<row; i++) // 최소한 한개의 'O'를 갖고 있는지 점검
//for(int j=0; j<col; j++)
//	if(board[i][j] == 'O') {
//		answer = 1;
//		break;
//	}
//// 'O'가 하나도 없거나, 스칼라 값인 경우 answer 반환 {{'X','O'}
////										   {'X','X'}} 와 같은 최악의 경우를 대비하여 answer의 초기값 세팅
//if(answer==0 || (row==1 && col==1)) return answer; 

//for(int i=0; i<row; i++) {
//for(int j=0; j<col; j++) {
//	if(board[i][j] == 'O') { // 현재 원소가 'O'인 경우
//		if(i==0 || j==0) dp[i][j]=1; // 1행 또는 1열의 원소는 초기값 1로 세팅
//		else if(board[i-1][j-1] == 'O') { // 특정 원소('O')의 대각선이 'O'이면, 최대 정사각형의 길이 구하여 할당 후 answer갱신
//			dp[i][j] = Math.min(dp[i-1][j-1], Math.min(dp[i-1][j], dp[i][j-1])) + 1;
//			answer = Math.max(answer, dp[i][j]);
//		} else dp[i][j]=1; // 1행 또는 1열에 위치하지 않은 특정 원소('O')의 대각선이 'X'이면 초기값 1 할당
//	}
//}
//}