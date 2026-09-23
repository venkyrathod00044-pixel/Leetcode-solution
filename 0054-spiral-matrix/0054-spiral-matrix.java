class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int left=0;
        int top=0;
        int right= matrix[0].length-1;
        int btm=matrix.length-1;
        while (top<=btm && left<=right){
            for (int i=left ; i<=right;i++){
               result.add(matrix[top][i]);
            }top++;
            for (int i=top;i<=btm;i++){
                result.add(matrix[i][right]);
            }right--;
            if(top<=btm){
                for (int i=right;i>=left;i--){
              
                    result.add(matrix[btm][i]);
                
            }btm--;
            }
            if(left<=right){
                for (int i=btm;i>=top;i--){
                    result.add(matrix[i][left]);
            }left++;
            }
        }
        return result;
    }
    
}