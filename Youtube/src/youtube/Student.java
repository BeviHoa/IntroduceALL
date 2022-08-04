/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package youtube;

/**
 *
 * @author Admin
 */
public class Student {
    private String id;
    private String fullName;
    private String email;
    private String Address;
    private String phoneNumber;
    private float fee;

    public Student() {
    }

    public Student(String id, String fullName, String email, String Address, String phoneNumber, float fee) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.Address = Address;
        this.phoneNumber = phoneNumber;
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", fullName=" + fullName + ", email="
                + email + ", Address=" + Address + ", phoneNumber=" +
                phoneNumber + ", fee=" + fee + '}';
    }
    
    void study (String subject){
        System.out.println(this.fullName + "is studying "+ subject);
    }
    void doExam(String subject){
        System.out.println(this.fullName+ "doing "+ subject + "exam");
        
    }
    void payFee(){
        System.out.println("Fee of "+ this.fullName+ "is" +  this.fee);
    }
    void doHomework (String subject){
        System.out.println(this.fullName+ "is doing"+ subject + "homework");
    }
    
    
    
    
}
