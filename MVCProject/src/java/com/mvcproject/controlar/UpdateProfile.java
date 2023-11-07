package com.mvcproject.controlar;

import com.mvcproject.model.RegistrationDao;
import com.mvcproject.model.RegistrationDto;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class UpdateProfile extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            RegistrationDao regidao = new RegistrationDao();
            RegistrationDto regidto = new RegistrationDto();
            regidao.setName(request.getParameter("Myname"));
            regidao.setFather(request.getParameter("father"));
            regidao.setEmail(request.getParameter("email"));
            regidao.setMobile(request.getParameter("mobile"));
            regidao.setPassword(request.getParameter("password"));
            System.out.println("---1------");
            if (regidto.updateProfile(regidao)) {
                System.out.println("---2------");
                HttpSession session = request.getSession();
                session.setAttribute("id", regidao.getId());
                session.setAttribute("name", regidao.getName());
                session.setAttribute("father", regidao.getFather());
                session.setAttribute("email", regidao.getEmail());
                session.setAttribute("mobile", regidao.getMobile());
                session.setAttribute("password", regidao.getPassword());
                response.sendRedirect("DashBoard.jsp");
            } else {
                response.sendRedirect("DashBoard.jsp");
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
    }

}
