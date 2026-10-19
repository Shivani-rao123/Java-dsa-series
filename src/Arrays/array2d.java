package Arrays;

public class array2d {
    public static void main(String[] args) {
        int[][] mat = {
                { 0, 1, 2, 0 },
                { 3, 4, 0, 2 },
                { 1, 3, 1, 5 }
        };
        matrix(mat);
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }

    }
    static void matrix(int[][] matrix){
        int n = matrix.length;
        int m= matrix[0].length;
        boolean[] row = new boolean[n];
        boolean[] col = new boolean[m];
        for (int i =0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                    row[i]=true;
                    col[j]= true;

                }
            }

        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(row[i]||col[j]){
                    matrix[i][j]=0;
                }
            }

        }

    }

}
