/*과자 많이 먹기 - Level 6
과자를 좋아하는 동우는 책상 위에 일렬로 놓아진 과자를 발견하였습니다.
과자에는 맛을 숫자로 평가한 종이가 붙어 있습니다.
동우는 맨 왼쪽부터 순서대로 과자를 먹기로 하였습니다.
동우는 먹을 과자를 고를 때 이전에 먹은 과자보다 맛이 더 좋은 과자만 먹습니다.

제일 처음에 맛이 3인 과자를 먹었다면, 다음에는 4보다 작은 맛의 과자는 먹지 않습니다.

책상위에 놓인 과자의 맛이 입력되면, 동우가 최대 과자를 몇 개를 먹을 수 있는지 반환해주는 eatCookie 함수를 완성하세요.

예를 들어 [1, 4, 2, 6, 3, 4, 1, 5] 가 입력된다면
동우는 1, 3, 5, 6, 8번째 과자(각각의 맛은 1, 2, 3, 4, 5)를 골라 총 5개를 먹을 수 있고,
5개보다 더 많이 먹을 수 있는 방법은 없으므로 5를 리턴하면 됩니다.*/

//class Tree {
//	static Node end = new Node();
//	public static void init() {
//		end = new Node();
//	}
//	public static void addLink(Node newNode) {
//		Node curNode = end;
//		while(curNode.value >= newNode.value) curNode = curNode.parent;
//		newNode.depth = curNode.depth + 1;
//		newNode.parent = curNode;
//		if((newNode.depth > end.depth) || (newNode.depth == end.depth && newNode.value < end.value)) end = newNode;
//	}
//}
//
//class Node {
//	
//	int value;
//	int depth;
//	Node parent;
//	
//	public Node() {	}
//	
//	public Node(int value) {
//		this.value = value;
//		Tree.addLink(this);
//	}
//		
//}

class EatCookie
{

	public int eatCookie(int []cookies){
		int answer=0, cnt=0;
		int[] result = new int[cookies.length+1];
		for(int i=0; i<cookies.length; i++, cnt=0) {
			for(int j=0; j<i; j++)
				if(cookies[i] > cookies[j] && cnt < result[j]) cnt = result[j];
			result[i] = ++cnt;
			answer = Math.max(answer, cnt);
		}
		return answer;
	}

	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		EatCookie e = new EatCookie();
		int []cookies = {1, 4, 2, 6, 3, 4, 1, 5};
		System.out.println(e.eatCookie(cookies));
	}
}

//import java.util.ArrayList;
//
//class EatCookie
//{
//
//	private static Node end;
//
//	public void init() {
//		end = new Node();
//	}
//
//	public static void addLink(Node newNode) {
//		Node curNode = end;
//		while(curNode.value >= newNode.value) curNode = curNode.parent;
//		while(!curNode.child.isEmpty()) {
//			int min = curNode.child.get(0).value;
//			int index = 0;
//			for(int i=1; i<curNode.child.size(); i++) {
//				if(curNode.child.get(i).value < min) {
//					min = curNode.child.get(i).value;
//					index = i;
//				}
//			}
//			if(min < newNode.value) curNode = curNode.child.get(index);
//			else break;
//		}
//		newNode.depth = curNode.depth + 1;
//		newNode.parent = curNode;
//		curNode.child.add(newNode);
//		if((newNode.depth > end.depth) || (newNode.depth == end.depth && newNode.value < end.value)) end = newNode;
//	}
//
//	private class Node {
//		int value;
//		int depth;
//		ArrayList<Node> child = new ArrayList<Node>();
//		Node parent;
//
//		public Node() { print(); }
//
//		public Node(int value) {
//			this.value = value;
//			addLink(this);
//			print();
//		}
//
//		public void print() {
//			System.out.print("값 : " + value + ", 깊이 : " + depth);
//			if(parent != null) System.out.print(", 부모 : " + parent.value);
//			System.out.println();
//		}
//
//	}
//
//	public int eatCookie(int []cookies){
//		init();
//		for(int i=0; i<cookies.length; i++) addLink(new Node(cookies[i]));
//		int answer = end.depth;
//		init();
//		return answer;
//	}
//
//	// 아래는 테스트로 출력해 보기 위한 코드입니다.
//	public static void main(String[] args) {
//		EatCookie e = new EatCookie();
//		//		int []cookies = {1, 4, 2, 6, 3, 4, 1, 5};
//		int []cookies =  {907, 825, 264, 780, 280, 996, 517, 995, 759, 331, 299, 694, 232, 429, 49, 543, 415, 311, 18, 849, 234, 636, 556, 744, 824, 839, 267, 482, 749, 534, 23, 917, 709, 623, 341, 755, 613, 832, 694, 544, 652, 37, 899, 460, 682, 637, 866, 901, 18, 368};
//		System.out.println(e.eatCookie(cookies));
//	}
//}

//class EatCookie
//{
//	public int eatCookie(int []cookies){
//		int[][][] dp = new int[cookies.length][2][2]; // [n번째][0:안먹음,1:먹음][0:먹은개수,1:최댓값]
//		int answer = 0;
//		
//		dp[0][0][0] = 0;
//		dp[0][0][1] = 0;
//		dp[0][1][0] = 1;
//		dp[0][1][1] = cookies[0];
//		
//		for(int i=1; i<cookies.length; i++) {
//			dp[i][0][0] = 0;
//			dp[i][0][1] = 0;
//			dp[i][1][0] = 1;
//			dp[i][1][1] = cookies[0];
//		}
//
//		return answer;
//	}
//
//	// 아래는 테스트로 출력해 보기 위한 코드입니다.
//	public static void main(String[] args) {
//		EatCookie e = new EatCookie();
//		int []cookies = {1, 4, 2, 6, 3, 4, 1, 5};
//		System.out.println(e.eatCookie(cookies));
//	}
//}