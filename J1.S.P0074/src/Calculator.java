
class Calculator {
    public void addMatrix() {
        Validation m = new Validation();
        //nhap du lieu cho matrix 1
        int row1 = m.getSize("Enter row matrix 1: ");
        int col1 = m.getSize("Enter column matrix 1: ");
        int matrix1[][] = m.getMatrix(col1, row1);
        // du lieu cho matrix2
        int row2;
        int col2;
        while (true) {
            row2 = m.getSize("Enter row matrix 2: ");
            if (row2 == row1) { //cộng đc thì 2 matrix cùng hàng
                break;
            } else {
                System.out.println("Row 2 must equal row 1");
            }
        }
        while (true) {
            col2 = m.getSize("Enter column matrix 2: ");
            if (col2 == col1) {//cộng đc thì 2 matrix cùng cột
                break;
            } else {
                System.out.println("Col 2 must equal col 1");
            }
        }
        int matrix2[][] = m.getMatrix(col2, row2);
        //khoi tao matrin result
        int result[][] = new int[row2][col2];
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < col2; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];// cộng 2 matrix
            }
        }
        System.out.println("-----Result-----");
        m.printMatrix(matrix1, row1, col1);//in ra matrix1
        System.out.println("+");
        m.printMatrix(matrix2, row2, col2);//in ra matrix2
        System.out.println("=");
        m.printMatrix(result, row2, col2);//in ra matrix result
    }

    public void subMatrix() {
        Validation m = new Validation();
        int row1 = m.getSize("Enter row matrix 1: ");
        int col1 = m.getSize("Enter column matrix 1: ");
        int matrix1[][] = m.getMatrix(col1, row1);

        int row2;
        int col2;
        while (true) {
            row2 = m.getSize("Enter row matrix 2: ");
            if (row2 == row1) {
                break;
            } else {
                System.out.println("Row 2 must equal row 1");
            }
        }
        while (true) {
            col2 = m.getSize("Enter column matrix 2: ");
            if (col2 == col1) {
                break;
            } else {
                System.out.println("Col 2 must equal col 1");
            }
        }
        int matrix2[][] = m.getMatrix(col2, row2);

        int result[][] = new int[row2][col2];
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < col2; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        System.out.println("-----Result-----");
        m.printMatrix(matrix1, row1, col1);
        System.out.println("-");
        m.printMatrix(matrix2, row2, col2);
        System.out.println("=");
        m.printMatrix(result, row2, col2);
    }

    public void multiMatrix() {
        Validation m = new Validation();
        int row1 = m.getSize("Enter row matrix 1: ");
        int col1 = m.getSize("Enter column matrix 1: ");
        int matrix1[][] = m.getMatrix(col1, row1);
        int row2;
        while (true) {
            row2 = m.getSize("Enter row matrix 2: "); // row phai bang col cua maxtrix 1
            if (row2 == col1) {
                break;
            } else {
                System.out.println("Row 2 must equal col 1");
            }
        }
        int col2 = m.getSize("Enter column matrix 2: ");

        int matrix2[][] = m.getMatrix(col2, row2);

        int result[][] = new int[row1][col2];// matrixx của result
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                for (int k = 0; k < row2; k++) {//col1 = row2
//                    i=0, k vtri dau// cột k tag
                    result[i][j] += matrix1[i][k] * matrix2[k][j]; 
                }
            }
        }
        System.out.println("-----Result-----");
        m.printMatrix(matrix1, row1, col1);
        System.out.println("*");
        m.printMatrix(matrix2, row2, col2);
        System.out.println("=");
        m.printMatrix(result, row1, col2);
    }
}

