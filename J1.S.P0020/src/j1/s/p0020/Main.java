import java.util.Random;
import java.util.Scanner;

// title:Selection sort algorithm.
// bài : J1.S.P0020
public class Main {

    private static final Scanner sc = new Scanner(System.in);
    public static int checkInputInt(){
        while(true){
            try{
                int result = Integer.parseInt(sc.nextLine().trim());//ktra dau vao
                return result;
            }catch(NumberFormatException e){ // neu ng nhập sai thì yêu cầu nhập lai
                System.out.println("Hay Nhap So: ");
                System.out.print("Nhap lai: ");
            }
        }
    }
    
    private static int inputArray(){
        int n = checkInputInt();
        while(true){
            if(n<=0){ // n mà âm thì cũng nhập lại
                System.out.print("Data is invalid ,please re-enter: ");
                n = checkInputInt();
            }else{
                return n;
            }
        }
    }
    
    private static int[] ranDom(int n){
       
        int[] a = new int[n];
        Random rd = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = (int)(Math.random()*n); // luu tru cac ptu ngau nhien            
        }
        return a;
    }
    private static void selectionSort(int [] a){
        int indexMin, i,j;
        System.out.println("Unsorted array : ");
        for (i = 0; i < a.length; i++) {// vong lap de hien thi ra mang truoc khi sort
            System.out.print(a[i] + " ");
            
        }
        // lap qua tất cả các số
        for (i = 0; i < a.length - 1; i++) {
            indexMin = i; // thiết lập đây là phần tử min
            for (j = i+1; j < a.length; j++) { // kiểm tra xem ptu hiện tại có phải nhỏ nhất không
                if(a[j] < a[indexMin]){
                    indexMin = j;
                }
            }
            if(indexMin != i){
                // đổi chỗ các số
                int temp = a[indexMin];
                a[indexMin] = a[i];
                a[i] = temp;
            }
        }      
    }
    
    private static void print(int[] a){
        System.out.println("\nSorted array: ");
        for (int i = 0; i < a.length; i++) {// vong lap in ra ptu sau khi da sort
            System.out.print(a[i] + " ");      
        }       
    }
    
    public static void main(String[] args) {
        int n = inputArray();
        int[] a = ranDom(n);
        selectionSort(a);
        print(a);
    }
}