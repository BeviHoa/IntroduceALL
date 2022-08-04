/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package items;

import java.util.Scanner; 
import java.util.Vector; 
import java.io.*; 
public class NewItems extends Vector<Item> {
    Scanner sc= new Scanner (System.in); 
    // for input data 
    Vector <String> storedCodes = new Vector<String>(); // stored codes in file 
    public NewItems () { super(); }
    // Load stored coded from a text file 
    public void loadstoredCodes (String fName) {
    // Clear stored codes before loading codes 
    if (storedCodes.size() >0) storedCodes.clear(); 
    try {
        File f= new File(fName); // checking the file 
        if (!f.exists()) return; 
        FileReader fr = new FileReader (f); // read() 
        BufferedReader bf= new BufferedReader (fr); // readLine() 
        String code, name, priceStr; 
        while ((code=bf.readLine())!=null&&
            (name=bf.readLine())!=null&&
                (priceStr=bf.readLine())!=null){
            storedCodes.add(code); 
            bf.close(); fr.close();
        }
    }
    catch(Exception e) {System.out.println(e);}
    }
    private boolean valid (String aCode) { // Check it in stored codes 
        int i; 
        for (i=0; i<storedCodes.size(); i++) if (aCode.equals(storedCodes.get(i))) return false; 
        // check it in new-item list 
        for (i=0; i<this.size(); i++){
            if (aCode.equals(this.get(i).getCode())) return false;
        }
        return true;
    }
    // Find an item code in new-item list -DO YOURSELF 
    private int find(String aCode){return 0;}
    //Append new-item list to a text file 
    public void appendToFile (String fName) {
        if (this.size()==0) { 
            System.out.println("Empty list");
            return;
        }
        try{ // append new items to the file
            boolean append= true; 
            File f = new File(fName); // open file for appending data 
            FileWriter fw = new FileWriter (f, append); // write() 
            PrintWriter pw = new PrintWriter (fw); // println() 
            for (Item x:this) {
                //Items.txt - Note. 
                pw.println(x.getCode()); 
                // write the code 
                pw.println(x.getName()); 
                // write the name 1001 
                pw.println(x.getPrice()); // write the price
                pw.flush(); // write to file immediately
            }
            pw.close(); fw.close(); // close the file
        this. loadstoredCodes (fName);// reloadstorecodesTV 
        this.clear(); // clear item list
    }
    catch (Exception e) {System.out.println(e);}
    }
    // add new item 
    public void addNewItem() {
        String newCode, newName; 
        int price; 
        boolean duplicated = false, matched = true; System.out.println("Enter New Item Details:"); 
        do {
        System.out.print(" code (format 1000): "); 
        newCode = sc.nextLine().toUpperCase(); 
        duplicated = !valid(newCode); 
        matched = newCode.matches ("^I\\d{3} $"); 
        // Pattern: I and 3 digits 
        if (duplicated) System.out.println(" The code is duplicated."); 
        if (!matched) System.out.println(" The code: I and 3 digits.");
        }
        while (duplicated || (!matched) ); 
        System.out.print(" name: "); 
        newName = sc.nextLine().toUpperCase(); 
        System.out.print(" price: "); 
        price = Integer.parseInt(sc.nextLine()); 
        this.add(new Item(newCode, newName, price)); 
        System.out.println("New Item has been added.");
        // remove items from new-item list - DO YOURSELF 
        }
        public void removeItem() {} 
        //Update an Item price - DO YOURSELF 
        public void updatePrice() {} 
        // Print out the list- DO YOURSELF 
        public void print () {}
}