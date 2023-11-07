package com.mvcproject.controlar;

import com.mvcproject.model.RegistrationDao;
import com.mvcproject.model.RegistrationDto;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Sohan_Maali
 */
public class RegistrationControlar extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            RegistrationDao regidao = new RegistrationDao();
            RegistrationDto regidto = new RegistrationDto();
            regidao.setName(request.getParameter("uname"));
            regidao.setFather(request.getParameter("fname"));
            regidao.setEmail(request.getParameter("gmail"));
            regidao.setMobile(request.getParameter("mobile"));
            regidao.setPassword(request.getParameter("password"));
            if (regidto.registration(regidao)) {
                response.sendRedirect("Login.jsp");
            } else {
                response.sendRedirect("Registration.jsp");
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
