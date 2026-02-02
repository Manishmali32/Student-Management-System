package com.student.controller;

import java.io.IOException;
import java.io.PrintWriter;

import com.student.dao.StudentDao;
import com.student.model.Student;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/student")
public class AddservletStudent extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
    	
    	PrintWriter out=res.getWriter();

        int rollNo = Integer.parseInt(req.getParameter("rollNo"));
        String name = req.getParameter("name");
        String city = req.getParameter("city");
        String mobile = req.getParameter("mobile");
        int age = Integer.parseInt(req.getParameter("age"));
        String email = req.getParameter("email");

        Student student = new Student();

        student.setRollNo(rollNo);
        student.setName(name);
        student.setCity(city);
        student.setMobile(mobile);
        student.setAge(age);
        student.setEmail(email);

        StudentDao dao = new StudentDao();
        boolean status = dao.saveStudent(student);

        if (status) {
            res.sendRedirect("index.jsp");
        } else {
            out.println("<script>alert('Error found');</script>");
        }
    }
}
