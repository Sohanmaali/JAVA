/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mvcproject.controlar;

import com.mvcproject.model.EmpRegiDao;
import com.mvcproject.model.EmpRegiDto;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Sohan_Maali
 */
public class EmployeeLogin extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            EmpRegiDao regidao = new EmpRegiDao();
            EmpRegiDto regidto = new EmpRegiDto();
            regidao.setEmail(request.getParameter("gmail"));
            regidao.setPassword(request.getParameter("password"));
            if (regidto.login(regidao)) {
                HttpSession session = request.getSession();
                session.setAttribute("id", regidao.getId());
                session.setAttribute("name", regidao.getName());
                session.setAttribute("father", regidao.getFather());
                session.setAttribute("email", regidao.getEmail());
                session.setAttribute("mobile", regidao.getMobile());
                session.setAttribute("password", regidao.getPassword());
                System.out.println(regidao.getName()+"----------------");
                response.sendRedirect("Admin.jsp");
            } else {
                response.sendRedirect("EmployeeLogin.jsp");
            }
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
