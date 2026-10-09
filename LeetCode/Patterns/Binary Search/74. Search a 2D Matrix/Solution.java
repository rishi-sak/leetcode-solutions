class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int left = 0;
        int right = rows * cols - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int value = matrix[mid / cols][mid % cols];

            if (value == target) return true;
            if (value < target) left = mid + 1;
            else right = mid - 1;
        }

        return false;
    }
}
// class Solution {
//     public boolean searchMatrix(int[][] matrix, int target) {
//         int row = 0; int col = matrix[0].length-1;
//         while(row < matrix.length && col >= 0){
//             if(matrix[row][col] == target){
//                 return true;
//             } else if(target < matrix[row][col]){
//                 col--;
//             }else{
//                 row++;
//             }
//         }
//         return false;
//     }    
// } time complexity O(m+n)