class Solution {
   public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        
		int n = firstList.length;
		int m = secondList.length;
		
		if( n== 0 || m == 0) return new int[0][0];
		
		List<int[]> res = new ArrayList<int[]>();
		int i = 0, j = 0;
		int[] aHead = null;
		int[] bHead = null;
		
		while(i < n && j < m) {
			aHead = firstList[i];
			bHead = secondList[j];
			
			int[] intersect = {Math.max(aHead[0], bHead[0]), Math.min(aHead[1], bHead[1])};
			
			if(intersect[0] <= intersect[1]) {
				res.add(intersect);
			}
			
			if(aHead[1] < bHead[1]) {
				i++;
			} else if(aHead[1] == bHead[1]) {
				i++;
				j++;
			} else {
				j++;
			}
		}
        
		int size = res.size();
		
        int arr[][] = new int[size][2];
        for(int k = 0; k < size; k++) {
        	arr[k] = res.get(k);
        }
        return arr;
    }
}