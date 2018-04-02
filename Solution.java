class Solution {
  public int solution(int n, int m) {
      int answer = 0;
      String str;
      for(int i=n; i<=m; i++) {
    	  str = Integer.toString(i);
    	  for(int j=0; j<(str.length()+1)/2; j++) {
    		  if(str.charAt(j) != str.charAt(str.length()-j-1)) break;
    		  else if(j == (str.length()+1)/2-1) answer++;
    	  }
      }
      return answer;
  }
}