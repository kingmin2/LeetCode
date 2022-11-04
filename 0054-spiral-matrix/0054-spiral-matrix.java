class Solution {

    
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> answer = new ArrayList<>();
        
        int top = 0;
        int bottom = matrix.length-1;
        int left = 0;
        int right = matrix[0].length-1;

        
        if(right < 0){
            for(int i = 0; i <= bottom; i++) answer.add(matrix[i][0]);
            return answer;
        } 
        
        if(bottom < 0){
            for(int i = 0; i <= right; i++) answer.add(matrix[0][i]);
            return answer;
        }
        
        int size = matrix[0].length * matrix.length;
        
        
        while(answer.size() < size){
 
            for(int i = left; i <= right; i++){
                answer.add(matrix[top][i]);
            }
            top+= 1; 
            
            if(answer.size() == size) break;
           
            for(int i = top; i <= bottom; i++){
                answer.add(matrix[i][right]);
            }
            right-=1;
            
            if(answer.size() == size) break;
            for(int i = right; i>= left; i--){
                answer.add(matrix[bottom][i]);
            }
            bottom-=1;
            
            if(answer.size() == size) break;
            for(int i = bottom; i >= top; i--){
                answer.add(matrix[i][left]);
            }
            left+=1;  
        }
        
        return answer;
    }
}