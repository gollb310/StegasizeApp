package com.sample;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.IOException;
import java.io.InputStream;

@WebServlet(
        name = "stegatizeServlet",
        urlPatterns = "/Stegatize"
)
@MultipartConfig

public class StegasizeServlet extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Part imgPart = req.getPart("picture"); // Retrieves <input type="file" name="picture">
        InputStream imgFile = imgPart.getInputStream();
        Part txtPart = req.getPart("text"); // Retrieves <input type="file" name="text">
        InputStream txtFile = txtPart.getInputStream();


        Stegasize stega = new Stegasize();

        //String out = Stegasize.run(imgFile, txtFile);

        imgFile.close();
        txtFile.close();

        String out = "TestString";

        req.setAttribute("thing", out);
        RequestDispatcher view = req.getRequestDispatcher("result.jsp");
        view.forward(req, resp);

    }
}
