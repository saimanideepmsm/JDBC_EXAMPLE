package org.example.studentoperations;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class studentdb
{
    public static boolean insert(Student st)
    {
        boolean f = false;
        try
        {
            Connection con = CP.createC();
            String q = "insert into student(sname,sphone,scity), values(?,?,?)";
            //pre statement
            PreparedStatement  p = con.prepareStatement(q);
            // adding vales dynamically
            p.setString(1, st.getStudentname());
            p.setString(2, st.getStudentphone());
            p.setString(3, st.getScity());
            //execute
            p.executeUpdate();
            f=true;
        }
        catch (Exception e)
        {
            System.out.println(e.getStackTrace());
        }
        return f;
    }

    public static boolean delete(int userid)
    {
        boolean f = false;
        try
        {
            Connection con = CP.createC();
            String q = "delete from student where sid=?";
            //pre statement
            PreparedStatement  p = con.prepareStatement(q);
            // adding vales dynamically
            p.setString(1, String.valueOf(userid));
            p.executeUpdate();
            f=true;
        }
        catch (Exception e)
        {
            System.out.println(e.getStackTrace());
        }
        return f;
    }

    public static void display()
    {
        try
        {
            Connection con = CP.createC();
            String q = "select * from student";
            Statement s = con.createStatement();
            ResultSet st = s.executeQuery(q);
            while(st.next())
            {
                System.out.println(st.getInt(1)+" "+st.getString(2)+" "+st.getString(3)+" "+st.getString(4));
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getStackTrace());
        }
    }
}
