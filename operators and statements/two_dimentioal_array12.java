public class two_dimentioal_array12 {
    public static void main(String[] args) {

        int[][] matrix = new int[5][3];
        matrix[0][1] =6;           //x and y values are stored
        matrix[0][2] =7;
        matrix[1][0] =8;
        matrix[1][1] =9;
        matrix[1][2] =10;



        for (int i=0;i<3;i++){   //i is the x value
            for (int j=0;j<3;j++){    //y is the y value
                System.out.println(matrix[i][j]);
            }
        }

    }
}
