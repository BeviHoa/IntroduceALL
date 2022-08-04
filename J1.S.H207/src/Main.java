


import java.util.Scanner;


//Title: secondHalfLetters
//H207 : đếm sô lượng các kí tự thuộc nửa sau của bảng chữ cái

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    
    public static String checkInputString(){
        String s = null;
        while(true){
            System.out.println("Enter String: ");
            s = sc.nextLine();
            if(!s.trim().isEmpty()){
            break;
            }else{
                System.out.println("Name is not empty");
                }           
        }
        return s;
    }

    public static int secondHalfLetters(String s) {
        int count = 0;// biến đếm
        //sử dụng vòng for để duyệt các kí tự từ đầu tới cuối
        for (int i = 0; i < s.length(); i++) {
         
            // nếu ki tu thuộc nửa sau của bảng Alphabet thì sẽ count++
            if ((s.charAt(i) >= 'N') && (s.charAt(i) <= 'Z')
                    || (s.charAt(i) >= 'n') && (s.charAt(i) <= 'z')) 
            {
                count++; 
            }

        }
        return count; // trả về số lượng chữ cái thuộc nửa sau của bảng Alphabet 
    }

    public static void main(String[] args) {
        String s = checkInputString();
        int result = secondHalfLetters(s);
        System.out.println("Output: " + result);
    }
}