/* 
 * 문제7번
 */

class SolutionStr {
	
	public int solution(String[] strs, String t) {
		
		int answer;
		int maximum = t.length(); // 찾고자 하는 문자열의 길이
		int[] result = new int[20000];
		int k, l;
		
		for(int i=0; i<maximum; i++) {
			// 디폴트 값으로 최대값+1을 설정하여 불가능한 값으로 설정
			result[i] = maximum+1;
			
			for(int j=0; j<strs.length; j++) {
				
				// 현재 위치로부터 역으로 탐색하여 부분문자열이 맞는지 확인
				k = strs[j].length()-1;
				for(l=0; l<strs[j].length(); l++) {
					if(i-l>=0 && strs[j].charAt(k-l) == t.charAt(i-l)) continue;
					else break;
				}
				
				// 해당 부분문자열이 모두 포함된다면, 결과값 계산
				if(l==strs[j].length()) {
					// 부분문자열로 완성시키전의 최소값+1
					if(i-l>=0) result[i] = Math.min(result[i], 1+result[i-l]);
					// 처음 부분문자열을 완성한 것이라면 1로 설정
					else result[i]=1;
				}
				
			}
		}
		
		// 전체 정답은 문자열의 마지막 원소의 Result값
		answer = result[maximum-1];
		
		// 만약 불가능한 값(디폴트값)이 정답이라면 불가능한 경우이므로 -1 리턴
		if(answer == maximum+1) answer = -1;
		
		return answer;
	}
}
	
/* 
 * 문제7번
 */

//import java.util.ArrayList;
//
//class Solution {
//	
//	private ArrayList<String> strList = new ArrayList<String>();
//	private int len;
//	private int longest;
//	private String test;
//	
//	public int solution(String[] strs, String t) {
//		
//		len = t.length();
//		test = t;
//		
//		for(int i=0; i<strs.length; i++) {
//			if(strs[i].length() > longest) longest = strs[i].length();
//			strList.add(strs[i]);
//		}
//		
//		return word(0, 0);
//	}
//	
//	private int word(int start, int end) {
//		
//		if(end >= len || end-start+1 > longest) return -1;
//		
//		String cut = test.substring(start, end+1);
//		
//		if(strList.contains(cut)) {
//			if(end < len-1) return count(sum(1, word(end+1, end+1)), word(start, end+1));
//			else return 1;
//		}
//		else return word(start, end+1);
//		
//	}
//	
//	private int sum(int a, int b) {
//		if(a>0 && b>0) return a+b;
//		else return -1;
//	}
//	
//	private int count(int a, int b) {
//		if(a>0 && b>0) return Math.min(a, b);
//		else return Math.max(a, b);
//	}
//	
//}


/* 
 * 문제6번 - 수정
 */

//class Solution {
//	
//	public int solution(int sticker[]) {
//
//		int[] dp1 = new int[100001];
//		int[] dp2 = new int[100001];
//		int n = sticker.length;
//		
//		if(n == 1) return sticker[0]; // 스티커가 1개면 그것을 뗀다.
//		
//		// 첫 번째 스티커를 뗀 경우
//		dp1[0] = sticker[0];
//		dp1[1] = sticker[0];
//		for(int i=2; i<n-1; i++)
//			dp1[i] = Math.max(dp1[i-1], dp1[i-2] + sticker[i]); // i번째 스티커를 뗐을 때와 떼지 않았을 때 중 최대값 저장
//		
//		// 첫 번째 스티커를 떼지 않은 경우
//		dp2[0] = 0;
//		dp2[1] = sticker[1];
//		for(int i=2; i<n; i++)
//			dp2[i] = Math.max(dp2[i-1], dp2[i-2] + sticker[i]); // i번째 스티커를 뗐을 때와 떼지 않았을 때 중 최대값 저장
//		
//		return Math.max(dp1[n-2], dp2[n-1]);
//		
//	}
//}


/* 
 * 문제6번
 */

