package com.controlar;

import com.mvcproject.dao.RegistrationDao;
import com.mvcproject.dto.RegistrationDto;
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
            regidao.setName(request.getParameter("name"));
            regidao.setFather(request.getParameter("father"));
            regidao.setEmail(request.getParameter("gmail"));
            regidao.setMobile(request.getParameter("mobile"));
            regidao.setPassword(request.getParameter("password"));

            System.out.println("---------2-------------------");
            if (regidto.login(regidao)) {
                response.sendRedirect("DashBoard.jsp");
            } else {
                response.sendRedirect("Login.jsp");
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
