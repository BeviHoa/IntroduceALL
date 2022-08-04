
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;


public class List_Songs {
    Node head,tail;
    
    public List_Songs() {head = tail = null;}
    
    //return true if Mylist is empty otherwise return false
    public boolean isEmpty() {return head == null;}
    
    public void addLast(Songs x) 
    { 
        Node p = new Node(x);
        if(isEmpty()) 
        {
            head = tail = p;
        }
        else 
        {
            tail.next = p; tail = p;
        }
    }
   
    public void visit(Node x)
    {
        if(x !=  null)
        {
            System.out.println(x.data.toString());
        }            
    }
    
    
    public void traversal() 
    {        
        Node p = head;
        while(p != null) 
        {
            visit(p); 
            p = p.next;
        }
        System.out.println("");        
    }
    
    public void reverse() 
    {
        int n = size();
        for(int i = 0, j = n - 1; i < j; i ++, j --) 
        {
           Node pi = Pos(i), pj = Pos(j);
            Songs t = pi.data;
            pi.data = pj.data; pj.data = t;
        }
    }
    
    //return a Node at position k
    public Node Pos(int k) 
    {
        Node p = head; int c = 0;
        while(p != null && c < k)
        {
            c++; p = p.next;
        }
        return p;
    }
    
    //return number of nodes in the list
    public int size() 
    {
        Node p = head; int c = 0;
        while(p != null) 
        {
            c++; p = p.next;
        }
        return c;
    }
    
    //find and return the maximum value in the list. 
    public int find_Max()
    {
        int max = Pos(0).data.Rated;
        int index_Max = 0;
        if(isEmpty())
            System.out.println("List is empty!!!");
        else
        {
            for (int i = 0; i < size(); i++) {
                if(Pos(i).data.Rated > max)
                {
                    max = Pos(i).data.Rated;
                    index_Max = i;
                }
            }           
        }
        return max;
    }
    
    
    public Node search(int x) 
    {
        Node p = head;
        if(isEmpty())
            System.out.println("List is empty:");
        else
        {
            while(p != null) 
            {   
                if(p.data.Rated == x)                
                    break;                
                p = p.next;
            }
        }
        return p;
    }
    
    
    public void deleteFromTail()
    {
        Node p = null;
        Node tmp = head;
        if (isEmpty()) 
            System.out.println("List null");
        else 
        {
            while (tmp != tail) 
            {
                p = tmp;
                tmp = tmp.next;
            }
            p.next = null;
            tail = p;
        }
    }
    
    public void deleteFromHead()
        {
            Node p = head;
            if(isEmpty())
                head = tail = null;
            else
            {
                head = head.next;
            }
        }
    
    
    public void dele(int x)
    {
        Node result = search(x);
        if(isEmpty())
            System.out.println("List is empty!!!");
        else
        {
            Node tmp = head;
            Node p1 = null;
            if(result == null)
                System.out.println("Not found!!!");
            else
            {
                if(x == head.data.Rated)
                {
                     deleteFromHead();
                     return; 
                }
                else if(x == tail.data.Rated)
                {
                    deleteFromTail(); 
                    return;
                }
                else
                {
                    boolean flag = false;
                    while (tmp != null) {
                        if (tmp.data.Rated == x) {
                            flag = true;
                            break;
                        }
                        p1 = tmp;
                        tmp = tmp.next;
                    }
                    if (flag) 
                        p1.next = p1.next.next;
                }
            } 
        }
    }
    
    public void ReadFromFile(String Fname) throws IOException
    {
        try {
            FileReader fr = new FileReader(Fname);
            BufferedReader br = new BufferedReader(fr);
            
            String sub[] = null;
            String line = "";
            String name;
            String artist;
            int rated;
            while(true)
            {
                line = br.readLine();
                
                if(line == null || line.trim().length() < 3)
                    break;
                sub = line.split("[|]");
                name = sub[0].trim();
                artist = sub[1].trim();
                rated = Integer.valueOf(sub[2]);
                addLast(new Songs(name, artist, rated));
            }
            reverse();// dao nguoc
            traversal();
            fr.close();
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("Can not open file!!!");
        }
    }
    
    
    //return 1 list song = input entered
    public void search_Songs(String song) 
    {
        Node p = head;
        if(isEmpty())
            System.out.println("List is empty:");
        else
        {
            while(p != null) 
            {   
                if(p.data.Song_name.equalsIgnoreCase(song))
                    System.out.println(p.data.toString());;   
                p = p.next;
            }
        }
    }
    
 
    public void SaveToFile(String Fname)
    {
        Node s = head;
        try {
            FileWriter fw = new FileWriter(Fname);
            BufferedWriter bw = new BufferedWriter(fw);
            
            while(s.next != null)
            {
                bw.write(s.data.toString());
                bw.newLine();
                s = s.next;
            }
            fw.close();
            bw.close();
        } catch (IOException e) {
            System.out.println("Can not open file!!!");
        }
    }
    
    

    
}
