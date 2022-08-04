/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.Subject;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author thinh
 */
public class SubjectDAO extends BaseDAO{
    
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    public ArrayList<Subject> getLatestSubject() {
        String query = "SELECT TOP 10 * FROM [PracticeQuizSystem].[dbo].[Subject] WHERE Status = 1 ORDER BY SubjectID DESC";
        ArrayList<Subject> subjectList = new ArrayList<>();
        try {
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
               Subject s =new Subject();
               s.setId(rs.getInt(1));
               s.setTitle(rs.getString(2));
               s.setThumbnail(rs.getString(3));
               s.setDescription(rs.getString(4));
               s.setBrief(rs.getString(5));
               s.setTagline(rs.getString(6));
               s.setPrice(rs.getString(7));
               s.setCategoryID(rs.getInt(8));
               s.setOwner(rs.getString(10));
               s.setNumberLesson(rs.getInt(11));
               s.setStatus(rs.getString(12));
               subjectList.add(s);
            }
        } catch (Exception e) {
        }
        return subjectList;
    }
    
    public ArrayList<Subject> getRecommenedSubject() {
        String query = "SELECT TOP 10 * FROM [QuizPractice].[dbo].[Subject] WHERE Status = 1 ORDER BY NEWID()";
        ArrayList<Subject> subjectList = new ArrayList<>();
        try {
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
               Subject s =new Subject();
               s.setId(rs.getInt(1));
               s.setTitle(rs.getString(2));
               s.setThumbnail(rs.getString(3));
               s.setDescription(rs.getString(4));
               s.setBrief(rs.getString(5));
               s.setTagline(rs.getString(6));
               s.setPrice(rs.getString(7));
               s.setCategoryID(rs.getInt(8));
               s.setOwner(rs.getString(10));
               s.setNumberLesson(rs.getInt(11));
               s.setStatus(rs.getString(12));
               subjectList.add(s);
            }
        } catch (Exception e) {
        }
        return subjectList;
    }
    
    public Subject getSubjectByID(String sId) {
        String query = "SELECT * FROM [QuizPractice].[dbo].[Subject] WHERE SubjectID = ?";
        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, sId);
            rs = ps.executeQuery();
            while (rs.next()) {
                Subject s =new Subject();
               s.setId(rs.getInt(1));
               s.setTitle(rs.getString(2));
               s.setThumbnail(rs.getString(3));
               s.setDescription(rs.getString(4));
               s.setBrief(rs.getString(5));
               s.setTagline(rs.getString(6));
               s.setPrice(rs.getString(7));
               s.setCategoryID(rs.getInt(8));
               s.setOwner(rs.getString(10));
               s.setNumberLesson(rs.getInt(11));
               s.setStatus(rs.getString(12));
               return s;
            }
        } catch (Exception e) {
        }
        return null;
    }
    
    public int countSubject() {
        String query = "SELECT COUNT(*) FROM [PracticeQuizSystem].[dbo].[Subject]";
        try {
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
        }
        return 0;
    }
    
    public ArrayList<Subject> pagingSubject(int index) {
        ArrayList<Subject> list = new ArrayList<>();
        String query = "SELECT * FROM [PracticeQuizSystem].[dbo].[Subject] ORDER BY SubjectID OFFSET ? ROWS FETCH NEXT 12 ROWS ONLY";
        try {
            ps = connection.prepareStatement(query);
            ps.setInt(1, (index - 1) * 12);
            rs = ps.executeQuery();
            while (rs.next()) {
                Subject s =new Subject();
               s.setId(rs.getInt(1));
               s.setTitle(rs.getString(2));
               s.setThumbnail(rs.getString(3));
               s.setDescription(rs.getString(4));
               s.setBrief(rs.getString(5));
               s.setTagline(rs.getString(6));
               s.setPrice(rs.getString(7));
               s.setCategoryID(rs.getInt(8));
               s.setOwner(rs.getString(10));
               s.setNumberLesson(rs.getInt(11));
               s.setStatus(rs.getString(12));
               list.add(s);
            }
        } catch (Exception e) {
        }
        return list;
    }
    
    public ArrayList<Subject> getAll() {
        ArrayList<Subject> sub = new ArrayList<>();
       try {
           String sql = "SELECT * FROM [PracticeQuizSystem].[dbo].[Subject] WHERE Status = 1 ORDER BY SubjectID DESC";
           PreparedStatement statement = connection.prepareStatement(sql);
           ResultSet rs = statement.executeQuery();
           while(rs.next())
           {
               Subject s =new Subject();
               s.setId(rs.getInt(1));
               s.setTitle(rs.getString(2));
               s.setThumbnail(rs.getString(3));
               s.setDescription(rs.getString(4));
               s.setBrief(rs.getString(5));
               s.setTagline(rs.getString(6));
               s.setPrice(rs.getString(7));
               s.setCategoryID(rs.getInt(8));
               s.setOwner(rs.getString(10));
               s.setNumberLesson(rs.getInt(11));
               s.setStatus(rs.getString(12));
               sub.add(s);
           }
       } catch (SQLException ex) {
           Logger.getLogger(BlogDAO.class.getName()).log(Level.SEVERE, null, ex);
       }
       return sub;
    }
    
    public ArrayList<Subject> getListByPage(ArrayList<Subject> list, int start, int end) {
        ArrayList<Subject> arr = new ArrayList<>();
        for (int i = start; i < end; i++) {
            arr.add(list.get(i));
        }
        return arr;
    }
    
    public ArrayList<Subject> getSubjectByTitle(String title) {
        String query = "SELECT * FROM [QuizPractice].[dbo].[Subject] WHERE Title like ?";
        ArrayList<Subject> subjectList = new ArrayList<>();
        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, "%" + title + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
               Subject s =new Subject();
               s.setId(rs.getInt(1));
               s.setTitle(rs.getString(2));
               s.setThumbnail(rs.getString(3));
               s.setDescription(rs.getString(4));
               s.setBrief(rs.getString(5));
               s.setTagline(rs.getString(6));
               s.setPrice(rs.getString(7));
               s.setCategoryID(rs.getInt(8));
               s.setOwner(rs.getString(10));
               s.setNumberLesson(rs.getInt(11));
               s.setStatus(rs.getString(12));
               subjectList.add(s);
            }
        } catch (Exception e) {
        }
        return subjectList;
    }
    public ArrayList<Subject> getByCate(String id) {
        ArrayList<Subject> sub = new ArrayList<>();
       try {
           String sql = "SELECT * FROM [PracticeQuizSystem].[dbo].[Subject] WHERE Status = 1 AND CategoryID = ? ORDER BY SubjectID DESC";
           PreparedStatement statement = connection.prepareStatement(sql);
           statement.setInt(1, Integer.parseInt(id));
           ResultSet rs = statement.executeQuery();
           while(rs.next())
           {
               Subject s =new Subject();
               s.setId(rs.getInt(1));
               s.setTitle(rs.getString(2));
               s.setThumbnail(rs.getString(3));
               s.setDescription(rs.getString(4));
               s.setBrief(rs.getString(5));
               s.setTagline(rs.getString(6));
               s.setPrice(rs.getString(7));
               s.setCategoryID(rs.getInt(8));
               s.setOwner(rs.getString(10));
               s.setNumberLesson(rs.getInt(11));
               s.setStatus(rs.getString(12));
               sub.add(s);
           }
       } catch (SQLException ex) {
           Logger.getLogger(BlogDAO.class.getName()).log(Level.SEVERE, null, ex);
       }
       return sub;
    }
}
