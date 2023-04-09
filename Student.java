package org.example.studentoperations;

public class Student
{
    private int Studentid;
    private String Studentname;
    private String Studentphone;
    private String Scity;

    public Student(int studentid, String studentname, String studentphone, String scity) {
        super();
        Studentid = studentid;
        Studentname = studentname;
        Studentphone = studentphone;
        Scity = scity;
    }

    public Student(String studentname, String studentphone, String scity) {
        super();
        Studentname = studentname;
        Studentphone = studentphone;
        Scity = scity;
    }

    public int getStudentid() {
        return Studentid;
    }

    public void setStudentid(int studentid) {
        Studentid = studentid;
    }

    public String getStudentname() {
        return Studentname;
    }

    public void setStudentname(String studentname) {
        Studentname = studentname;
    }

    public String getStudentphone() {
        return Studentphone;
    }

    public void setStudentphone(String studentphone) {
        Studentphone = studentphone;
    }

    public String getScity() {
        return Scity;
    }

    public void setScity(String scity) {
        Scity = scity;
    }

    public void display()
    {
        System.out.println(Studentid+" "+Studentname+" "+Studentphone+" "+Scity);
    }

    @Override
    public String toString() {
        return "Student{" +
                "Studentid=" + Studentid +
                ", Studentname='" + Studentname + '\'' +
                ", Studentphone='" + Studentphone + '\'' +
                ", Scity='" + Scity + '\'' +
                '}';
    }
}
