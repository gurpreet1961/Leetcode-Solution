class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for(int i = 0; i < n/2; i++){
            for(int j = i; j < n-1-i; j++){
                int temp = matrix[i][j]; 
                matrix[i][j] = matrix[n-1-j][i]; //top iight = bottom iight
                matrix[n-1-j][i] = matrix[n-1-i][n-1-j]; //bottom right = bottom left
                matrix[n-1-i][n-1-j] =  matrix[j][n-1-i]; //  bottom left = top left
                 matrix[j][n-1-i] = temp; //top left =  top right 

            }
        }
    }
}