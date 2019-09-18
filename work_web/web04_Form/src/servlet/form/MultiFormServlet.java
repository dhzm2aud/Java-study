package servlet.form;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MFS")
public class MultiFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ServletContext cont;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//양방향 한글처리
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		//PrintWriter 객체 리턴받기
		PrintWriter out = response.getWriter();
		out.print("<h2>다음은 폼에 입력된 값들입니다...</h2><br>");
		
		//1. 폼값받아서... getParameter("폼이름"), getParameterValues("폼이름");
		String id = request.getParameter("userID");
		String pwd = request.getParameter("userPwd");
		String gender = request.getParameter("gender");
		String command = request.getParameter("command");
		String tel = request.getParameter("tel");
		String intro = request.getParameter("intro");
		
		cont = getServletContext();
		cont.setAttribute("id", id);
		cont.setAttribute("pwd", pwd);
		cont.setAttribute("gender", gender);
		cont.setAttribute("command", command);
		cont.setAttribute("tel", tel);
		cont.setAttribute("intro", intro);
		/*
		out.println("</li>ID : " + id + "</li><br>"); 
		out.println("</li>PASS : " + pwd + "</li><br>"); 
		out.println("</li>GENDER : " + gender + "</li><br>"); 
		out.println("</li>COMMAND : " + command + "</li><br>"); 
		out.println("</li>TEL : " + tel + "</li><br>"); 
		out.println("</li>INTRO : " + intro + "</li><br>");
		
		String[] hobbies = request.getParameterValues("hobby");
		if(hobbies != null)
		{
			for(String hobby : hobbies)
			{
				out.println("<br>" + hobby);
			}
		}
		out.close();
		*/
		out.print("<a href=form_result.jsp>jsp 결과 페이지 이동하기</a>");
		
		
	}

}
