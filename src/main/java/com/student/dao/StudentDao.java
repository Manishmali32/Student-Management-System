package com.student.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.student.model.Student;

public class StudentDao {

    public boolean saveStudent(Student student) {

        boolean status = false;

        String sql =
        		"insert into \"Students_info\" (\"RollNo\", \"Name\", city, mobile, age, email) values (?,?,?,?,?,?)";



      
        try (
        		
            Connection con = DBConnection.getConnection();
        		  
            PreparedStatement ps = con.prepareStatement(sql)
        ) {

            ps.setInt(1, student.getRollNo());
            ps.setString(2, student.getName());
            ps.setString(3, student.getCity());
            ps.setString(4, student.getMobile());
            ps.setInt(5, student.getAge());
            ps.setString(6, student.getEmail());

            ps.executeUpdate();
            status = true;

        } catch (Exception e) {
            e.printStackTrace(); 
        }

        return status;
    }
    
    public List<Student> getAllStudents() {

        List<Student> list = new ArrayList<>();

        String sql = "select \"RollNo\", \"Name\", city, mobile, age, email from \"Students_info\"";

        try (
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
        ) {

            while (rs.next()) {
                Student s = new Student();
                s.setRollNo(rs.getInt("RollNo"));
                s.setName(rs.getString("Name"));
                s.setCity(rs.getString("city"));
                s.setMobile(rs.getString("mobile"));
                s.setAge(rs.getInt("age"));
                s.setEmail(rs.getString("email"));

                list.add(s);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
    
    
    
    public boolean updateStudent(Student student) {

        boolean status = false;

        String sql =
          "update \"Students_info\" set \"Name\"=?, city=?, mobile=?, age=?, email=? where \"RollNo\"=?";

        try (
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql)
        ) {

            ps.setString(1, student.getName());
            ps.setString(2, student.getCity());
            ps.setString(3, student.getMobile());
            ps.setInt(4, student.getAge());
            ps.setString(5, student.getEmail());
            ps.setInt(6, student.getRollNo());

            int rows = ps.executeUpdate();
            if (rows > 0) {
                status = true;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return status;
    }

    
    public boolean deleteStudent(int rollNo) {

        boolean status = false;

        String sql = "delete from \"Students_info\" where \"RollNo\" = ?";

        try (
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql)
        ) {

            ps.setInt(1, rollNo);

            int rows = ps.executeUpdate();
            if (rows > 0) {
                status = true;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return status;
    }

    
   
}
