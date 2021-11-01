<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 10/28/2021
  Time: 2:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/assert/bootstrap413/css/bootstrap.min.css">
    <link rel="stylesheet" href="/assert/datatables/css/dataTables.bootstrap4.min.css"></head>
<body>
<div class="container-fluid p-0" style="font-family: 'Times New Roman'">
    <div class="row">
        <div class="col-lg-10">
            <img width="50px" style="margin: 20px" src="https://media-exp1.licdn.com/dms/image/C510BAQEdjKl11NB6-g/company-logo_200_200/0/1519959194921?e=2159024400&v=beta&t=DDGPgnMddsArR4oUVxPcRnCXjIm7LqkMtAWlBkTmL1Y">
        </div>
        <div class="col-lg-2">
            <p style="margin-top: 20px">Nguyễn Đình Hùng Anh</p>
        </div>
</div>
</div>
<div>
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <div class="container-fluid" >
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <div class="col-lg-9 ">
                <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                    <li class="nav-item">
                        <a class="nav-link active" aria-current="page" href="#">Home</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link active" aria-current="page" href="#">Employee</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Customer</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link service">Service</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link contract">Contract</a>
                    </li>
                </ul>
                </div>
                <div class="col-lg-3">
                <form class="d-flex">
                    <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                    <button class="btn btn-outline-success" type="submit">Search</button>
                </form>
                </div>
            </div>
        </div>
    </nav>
</div>
<div class="container-fluid">
    <div class="row">
        <div class="col-lg-2">
            <button type="button" class="btn btn-primary">Add New</button>
        </div>
        <div class="col-lg-10">
            <div class="col-lg-11 border p-5" style="min-height: 500px">
                <table id="employee" class="table table-striped">
                    <thead>
                    <tr>
                        <th scope="col">Id Employee</th>
                        <th scope="col">Employee Name</th>
                        <th scope="col">Position</th>
                        <th scope="col">Education Degree</th>
                        <th scope="col">Employee Birthday</th>
                        <th scope="col">Employee Id Card</th>
                        <th scope="col">Employee Phone</th>
                        <th scope="col">Employee Email</th>
                        <th scope="col">Employee Salary</th>
                        <th scope="col">Delete</th>
                        <th scope="col">Edit</th>
                    </tr>
                    </thead>
                    <c:forEach var="employee" items="${employeesList}">
                        <tr>
                            <td> ${employee.employeeCode} </td>
                            <td> ${employee.name}</td>
                            <td> ${employee.position}</td>
                            <td> ${employee.academicLevel}</td>
                            <td> ${employee.dateOfBirth}</td>
                            <td> ${employee.identityCardNumber}</td>
                            <td> ${employee.telephoneNumber}</td>
                            <td> ${employee.email}</td>
                            <td> ${employee.salary}</td>
                            <td>
                                <button type="button" class="btn btn-danger" href="/employee?action=delete" onclick="setValueForm('${product.idProduct}')"
                                        data-toggle="modal" data-target="#modalDelete">
                                    delete
                                </button>
                            </td>
                            <td>
                                <button type="button" class="btn btn-danger" data-toggle="modal" data-target="#modalDelete">
                                    Edit
                                </button>
                            </td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</div>
<div class="container-fluid">
    <div class="row border">
        <div class="col-lg-12 ">
            <h5 class="text-center">Furama Resort </h5>
        </div>
    </div>
    <script src="/assert/jquery/jquery-3.5.1.min.js"></script>
    <script src="/assert/bootstrap413/js/popper.min.js"></script>
    <script src="/assert/datatables/js/jquery.dataTables.min.js"></script>
    <script src="/assert/datatables/js/dataTables.bootstrap4.min.js"></script>
    <script src="/assert/bootstrap413/js/bootstrap.min.js"></script>
    <script src="/assert/bootstrap413/js/bootstrap.bundle.js"></script>
    <script>
        $(document).ready(function () {
            $('#employee').dataTable({
                "dom": 'lrtip',
                "lengthChange": false,
                "pageLength": 3
            })
        })
    </script>
</html>
