package com.mycompany.webcalculator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.*;
import static java.lang.System.out;
import javax.servlet.*;
import javax.servlet.http.*;
import java.math.*;
import java.util.*;
import javax.servlet.annotation.WebServlet;

/**
 *
 * @author john.arcy.r.teodoro
 */
@WebServlet(name = "CalculatorServlet", urlPatterns = {"/CalculatorServlet"})
public class CalculatorServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CalculatorServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CalculatorServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //HttpSession session = request.getSession(true);
        if(request.getParameter("op")!=null){
            //int result;
            //PrintWriter out = response.getWriter(); 
            String num1 = request.getParameter("num1");
            String num2 = request.getParameter("num2");
            //String formres = request.getParameter("result");
            String res=null;
            
            String op = request.getParameter("op");
            if(op.equals("Add"))
                res = Addition(num1,num2);
            else if(op.equals("Subtract"))
                res = Subtraction(num1,num2);
            else if(op.equals("Multiply"))
                res = Multiplication(num1,num2);
            else if(op.equals("Divide"))
                res = Division(num1,num2);
            
            //out.println(res);
            RequestDispatcher rd;  
            request.setAttribute("result",res);
            rd = getServletContext().getRequestDispatcher("/index.htm");
            
            rd.forward(request, response);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request,response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    public String Addition(String num1, String num2)
    {
        String sum;
        sum = Double.toString(Double.parseDouble(num1) + Double.parseDouble(num2));
        return sum;
    }
    
    public String Subtraction(String num1, String num2)
    {
        String diff;
        diff = Double.toString(Double.parseDouble(num1) - Double.parseDouble(num2));
        return diff;
    }
    
    public String Multiplication(String num1, String num2)
    {
        String prod;
        prod = Double.toString(Double.parseDouble(num1) * Double.parseDouble(num2));
        return prod;
    }
    
    public String Division(String num1, String num2)
    {
        String quo;
        quo = Double.toString(Double.parseDouble(num1) / Double.parseDouble(num2));
        return quo;
    }
}
