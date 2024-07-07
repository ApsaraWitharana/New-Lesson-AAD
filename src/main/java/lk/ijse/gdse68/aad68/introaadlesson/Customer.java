package lk.ijse.gdse68.aad68.introaadlesson;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
//extenshion mapping ekk extenshion wenne exten ekk widiyt
@WebServlet(urlPatterns = "/customer") //mehem mapping ekk den eke agan extenshion ekk ekk denwanm ek=>
//url ek map krne kohomd kiyn ek mapping ekk kiynne//
public class Customer extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
//        Servlet => http req resp handeling krna class ekk
// inherite wel tiyenne http servlete bilding class ekk eken inherite wenwa ape class ekta

        System.out.println("Hello Customer doGet() is coll");
        System.out.println("Context Path:" + req.getContextPath());
        System.out.println("Servlet Path:" + req.getServletPath());
        System.out.println("Path info:" + req.getPathInfo());
        System.out.println("Query String:" + req.getQueryString());
        System.out.println("Protocol:" + req.getProtocol());
        System.out.println("Scheme:" +req.getScheme());
        System.out.println("URL:"+ req.getRequestURL());
        System.out.println("URI:" +req.getRequestURI());
        System.out.println("Path Translated:" + req.getPathTranslated());
        //url el emty string ekk wita=>working derecty eke me file ek tiyenne kohed kiyl adal application ek file segment eke kohed tiyenne kiyl
    }
}
//@WebServlet(urlPatterns = "/customer") 1.Exact mapping
//@WebServlet(urlPatterns = "*.text") 2.Extension mapping meke ona servlete path ekk denn be postman ge mekm denn one
//@WebServlet(urlPatterns = "") 3.Empty string mapping
//@WebServlet(urlPatterns = "/*") 4.while card mapping ekk witharayi( Path info:/hii) value ekk enne --java servers wl ** dann be
//@WebServlet(urlPatterns = "/**") ant mapping java server wl ba spring wl puluwan
//@WebServlet(urlPatterns = "/") 5.Default Mapping ->

// Query String=>url ekkin data ekk ywnn puluwn widiyk --search result ynne me widiyta chrom eke
// http://localhost:8080/myContext/customer?name=sachini ===>>   Query String:name=sachini