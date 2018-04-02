/*[����� ���� - Level 2]
����� ������, ���Ϸ��� �� ����� � ��� ���� ��������,
������ ����� �ش�Ǵ� ��, ������ ����� �ش�Ǵ� ���� ������� ���� ���� ���� ���� ���ϴ�.
����� ���ϱ� ���ؼ� ���� ����� ���� ������ ���� ����� ���� ������ ���ƾ� �մϴ�.
���� �� �ִ� �� ��� A,B�� �־��� ��, ����� ���� ���� ����ϴ� productMatrix �Լ��� �ϼ��� ������.*/

class ProductMatrix {
	public int[][] productMatrix(int[][] A, int[][] B) {
		
		if(A[0].length != B.length) return null;
		
		int rowA = A.length;
		int cArB = A[0].length;
		int colB = B[0].length;
		
		int[][] answer = new int[rowA][colB];
		
		for(int i=0; i<rowA; i++)
			for(int j=0; j<colB; j++)
				for(int k=0; k<cArB; k++)
					answer[i][j] += A[i][k] * B[k][j];
				
		return answer;
	}

	public static void main(String[] args) {
		ProductMatrix c = new ProductMatrix();
		int[][] a = { { 1, 2 }, { 2, 3 } };
		int[][] b = { { 3, 4 }, { 5, 6 } };
      // �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
      System.out.println("����� ���� : " + c.productMatrix(a, b));
	}
}