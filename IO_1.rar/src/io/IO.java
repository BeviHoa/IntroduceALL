/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class IO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException  {
        File f = new File("f1.txt");
        System.out.println("Ten file la:" + f.getName());
        System.out.println("Ten file tuyer doi la:" + f.getAbsoluteFile());
        System.out.println("Ten file tuyer doi la:" + f.getAbsolutePath());
        System.out.println("Path chuan la:" + f.getCanonicalPath());
        System.out.println("PNgay cap nhat cuoi cung la:" + new Date(f.lastModified()));
        System.out.println("Thuoc tinh Hidden:" + f.isHidden());
        System.out.println("Thuoc tinh can-read:" + f.canRead());
        System.out.println("Thuoc tinh can-write:" + f.canWrite());
        System.out.println("Kich thuoc:" + f.length() + "bytes");
        
        
    }
    
}
