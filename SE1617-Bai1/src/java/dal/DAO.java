/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;


import model.Department;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Employee;


public class DAO extends DBContext {
    public List<Department> getAll(){
        List<Department> list=new ArrayList<>();
        String sql="select * from Department";
        try {
            PreparedStatement st=connection.prepareStatement(sql);
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                list.add(new Department(rs.getInt("id"), rs.getString("name")));
                
            }
        } catch (SQLException e) {
        }
        return list;
    }
    
    public List<Employee> getEmpsByDid(int did){
        List<Employee> list = new ArrayList<>();
        String sql = "select 3.id, e.name, e.dob, e.gender, d.id as did,"+" d.name as dname from Employee e \n"
                + "     inner join Department d on(d.id=e.did)";
        if(did !=0){
            sql+=" where did="+did;
        }
        try {
            PreparedStatement st=connection.prepareStatement(sql);
            ResultSet rs=st.executeQuery();
            while(rs.next()){
               Department d=new Department(rs.getInt("did"), rs.getString("dname"));
               Employee e=new Employee(rs.getInt("id"),rs.getString("name"),rs.getString("dob"), rs.getBoolean("gender"),d);
               list.add(e);
            }
        } catch (SQLException e) {
        }
        return list;
    }
    
}
