// dịnh nghiaxits nhất 20 loại từ khác nhau,
// sau đó viết hàm check các loại từ đó.
package string;

import java.util.Scanner;
import java.util.StringTokenizer;

class HomeWork {

    int f1(String s) {
        //return 0;
//        //dem và trả về xem chuỗi s có bnh từ có độ dài lớn hơn 3
//        String s1[] = s.split("\\s+");
//        int count = 0;
//        
//        for (int i = 0; i < s1.length; i++) {
//            if(check(s1[i]))
//                count ++;
//        }
        int count = 0;
        StringTokenizer stoken = new StringTokenizer(s);
        while (stoken.hasMoreElements()) {
            if (check(stoken.nextElement() + "")) {
                count++;

            }
        }
        return count;
    }
// dem va tra ve so tu trong chuoi s thoa man dk nao do

    private boolean check(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }
    boolean check(String s){
        return s.length() > 3;
    }
}
String f2(String s){
String s1[i] = s.split("\\s+");
int vt = -1;
    for (int i = 0; i < s1.length; i++) {
        if(check(s)){
            vt = i;
        }
    }
return vt == -1?s:s1[vt];


}
// tim và trả về tu dau hoac cuối trong chuỗi s thỏa mãn đk nào đó
// VD: Tìm và trả về từ cuối cùng có 2 nguyên âm/
// k tìm thấy thì trả về nguyên hàm s





String f3(String s){
String [] list = s.split("\\s+");
List <String> listS = new ArrayList<>();
for(String o : list){
listS.add(o);
}
Collections.sort(listS, new Comparator<String>()){
@Override
public int compare(String o1, String o2){
return o1.compareTo(o2);
} 
}};
for (String o : listS){
System.out.println(o);
}
    
}
//sort all các từ thỏa mãn dk abc
//theo thứ tự tăng(giảm) dần
// sort các từ có độ dài lớn hơn 3 theo thứ tự tăng dần 
// còn các từ khác giữ nguyên.

//với 3 dạng trên, viết mỗi dạng với ít nhất 3 bt cụ thể ứng với các đk
//khác nhau.
// đếm, trả về, sắp xếp








public class BTString {

    public static void main(String[] args) {
        HomeWork hw = new HomeWork();
        Scanner sc = new Scanner(System.in);
        System.out.println("Input String s = ");
        String s = sc.nextLine();
        System.out.println("Results :" + hw.f1(s));
    }
}
// dnghia strong password: là một từ có độ đài lớn hơn hoặc bằng 8
// có ít nhất 1 ký tự in hoa 
// có ít nhất 1 ký tự số.
//cho 1 chuỗi s: đếm và trae về trong chuỗi s có bnh từ 
// là strong passwordz  
