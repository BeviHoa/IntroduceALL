/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Admin
 */
public class Student {
    private String studentID;
    private String studentName;
    private String address;
    private boolean status;
    private Group g;

    public Student() {
    }

    public Student(String studentID, String studentName, String address, boolean status, Group g) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.address = address;
        this.status = status;
        this.g = g;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Group getG() {
        return g;
    }

    public void setG(Group g) {
        this.g = g;
    }
    
}
