package com.student.controller;

import java.io.IOException;

import com.student.dao.StudentDao;
import com.student.model.Student;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/updateStudent")
public class UpdateStudentServlet extends HttpServlet {

    // HANDLE FORM SUBMIT
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

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
        boolean status = dao.updateStudent(student);

        if (status) {
            res.sendRedirect("viewStudents");
        } else {
            res.getWriter().println("Update Failed");
        }
    }
}
