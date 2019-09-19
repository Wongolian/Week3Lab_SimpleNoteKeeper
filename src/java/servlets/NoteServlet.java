/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Note;

/**
 *
 * @author Steven
 */
public class NoteServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        BufferedReader br = new BufferedReader(new FileReader(new File(path)));

        String title = br.readLine();
        String content = br.readLine();

        Note note = new Note();
        note.setTitle(title);
        note.setContents(content);
        request.setAttribute("note", note);

        if (request.getParameter("edit") == null) {
            getServletContext().getRequestDispatcher("/WEB-INF/viewNote.jsp").forward(request, response);
        } else {
            getServletContext().getRequestDispatcher("/WEB-INF/editNote.jsp").forward(request, response);
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path, false)));

        String title = request.getParameter("title");
        String content = request.getParameter("content");

        pw.println(title);
        pw.println(content);
        pw.close();

        Note note = new Note();
        note.setTitle(title);
        note.setContents(content);
        request.setAttribute("note", note);

        getServletContext().getRequestDispatcher("/WEB-INF/viewNote.jsp").forward(request, response);

    }

}
