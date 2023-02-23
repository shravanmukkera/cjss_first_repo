package Models;

import java.util.List;

public class Student
{
    private String studentName;
    private int rNo;
    private String branch;
    private String year;
   List<FeeDetails> feeDetailsList;
   List<Subject> subjectList;

    public Student(String studentName, int rNo, String branch, String year, List<FeeDetails> feeDetailsList, List<Subject> subjectList) {
        this.studentName = studentName;
        this.rNo = rNo;
        this.branch = branch;
        this.year = year;
        this.feeDetailsList = feeDetailsList;
        this.subjectList = subjectList;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getrNo() {
        return rNo;
    }

    public void setrNo(int rNo) {
        this.rNo = rNo;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public List<FeeDetails> getFeeDetailsList() {
        return feeDetailsList;
    }

    public void setFeeDetailsList(List<FeeDetails> feeDetailsList) {
        this.feeDetailsList = feeDetailsList;
    }

    public List<Subject> getSubjectList() {
        return subjectList;
    }

    public void setSubjectList(List<Subject> subjectList) {
        this.subjectList = subjectList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", rNo=" + rNo +
                ", branch='" + branch + '\'' +
                ", year='" + year + '\'' +
                ", feeDetailsList=" + feeDetailsList +
                ", subjectList=" + subjectList +
                '}';
    }
}
