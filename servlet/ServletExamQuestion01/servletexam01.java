package servlet.ServletExamQuestion01;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class servletexam01 extends HttpServlet {

  public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      response.setContentType("text/html");
      PrintWriter out = response.getWriter();
      
        String input = request.getParameter("input");

        char[] string = input.toCharArray();
        int left = 0;
        int right = string.length - 1;

        boolean isPalindrome = true;

        while (left < right) {
            if (string[left] != string[right]) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        if (isPalindrome) {
            out.println("<h2>Palindrome</h2>");
        } else {
            out.println("<h2>Not a palindrome</h2>");
        }
        out.print("Thank You");
        out.close();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
  }
}