//class Solution {
//	
//	private int[] mysticker;
//	
//	public int solution(int sticker[]) {
//
//		mysticker = sticker;
//		int len = sticker.length;
//		
//		if(len == 1) return sticker[0];
//		else if(len == 2) return maxs(sticker[0], sticker[1]);
//		else if(len == 3) return maxs(sticker[0], sticker[1], sticker[2]);
//		else {
//			return maxs(sticker[0] + maxPoint(2, len-2),
//						sticker[1] + maxPoint(3, len-1),
//						sticker[len-1] + maxPoint(1, len-3));
//		}
//	}
//
//	private int maxPoint(int start, int end) {
//		
//		int len = end - start + 1;
//		
//		if(len == 1) return mysticker[start];
//		else if(len == 2) return maxs(mysticker[start], mysticker[end]);
//		else if(len == 3) return maxs(mysticker[start]+mysticker[end], mysticker[start+1]);
//		else {
//			return maxs(mysticker[start] + maxPoint(start+2, end),
//					mysticker[start+1] + maxPoint(start+3, end),
//					mysticker[len-1] + maxPoint(1, len-3));
//		}
//		
//	}
//	
//	private int maxs(int... arr) {
//		int max=arr[0];
//		for(int i=1; i<arr.length; i++)
//			if(max < arr[i]) max = arr[i];
//
//		return max;
//	}
//
//}


/* 
 * 문제5번 - 수정
 */

//class Solution {
//	
//	public int solution(int[][] land) {
//		
//		int len = land.length;
//		
//		for(int i=1; i<len; i++) {
//			land[i][0] += Math.max(land[i-1][1], Math.max(land[i-1][2], land[i-1][3]));
//			land[i][1] += Math.max(land[i-1][0], Math.max(land[i-1][2], land[i-1][3]));
//			land[i][2] += Math.max(land[i-1][0], Math.max(land[i-1][1], land[i-1][3]));
//			land[i][3] += Math.max(land[i-1][0], Math.max(land[i-1][1], land[i-1][2]));
//		}
//		
//		return Math.max(land[len-1][0], Math.max(land[len-1][1], Math.max(land[len-1][2], land[len-1][3])));
//	}
//	
//}


/* 
 * 문제5번
 */

//import java.util.ArrayList;
//
//class Solution {
//	
//	private int[][] myland;
//
//    public int solution(int[][] land) {
//
//    	myland = land;
//    	int maxLine = land.length-1;
//
//        return maxs(myland[maxLine][0] + maxPoint(maxLine-1,0),
//        			myland[maxLine][1] + maxPoint(maxLine-1,1),
//        			myland[maxLine][2] + maxPoint(maxLine-1,2),
//        			myland[maxLine][3] + maxPoint(maxLine-1,3));
//    }
//    
//    private int maxPoint(int line, int exp) {
//    	if(line == 0) {
//    		int max=0;
//    		for(int i=0; i<4; i++) {
//    			if(i == exp) continue;
//    			else if(max < myland[0][i]) max = myland[0][i];
//    		}
//    		return max;
//    	} else {
//    		
//    		ArrayList<Integer> num = new ArrayList<Integer>();
//    		for(int i=0; i<4; i++) {
//    			if(i == exp) continue;
//    			else num.add(i);
//    		}
//    		
//    		return maxs(myland[line][num.get(0)] + maxPoint(line-1, num.get(0)),
//    					myland[line][num.get(1)] + maxPoint(line-1, num.get(1)),
//    					myland[line][num.get(2)] + maxPoint(line-1, num.get(2)));
//    	}
//    }
//    
//    private int maxs(int... arr) {
//    	int max=arr[0];
//    	for(int i=1; i<arr.length; i++)
//    		if(max < arr[i]) max = arr[i];
//    	
//    	return max;
//    }
//}


/* 
 * 문제4번  - 수정
 */

//class Solution
//{	
//	public int solution(int[][] board)
//	{
//		boolean notZero=false;
//		int answer=0;
//		
//		for(int i=0; i<board.length; i++) {
//			for(int j=0; j<board[0].length; j++) {
//				if(board[i][j]!=0) {
//					answer=1;
//					notZero=true;
//					break;
//				}
//			}
//			if(notZero) break;
//		}
//		
//		if(notZero) {
//			for(int i=0; i<board.length; i++) {
//				for(int j=0; j<board[0].length; j++) {
//					
//					if(i==0 || j==0) continue;
//					
//					if( board[i][j]!=0 && board[i-1][j]!=0 && board[i][j-1]!=0 && board[i-1][j-1]!=0 )
//						board[i][j] = Math.min(board[i-1][j-1], Math.min(board[i-1][j], board[i][j-1])) + 1;
//					
//					answer = Math.max(answer, board[i][j]);
//				}
//			}
//		}
//    	
//        return answer * answer;
//	}
//}


