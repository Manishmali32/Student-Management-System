<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Registration</title>

<!-- Bootstrap CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

<!-- Bootstrap Icons -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.1/font/bootstrap-icons.css" rel="stylesheet">

<style>
    body {
        background: linear-gradient(120deg, #e0f7fa, #f1f8e9);
        min-height: 100vh;
        display: flex;
        align-items: center;
        justify-content: center;
    }
    .card {
        border-radius: 15px;
        box-shadow: 0 8px 25px rgba(0,0,0,0.1);
    }
</style>
</head>

<body>
<div class="container">
    <div class="row justify-content-center">
        <div class="col-md-9 col-lg-8">
            <div class="card p-4">

                <h3 class="text-center mb-4 text-primary">
                    <i class="bi bi-mortarboard-fill"></i> Student Registration
                </h3>

                <form action="<%= request.getContextPath() %>/student" method="post">

                    <div class="row mb-3">
                        <div class="col-md-6">
                            <label class="form-label">Roll Number</label>
                            <input type="number" name="rollNo" class="form-control" required>
                        </div>
                        <div class="col-md-6">
                            <label class="form-label">Full Name</label>
                            <input type="text" name="name" class="form-control" required>
                        </div>
                    </div>

                    <div class="row mb-3">
                        <div class="col-md-6">
                            <label class="form-label">City</label>
                            <input type="text" name="city" class="form-control" required>
                        </div>
                        <div class="col-md-6">
                            <label class="form-label">Mobile</label>
                            <input type="text" name="mobile" class="form-control" required>
                        </div>
                    </div>

                    <div class="row mb-4">
                        <div class="col-md-6">
                            <label class="form-label">Age</label>
                            <input type="number" name="age" class="form-control" required>
                        </div>
                        <div class="col-md-6">
                            <label class="form-label">Email</label>
                            <input type="email" name="email" class="form-control" required>
                        </div>
                    </div>

                    <!-- BUTTONS -->
                    <div class="d-flex gap-3">
                        <button class="btn btn-primary flex-fill" type="submit">
                            <i class="bi bi-person-plus-fill"></i> Register
                        </button>

                        <a href="<%= request.getContextPath() %>/viewStudents"  class="btn btn-success flex-fill">
                            <i class="bi bi-eye-fill"></i> View Students
                        </a>
                    </div>

                </form>

            </div>
        </div>
    </div>
</div>
</body>
</html>
