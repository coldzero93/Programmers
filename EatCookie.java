/*���� ���� �Ա� - Level 6
���ڸ� �����ϴ� ����� å�� ���� �Ϸķ� ������ ���ڸ� �߰��Ͽ����ϴ�.
���ڿ��� ���� ���ڷ� ���� ���̰� �پ� �ֽ��ϴ�.
����� �� ���ʺ��� ������� ���ڸ� �Ա�� �Ͽ����ϴ�.
����� ���� ���ڸ� �� �� ������ ���� ���ں��� ���� �� ���� ���ڸ� �Խ��ϴ�.

���� ó���� ���� 3�� ���ڸ� �Ծ��ٸ�, �������� 4���� ���� ���� ���ڴ� ���� �ʽ��ϴ�.

å������ ���� ������ ���� �ԷµǸ�, ���찡 �ִ� ���ڸ� �� ���� ���� �� �ִ��� ��ȯ���ִ� eatCookie �Լ��� �ϼ��ϼ���.

���� ��� [1, 4, 2, 6, 3, 4, 1, 5] �� �Էµȴٸ�
����� 1, 3, 5, 6, 8��° ����(������ ���� 1, 2, 3, 4, 5)�� ��� �� 5���� ���� �� �ְ�,
5������ �� ���� ���� �� �ִ� ����� �����Ƿ� 5�� �����ϸ� �˴ϴ�.*/

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

	// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
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
//			System.out.print("�� : " + value + ", ���� : " + depth);
//			if(parent != null) System.out.print(", �θ� : " + parent.value);
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
//	// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
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
//		int[][][] dp = new int[cookies.length][2][2]; // [n��°][0:�ȸ���,1:����][0:��������,1:�ִ�]
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
//	// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
//	public static void main(String[] args) {
//		EatCookie e = new EatCookie();
//		int []cookies = {1, 4, 2, 6, 3, 4, 1, 5};
//		System.out.println(e.eatCookie(cookies));
//	}
//}