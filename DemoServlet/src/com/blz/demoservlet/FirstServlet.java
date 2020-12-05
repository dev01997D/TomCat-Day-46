package com.blz.demoservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FirstServlet implements Servlet {
	ServletConfig obj;

	//Life cycle events
	//Initialize Servlet
	public void init(ServletConfig obj) {
		System.out.println("----servlet started-------");
	}

	//Service
	public void service(ServletRequest req, ServletResponse res) throws IOException {
		System.out.println("------servlet service-------");
		res.setContentType("text/html");
		PrintWriter pobj = res.getWriter();
		pobj.print("<h2>Welcom here</h2>");
		LocalDate dateTime=LocalDate.now();
		pobj.print("<h4>Todays date:</h4>"+dateTime);
	}

	
	public void destroy() {
		System.out.println("------servlet destroy------");
	}

	//Non-Life Cycle events
	public ServletConfig getServletConfig() {
		return this.obj;
	}

	public String getServletInfo() {
		return "Servlet Created by: Devnandan";
	}
}
