class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
       int left = 0,  right = matrix[0].length-1;
        int top = 0, bottom = matrix.length-1;
        List<Integer> aList = new ArrayList<>();
        
        if(right < 0 ) {
            for(int i=0; i <= bottom; i++) {
                aList.add(matrix[i][0]);
            } return aList;
        }
        
        if(bottom < 0 ) {
            for(int i=0; i <= right; i++) {
                aList.add(matrix[0][i]);
            } return aList;
        }
        
        int size =  matrix[0].length * matrix.length;
        
        while(aList.size() < size){
            for(int i = left; i <= right; i++){
                aList.add(matrix[top][i]);
            }
            top+= 1; 
            
            if(aList.size() == size) break;
            for(int i = top; i <= bottom; i++){
                aList.add(matrix[i][right]);
            }
            right-=1;
            
            if(aList.size() == size) break;
            for(int i = right; i>= left; i--){
                aList.add(matrix[bottom][i]);
            }
            bottom-=1;
            
            if(aList.size() == size) break;
            for(int i = bottom; i >= top; i--){
                aList.add(matrix[i][left]);
            }
            left+=1;  
        }
        
        return aList;
    }
}