package Models;

import java.util.List;

public class Subject
{
    private String subjectName;
    private String subjectCode;
    List<SubjectMarks> subjectMarksList;

    public Subject(String subjectName, String subjectCode, List<SubjectMarks> subjectMarksList) {
        this.subjectName = subjectName;
        this.subjectCode = subjectCode;
        this.subjectMarksList = subjectMarksList;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    public List<SubjectMarks> getSubjectMarksList() {
        return subjectMarksList;
    }

    public void setSubjectMarksList(List<SubjectMarks> subjectMarksList) {
        this.subjectMarksList = subjectMarksList;
    }
}
