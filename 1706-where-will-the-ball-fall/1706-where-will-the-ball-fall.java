class Solution {
    public int[] findBall(int[][] grid) {
	        int rowLen = grid.length;
			int colLen = grid[0].length;

			int[] answer = new int[colLen];

			for (int i = 0; i < colLen; i++)
				answer[i] = i;

			for (int row = 0; row < rowLen; row++) {
				for (int i=0; i<colLen; i++) {
					int col = answer[i];
					if (col == -1) {
						continue;
					}
					
					if (grid[row][col] == 1) {
						if (col == colLen - 1) {
							answer[i] = -1;
							continue;
						}
						if (grid[row][col + 1] == 1) {
							answer[i] += 1;
						} else { // -1
							answer[i] = -1;
						}

					} else { // -1
						if (col == 0) {
							answer[i] = -1;
							continue;
						}
						if (grid[row][col - 1] == -1) {
							answer[i] -= 1;
						} else { // 1
							answer[i] = -1;
						}
					}
				}
			}
			
			return answer;
	 
	    }
}