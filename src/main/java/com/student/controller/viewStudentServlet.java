package com.student.controller;

import java.io.IOException;
import java.util.List;

import com.student.dao.StudentDao;
import com.student.model.Student;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/viewStudents")
public class viewStudentServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        StudentDao dao = new StudentDao();
        List<Student> students = dao.getAllStudents();

        req.setAttribute("students", students);
        req.getRequestDispatcher("/students/viewStudents.jsp").forward(req, res);

    }
}