/* 
 * 문제4번 
 */

//class Solution
//{
//	private int[][] myboard;
//	private int row;
//	private int col;
//	
//	public int solution(int[][] board)
//	{
//    	myboard = board;
//    	row = board.length;
//    	col = board[0].length;
//    	int totMax=0;
//    	int curMax;
//    	
//    	for(int i=0; i<row; i++) {
//    		
//    		for(int j=0; j<col; j++) {
//    			
//    			if(board[i][j] == 0) continue;
//    			else {
//    				curMax = maxSize(i,j);
//    				if(totMax >= curMax) continue;
//    				else totMax = getSize(i,j, totMax, curMax);
//    			}
//    			
//    			
//    		}
//    	}
//		
//        return totMax * totMax;
//	}
//	
//	private int maxSize(int i, int j) {
//		return Math.min(row-i, col-j);
//	}
//	
//	private int getSize(int i, int j, int totMax, int curMax) {
//	
//		if(!hasSize(i, j, curMax)) return totMax;
//		else {
//			int size = totMax;
//			for(int k=totMax+1; k<=curMax; k++) {
//				if(hasExtraSize(i, j, k)) size = k;
//				else return size;
//			}
//			return size;
//		}
//	}
//	
//	private boolean hasSize(int i, int j, int size) {
//		
//		for(int k=i; k<i+size; k++) {
//			for(int l=j; l<j+size; l++) {
//				if(myboard[k][l] == 0) return false;
//			}
//		}
//		
//		return true;
//	}
//	
//	private boolean hasExtraSize(int i, int j, int size) {
//		
//		for(int k=0; k<size; k++) {
//			if(myboard[i+size-1][j+k]==0 || myboard[i+k][j+size-1]==0) return false;
//		}
//		
//		return true;
//	}
//	
//}


/* 
 * 문제3번 - 수정
 */

//class Solution {
//    public int[] solution(int[][] v) {
//    	
//    	int x = v[0][0]^v[1][0]^v[2][0];
//    	int y = v[0][1]^v[1][1]^v[2][1];
//
//    	int[] answer = {x, y};
//    	
//        return answer;
//    }
//}


/* 
 * 문제3번
 */

//class Solution {
//    public int[] solution(int[][] v) {
//    	
//    	int[] num = new int[2];
//    	
//    	for(int i=0; i<2; i++) {
//    		    		
//    		if(v[0][i] == v[1][i]) num[i] = v[2][i];
//    		else if(v[0][i] == v[2][i]) num[i] = v[1][i];
//    		else num[i] = v[0][i];
//    		
//    	}
//    	
//        int[] answer = {num[0], num[1]};
//
//        return answer;
//    }
//}


/* 
 * 문제2번 - 수정
 */

//class Solution {
//    public boolean solution(int[] arr) {
//
//        boolean[] check = new boolean[100000];
//    	
//        int len = arr.length;
//        for(int i=0; i<len; i++) {
//        	if(arr[i] > len) return false;
//        	else if(!check[arr[i]]) check[arr[i]] = true;
//        	else return false;
//        }
//        return true;
//    }
//}


/* 
 * 문제2번
 */

//import java.util.HashSet;
//
//class Solution {
//    public boolean solution(int[] arr) {
//
//        HashSet<Integer> arrSet = new HashSet<Integer>();
//        int length = arr.length;
//        for(int i=0; i<length; i++) {
//        	if(arr[i] >= 1 && arr[i] <= length && !arrSet.contains(arr[i])) arrSet.add(arr[i]);
//        	else return false;
//        }
//        return true;
//    }
//}


/* 
 * 문제1번
 */

//public class Solution {
//	public int solution(int n) {
//		int answer = 0;
//        
//        while(n % 10 != 0) {
//            answer += n % 10;
//            n /= 10;
//        }
//
//		return answer;
//	}
//}


public class SolutionTest {

	public static void main(String[] args) {
//		Solution sol = new Solution();
//		
//		int[][] board1 = {{0,1,1,1},{1,1,1,1},{1,1,1,1},{0,0,1,0}};
//		int[][] board2 = {{0,0,1,1},{1,1,1,1}};
//		
//		System.out.println(sol.solution(board1));
//		System.out.println(sol.solution(board2));
		
	}

}
