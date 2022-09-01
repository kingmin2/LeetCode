class Solution {
 
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> answer = new ArrayList<Integer>();
        
        if(matrix == null || matrix.length == 0) return answer;
        
       
        int left=0, right=matrix[0].length-1, top=0, bottom=matrix.length-1;
        int count = (right+1) * (bottom+1);
      
        
        while(count > answer.size()){
            //동
            for(int i = left; i <= right; i++){
                answer.add(matrix[top][i]);
            }
            top++;
            
            //남
            
            for(int i = top; i <= bottom; i++){
                answer.add(matrix[i][right]);
            }
            right--;
            
            //서
            if(top <= bottom){
                for(int i = right; i >= left; i--){
                    answer.add(matrix[bottom][i]);
                }
            }
            
            bottom--;
            
            
            //북
            if(left <= right){
                  for(int i = bottom; i >= top; i--){
                      answer.add(matrix[i][left]);
                  }
            }
            left++;
        }
 
        return answer;
    }
}