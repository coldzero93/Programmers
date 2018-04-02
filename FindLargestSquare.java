/*[���� ū ���簢�� ã�� - Level 4]
O�� X�� ä���� ǥ�� �ֽ��ϴ�.
ǥ 1ĭ�� 1 x 1 �� ���簢������ �̷���� �ֽ��ϴ�.
ǥ���� O�� �̷���� ���� ū ���簢���� ã�� ���̸� ��ȯ�ϴ� findLargestSquare �Լ��� �ϼ��ϼ���.

���� ���
1	2	3	4	5
X	O	O	O	X
X	O	O	O	O
X	X	O	O	O
X	X	O	O	O
X	X	X	X	X
�� �ִٸ� ������

1	2	3	4	5
X	O	O	O	X
X	O	O	O	O
X	X	O	O	O
X	X	O	O	O
X	X	X	X	X
�� �Ǹ� ���̴� 9�� �ǹǷ� 9�� ��ȯ�� �ָ� �˴ϴ�.*/

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



//for(int i=0; i<row; i++) // �ּ��� �Ѱ��� 'O'�� ���� �ִ��� ����
//for(int j=0; j<col; j++)
//	if(board[i][j] == 'O') {
//		answer = 1;
//		break;
//	}
//// 'O'�� �ϳ��� ���ų�, ��Į�� ���� ��� answer ��ȯ {{'X','O'}
////										   {'X','X'}} �� ���� �־��� ��츦 ����Ͽ� answer�� �ʱⰪ ����
//if(answer==0 || (row==1 && col==1)) return answer; 

//for(int i=0; i<row; i++) {
//for(int j=0; j<col; j++) {
//	if(board[i][j] == 'O') { // ���� ���Ұ� 'O'�� ���
//		if(i==0 || j==0) dp[i][j]=1; // 1�� �Ǵ� 1���� ���Ҵ� �ʱⰪ 1�� ����
//		else if(board[i-1][j-1] == 'O') { // Ư�� ����('O')�� �밢���� 'O'�̸�, �ִ� ���簢���� ���� ���Ͽ� �Ҵ� �� answer����
//			dp[i][j] = Math.min(dp[i-1][j-1], Math.min(dp[i-1][j], dp[i][j-1])) + 1;
//			answer = Math.max(answer, dp[i][j]);
//		} else dp[i][j]=1; // 1�� �Ǵ� 1���� ��ġ���� ���� Ư�� ����('O')�� �밢���� 'X'�̸� �ʱⰪ 1 �Ҵ�
//	}
//}
//}