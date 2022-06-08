class Solution {
    public void setZeroes(int[][] matrix) {
        boolean isZeroRow = false;
        boolean isZeroColumn = false;
        
        // basic idea : using first row and first column as dummy arrays to check if other values should be zero and then updating them at last TC : O(mxn) SC : O(1)
        
        for(int i=0; i < matrix[0].length; i++) { // Checks if first row should be zero
            if(matrix[0][i] == 0) {
                isZeroRow = true;
                break;
            }
        }
        
        for(int i=0; i < matrix.length; i++) { // Checks if first column should be zero
            if(matrix[i][0] == 0) {
                isZeroColumn = true;
                break;
            }
        }
        
        for(int i = 1; i < matrix.length; i++) { //check except the first row and column
            for(int j = 1; j < matrix[0].length; j++) {
                if(matrix[i][j] == 0) {
                    matrix[i][0] = matrix[0][j] = 0;
                }
            }
        }
        
        for(int i = 1; i < matrix.length; i++) { //process check except the first row and column
            for(int j = 1; j < matrix[0].length; j++) {
                if(matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }
        
        if(isZeroRow) { // handle first row
            for(int i=0; i < matrix[0].length; i++) {
                matrix[0][i] = 0;
            }
        }
        
        if(isZeroColumn) { // handle first column 
            for(int i=0; i < matrix.length; i++) {
                matrix[i][0] = 0;
            }
        }
        
    }
}