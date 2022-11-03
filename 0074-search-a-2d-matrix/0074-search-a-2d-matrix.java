class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
         if(matrix == null || matrix.length==0 || matrix[0].length==0) return false;

       int col = matrix.length;
       int row = matrix[0].length;

       int start = 0;
       int end = col*row-1;

       while(start <= end){
           int mid = (start + end)/2;
           int midCol = mid/row;
           int midRow = mid%row;

           if(matrix[midCol][midRow] == target){
               return true;
           } else if(matrix[midCol][midRow] < target){
               start = mid+1;
           } else {
               end = mid-1;
           }
 
       }

       return false;
        
    }
}