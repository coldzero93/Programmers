class NQueen {
	
	private int n;
	private int result;
	private int[] queen;
	
	private void nqueen(int m) {
		int i=-1;
		while(i++ < n) {
			queen[m] = i;
			if(check(m)) nqueen(m+1);
		}
	}
	
	private boolean check(int m) {
		for(int i=0; i<=m-1; i++) {
			if(queen[m] == queen[i] ) return false;
			if(queen[i] + m == queen[m] + i) return false;
			if(queen[i] - m == queen[m] - i) return false;
		}
		if(m == n) {
			result++;
			return false;
		} else {
			return true;
		}
	}
	
	public int nQueen(int n) {
		this.n = n-1;
		result = 0;
		queen = new int[n];
		nqueen(0);
		return result;
	}

	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		NQueen nq = new NQueen();
		System.out.println(nq.nQueen(3));
	}
}