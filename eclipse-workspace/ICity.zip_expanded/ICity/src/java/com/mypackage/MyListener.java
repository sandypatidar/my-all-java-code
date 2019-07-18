/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mypackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Web application lifecycle listener.
 *
 * @author purvanshi
 */
public class MyListener implements ServletContextListener {
        Connection con;
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","");
            /*sce.getServletContext().setAttribute("datacon", con);*/
           	 PreparedStatement ps = con.prepareStatement("CREATE TABLE  city_user(name VARCHAR2(40),email VARCHAR2(40),username VARCHAR2(40),password(40),PRIMARY KEY(username)");
		ps.executeUpdate(); 
                PreparedStatement ps1=con.prepareStatement("select * from city_user where username=? and password=?");
                ps1.executeQuery();
 }catch(Exception e){}
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        try{
        con.close();    
        }catch(Exception e){}
    }
}
