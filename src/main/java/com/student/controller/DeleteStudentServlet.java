package com.student.controller;

import java.io.IOException;

import com.student.dao.StudentDao;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/deleteStudent")
public class DeleteStudentServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        int rollNo = Integer.parseInt(req.getParameter("rollNo"));

        StudentDao dao = new StudentDao();
        boolean status = dao.deleteStudent(rollNo);

        
        res.sendRedirect("viewStudents");
    }
}
