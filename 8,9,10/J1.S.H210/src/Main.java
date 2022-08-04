
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


//Title: flipLines
//J1.S.H210
// Đảo ngược dòng
public class Main {
    private static final Scanner sc = new Scanner(System.in);
    // tạo hàm để check file xem có tồn tại hay k.
    public static File checkFile(String s){
        String name = "";
        File file;
        do{
            System.out.println(s);
            name = sc.nextLine();
            file = new File(name); // tạo file
            if (file.exists()){break;}// nếu tồn tại thì break khỏi hàm 
            else{
                System.out.println("File không tồn tại, vui lòng nhập lại!");                
            }
        }while(true);
        return file;
        
    }
    
    public static String flipLines(Scanner input) {
        String rs = "";
//quét 
        while (input.hasNextLine()) {// vòng lặp đến khi nào xem có còn dòng nào nữa k
            String line1 = input.nextLine();//lưu trữ dòng đầu tiên và quet no
            String line2 = "";
            if (input.hasNextLine()) {//nếu mà input còn 
                
                line2 = input.nextLine();
               
            } else {
                rs += line1;//hiển thị dòng đầu cho rs
                
                break;
            }
          
// tại dòng cuối 
            rs += line2 + "\n" + line1 + "\n" +"";
            
        }
        return rs;
    }

    public static void main(String[] args) throws FileNotFoundException {
        File file = checkFile("Enter file name: ");
        System.out.println(flipLines(new Scanner(file)));
    }
}
