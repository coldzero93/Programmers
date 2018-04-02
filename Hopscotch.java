/*[�����Ա� ���� - Level 4]
����� �����Ա� ���ӿ� ǫ �������ϴ�.
�����Ա� ������ ���� �� N�� 4���� �������� �ְ�, ��� ĭ���� ������ ���� �ֽ��ϴ�.
���� �����鼭 �� �྿ ������ ��, ����� �� ���� 4ĭ �� 1ĭ�� �����鼭 ������ �� �ֽ��ϴ�.
�����Ա� ���ӿ��� ���� ���� �����ؼ� ���� ���� ���� Ư�� ��Ģ�� �ֽ��ϴ�.
��, 1�࿡�� (5)�� ��Ҵٸ�, 2���� (8)�� ���� ���� ���� �˴ϴ�.
������ ����� ��� �������� ��, ������ ���� ���� ����� ������ ���ڰ� �˴ϴ�.
�������� hopscotch �Լ��� �����Ͽ� ���� �ִ� �� ���� ���� �� �ִ��� �˷��ּ���.
���� ���
1 2 3 5
5 6 7 8
4 3 2 1
�� ���� �ִٸ�,
����� �� �ٿ��� (5), (7), (4) ���� ��� 16���� �ְ������� ���� �� ������,
hopscotch �Լ������� 16�� ��ȯ���ָ� �˴ϴ�.*/

class Hopscotch {
    int hopscotch(int[][] board, int size) {
    	for(int i=1; i<size; i++) {
    		board[i][0] += Math.max(board[i-1][1], Math.max(board[i-1][2], board[i-1][3]));
    		board[i][1] += Math.max(board[i-1][0], Math.max(board[i-1][2], board[i-1][3]));
    		board[i][2] += Math.max(board[i-1][0], Math.max(board[i-1][1], board[i-1][3]));
    		board[i][3] += Math.max(board[i-1][0], Math.max(board[i-1][1], board[i-1][2]));
    	}
        return Math.max(board[size-1][0], Math.max(board[size-1][1], Math.max(board[size-1][2], board[size-1][3])));
    }

    public static void main(String[] args) {
        Hopscotch c = new Hopscotch();
        int[][] test = { { 1, 2, 3, 5 }, { 5, 6, 7, 8 }, { 4, 3, 2, 1 } };
        //�Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
        System.out.println(c.hopscotch(test, 3));
    }

}