package com.shm.controller;


import com.shm.dao.DownloadDao;
import com.shm.vo.Download;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/*

 * function: 从数据库中获取所有下载信息
 */
@WebServlet("/GetDownloadList.do")
public class GetDownloadListController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private static DownloadDao downloadDao = new DownloadDao();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetDownloadListController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stu
		String path = "";
		List<Download> list = downloadDao.getDownload();
		request.setAttribute("downloadList", list);
		request.getSession().setAttribute("downloadList", list);
		path = "/main/download.jsp";
		request.getRequestDispatcher(path).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
