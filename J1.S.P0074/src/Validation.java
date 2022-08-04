
import java.util.Scanner;

//Title: Write a calculator program (from DCPS’s project)
//J1.S.P0074
public class Validation {
    
    public void menu(){
        System.out.println("=========Calculator program========");
        System.out.println("1. Addition matrix");
        System.out.println("2. Subtraction matrix");
        System.out.println("3. Multion matrix");
        System.out.println("4. Quit");
    }
    
    public int getSize(String mess){// nhập size cho matrix
        Scanner sc = new Scanner(System.in);
        System.out.print(mess);//nhap row thi input row, col cung the
        int number = 0;//
        while (true) {            
            try {
                number = Integer.parseInt(sc.nextLine());// parseInt
                break;//thoat
            } catch (Exception e) {
                System.out.print("Invalid number, please input again: ");
            }
        }
        return number;
    }
    
    public int getChoice(){// có 4 hành động
        Scanner sc = new Scanner(System.in);
        System.out.print("Your choice: ");
        int choice = 0;
        while (true) {
            try {
                choice = Integer.parseInt(sc.nextLine());
                if(choice >= 1 && choice <= 4){ // choice nằm trong 1-4
                    break;
                }else{
                    System.out.print("Choice within 1-4: ");
                }
            } catch (Exception e) {
                System.out.print("Invalid choice, please input again!");
            }
            
        }
        return choice;
    }
    //hiển ra cái matrix cua minh
    public void printMatrix(int matrix[][], int row, int col){
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("["+matrix[i][j]+"]");
            }
            System.out.println("");// in xong moi hang xuoon dong
        }
    }
    
    public int [][] getMatrix(int col, int row){
        int matrix[][] = new int[row][col];
        for (int i = 0; i < row; i++) {//row
            for (int j = 0; j < col; j++) {//col
                matrix[i][j] = getSize("Enter matrix[" + i +"]["+ j + "]: ");
            }
        }
        return matrix;
    }
    
}
