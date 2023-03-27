package floyd_Warshall;

public class Floyd_Warshall {

	static int number = 4;
	static int INF = 10000000;
	
	// 노드 배열 초기화
	static int[][] node = {
							{0, 5, INF, 8},
							{7, 0, 9, INF},
							{2, INF, 0, 4},
							{INF, INF, 3, 0}
						  };
	
	public static void main(String[] args) {

		// 결과 그래프 초기화
		int[][] ans = new int[number][number];
		
		// 결과 그래프 초기화
		for(int i = 0; i < number; i++) {
			
			for(int j = 0; j < number; j++) {
				ans[i][j] = node[i][j];
			}
		}
		
		// k = 거쳐가는 노드
		for(int k = 0; k < number; k++) {
			
			//i = 출발 노드
			for(int i = 0; i < number; i++) {
				
				// j = 도착 노드
				for(int j = 0; j < number; j++) {
					
					if(ans[i][k] + ans[k][j] < ans[i][j]) {
						ans[i][j] = ans[i][k] + ans[k][j];
					}
				}
			}
		}
		
		// 결과 출력
		for(int i = 0; i < number; i++) {
			for(int j = 0; j < number; j++) System.out.print(ans[i][j] + " ");
			System.out.println();
		}
		
	}

}

