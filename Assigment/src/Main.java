
import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        List_Songs l = new List_Songs();
        Scanner sc = new Scanner(System.in);
        
        
        String Fname = "Songs.txt";
        l.ReadFromFile(Fname);
        
        l.find_Max();
        String song;
        System.out.print("Input a song name: ");
        song = sc.nextLine();        
        l.search_Songs(song);
        l.traversal();
         String Fname_out = "output.txt";
        l.ReadFromFile(Fname);
       
    }
}
