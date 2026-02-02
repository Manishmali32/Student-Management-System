<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="java.util.List" %>
<%@ page import="com.student.model.Student" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View Students</title>

<!-- Bootstrap CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

<!-- Bootstrap Icons -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.1/font/bootstrap-icons.css" rel="stylesheet">

<style>
    body {
        background: #f4f6f9;
        padding: 30px;
    }
</style>
</head>

<body>

<div class="container">
    <div class="card shadow p-4">

        <h3 class="text-center mb-4 text-primary">
            <i class="bi bi-people-fill"></i> Student List
        </h3>

        <table class="table table-bordered table-striped table-hover text-center align-middle">
            <thead class="table-dark">
                <tr>
                    <th>Roll No</th>
                    <th>Name</th>
                    <th>City</th>
                    <th>Mobile</th>
                    <th>Age</th>
                    <th>Email</th>
                    <th>Action</th>
                </tr>
            </thead>

            <tbody>
            <%
                List<Student> list =
                    (List<Student>) request.getAttribute("students");

                if (list != null && !list.isEmpty()) {
                    for (Student s : list) {
            %>
                <tr>
                    <td><%= s.getRollNo() %></td>
                    <td><%= s.getName() %></td>
                    <td><%= s.getCity() %></td>
                    <td><%= s.getMobile() %></td>
                    <td><%= s.getAge() %></td>
                    <td><%= s.getEmail() %></td>

                    <!-- UPDATE BUTTON -->
                    <td>
                        <a href="<%= request.getContextPath() %>/students/UpdateStudent.jsp?rollNo=<%= s.getRollNo() %>"
                           class="btn btn-warning btn-sm">
                           <i class="bi bi-pencil-square"></i> Update
                        </a>
                        
                         <a href="<%= request.getContextPath() %>/deleteStudent?rollNo=<%= s.getRollNo() %>"
       class="btn btn-danger btn-sm"
       onclick="return confirm('Are you sure you want to delete this student?');">
       <i class="bi bi-trash-fill"></i> Delete
    </a>
                    </td>
                </tr>
            <%
                    }
                } else {
            %>
                <tr>
                    <td colspan="7">No records found</td>
                </tr>
            <%
                }
            %>
            </tbody>
        </table>

        <div class="text-center mt-3">
            <a href="<%= request.getContextPath() %>/students/addstudent.jsp"
               class="btn btn-primary">
               <i class="bi bi-arrow-left"></i> Back
            </a>
        </div>

    </div>
</div>

</body>
</html>
