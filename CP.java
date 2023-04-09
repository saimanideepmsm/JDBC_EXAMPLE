package org.example.studentoperations;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

public class CP
{
    static Connection con;
    public static Connection createC()
    {
        //load the driver
        try
        {
            Class.forName("com.mysql.jdbc.driver");
            //connection
            String user = "root";
            String password = "";
            String url = "jdbc:mysql://localhost:3306/student";
            con = DriverManager.getConnection(url,user,password);
        }
        catch (Exception e)
        {
            System.out.println(e.getStackTrace());
        }
        return con;
    }
}
