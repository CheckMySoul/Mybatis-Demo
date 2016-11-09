package com.mm.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mm.service.QueryService;

/**
 * Servlet implementation class ListServlet
 */
@WebServlet("/List")
public class ListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ListServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//设置编码
		request.setCharacterEncoding("UTF-8");
		//接受页面的值
		String command = request.getParameter("command");
		String description = request.getParameter("description");
		//向页面传值
		request.setAttribute("command", command);
		request.setAttribute("description", description);
		QueryService listService = new QueryService();
		//查询消息列表并传给页面
		request.setAttribute("messageList", listService.queryMessageList(command, description));
		//向页面跳转
		request.getRequestDispatcher("/WEB-INF/jsp/back/list.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
