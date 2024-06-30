package lk.ijse.gdse68.aad68.introaadlesson;

import java.io.*;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

//allready define the webxml file mapping using annotation
@WebServlet(urlPatterns ="/demo",loadOnStartup = 2)
public class Demo extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("init method is coll");
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println(Thread.currentThread().getName());
        System.out.println("Hello Demo doGet() Method");

    }

    @Override
    public void destroy() {
        System.out.println("destroy method is coll");
    }
}