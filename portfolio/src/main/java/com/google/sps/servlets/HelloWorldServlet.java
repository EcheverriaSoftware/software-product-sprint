package com.google.sps.servlets;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

/** Handles requests sent to the /hello URL. Try running a server and navigating to /hello! */
@WebServlet("/hello")
public class HelloWorldServlet extends HttpServlet {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private String [] movieQuotes = {"Get to the choppa! - Arnold Schwarzenegger ", "Hasta la vista baby. - Arnold Schwarzenegger ","I'll be back. - Arnold Schwarzenegger", "You've been terminated. - Arnold Schwarzenegger"
,"Dead or alive, you're coming with me. - Peter Weller ", "Get away from her you bitch! - Sigourney Weaver", "That's it, man! Game over, man! Game over! - Bill Paxton "};

    @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
      
    String json = convertToJsonUsingGson(movieQuotes);
    response.setContentType("application/json;");
    response.getWriter().println(json);
  }
  private String convertToJsonUsingGson(String [] quotes) {
    Gson gson = new Gson();
    String json = gson.toJson(quotes);
    return json;
  }
}
