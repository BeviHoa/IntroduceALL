
import java.util.Scanner;

//Title: swapDigitPairs
//J1..S.H208
public class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static int swapDigitPairs(int n){
        int result = 0; // để in ra kq
        int m = 1;
    
    while(n > 0) {// kết thúc tại n!= 0
        int d1 = n % 10;
        n = n / 10;// tách chứ số cuối cùng của n
        
        if(n == 0) {
            result += m * d1;// nếu có số chữ só là số lẻ thì giữ ngyên số còn lại
            break;
        }
        
        int d2 = n % 10;// tách chữ số áp chót của n
        result = result + m * 10 * d1 + m * d2;// đổi 2 số vừa tách d1 d2 rôi
                                               // cộng với result của vòng lặp trước
        n = n / 10;
        m = m * 100;// để vòng lặp tiếp theo = kq cũ + mới= số có cs = số vừa tách
    }
    
    return result;
}
    
    
    private static int checkInputInt(){
        while(true){
            System.out.println("Enter you number: ");
            try {
                int result = Integer.parseInt(sc.nextLine());
                return result;
            } catch (Exception e) {
                System.out.println("Please input positive integer number!");
            }
        }
    }
    public static void main(String[] args) {
        int number = checkInputInt();
        System.out.println(swapDigitPairs(number));
    }
}
