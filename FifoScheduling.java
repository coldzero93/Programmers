/*선입선출 스케줄링 - Level 8
처리해야 할 작업이 N개가 대기중이고 이를 처리하기위한 CPU가 있습니다.
N개의 작업은 모두 동일한 작업이라고 가정합니다.

작업을 수행하는 CPU에는 여러개의 코어가 있는데요.
코어별로 한 작업당 걸리는 시간이 다릅니다.
한 코어에서 작업이 끝나면 빈 코어에 다음 작업이 바로 들어가며,
2개 이상의 코어가 남을 경우 앞의 코어부터 채워줍니다.
처리해야 될 작업의 개수 n과, 각 코어의 처리 시간이 담긴 배열 core가 주어질 때,
마지막 작업이 들어가는 코어의 번호를 반환해주는 getCoreNumber 함수를 완성하세요.
예를 들어 작업이 6개이고, CPU의 코어별 처리 시간이 [1,2,3] 이라면 처음 3개의 작업은 각각 1,2,3번에 들어가고,
1의 시간 뒤 1번 코어에 4번째 작업, 다시 1의 시간 뒤 1,2번 코어에 5,6번 째 작업이 들어가므로 2를 반환해 주면 됩니다.
*/
class FifoScheduling {
	public int getCoreNumber(int n, int[] core) {
		int answer = 0;
		
		return answer;
	}

	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		FifoScheduling fifo = new FifoScheduling();
		int[] core = { 1, 2, 3 };
		System.out.println(fifo.getCoreNumber(6, core));
	}
}