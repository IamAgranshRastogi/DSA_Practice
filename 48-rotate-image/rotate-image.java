class Solution {
    public void rotate(int[][] matrix) {
       for(int i=0;i<matrix.length;i++){
            for(int j=i+1;j<matrix.length;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        rev(matrix);
    }
    void rev(int [][]matrix){
        for(int i=0;i<matrix.length;i++){
            int k=0,j = matrix.length-1;
            while(k<=j){
                int temp = matrix [i][k];
                matrix[i][k] = matrix[i][j];
                matrix[i][j] = temp;
                k++;
                j--;
            }
        }
    }
}