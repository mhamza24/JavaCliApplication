package org.sp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class dbconnection
{
    Connection con;
    Statement st;
    dbconnection()
    {
        try
        {
            
            Class.forName("com.mysql.jdbc.Driver");
                                                          //set password according to your localhost
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/summerProject","root","");
            st=con.createStatement();

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public static void main(String[] args)
    {
        dbconnection dbconnection=new dbconnection();
    }
}

