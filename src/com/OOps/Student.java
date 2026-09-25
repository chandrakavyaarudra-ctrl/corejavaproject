package com.OOps;

public class Student {

    int sid;
    String sname;
    private double marks;
	public Object address;

    public Student() {
    }

    public void setsid(int sid) {
        this.sid = sid;
    }

    public int getsid() {
        return sid;
    }

    public void setsname(String sname) {
        this.sname = sname;
    }

    public String getsname() {
        return sname;
    }

    public void setmarks(double marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        }
    }

    public double getmarks() {
        return marks;
    }
}