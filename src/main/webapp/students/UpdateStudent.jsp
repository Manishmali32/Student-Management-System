<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<title>Update Student</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>

<body class="bg-light">

<div class="container mt-5">
    <div class="card p-4">
        <h3 class="text-center mb-4">Update Student</h3>

        <form action="<%= request.getContextPath() %>/updateStudent" method="post">

            <input type="hidden" name="rollNo"
                   value="<%= request.getParameter("rollNo") %>">

            <div class="mb-3">
                <label>Name</label>
                <input type="text" name="name" class="form-control" required>
            </div>

            <div class="mb-3">
                <label>City</label>
                <input type="text" name="city" class="form-control" required>
            </div>

            <div class="mb-3">
                <label>Mobile</label>
                <input type="text" name="mobile" class="form-control" required>
            </div>

            <div class="mb-3">
                <label>Age</label>
                <input type="number" name="age" class="form-control" required>
            </div>

            <div class="mb-3">
                <label>Email</label>
                <input type="email" name="email" class="form-control" required>
            </div>

            <button class="btn btn-success w-100">Update</button>

        </form>
    </div>
</div>

</body>
</html>
