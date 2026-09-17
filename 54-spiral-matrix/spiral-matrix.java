class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int rowst = 0, rowend = matrix.length - 1, colst = 0, colend = matrix[0].length - 1;
        while(rowst <= rowend && colst <= colend){
            for(int j = colst; j <= colend; j++){
                ans.add(matrix[rowst][j]);
            }
            rowst++;
            for(int i = rowst; i <= rowend; i++){
                ans.add(matrix[i][colend]);
            }
            colend--;
            if(rowst <= rowend){
                for(int j = colend; j >= colst; j--){
                    ans.add(matrix[rowend][j]);
                }
                rowend--;
            }
            if(colst <= colend){
                for(int i = rowend; i>= rowst; i--){
                    ans.add(matrix[i][colst]);
                }
                colst++;
            }
        }
        return ans;
    }
}