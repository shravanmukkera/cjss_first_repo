import Models.FeeDetails;
import Models.Student;
import Models.Subject;
import Models.SubjectMarks;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args)
    {
        // student 1 details

        List<FeeDetails> feeDetailsList1=new ArrayList<>();
        FeeDetails studentFeeDetails1=new FeeDetails(10000,"22/02/2022");
        feeDetailsList1.add(studentFeeDetails1);

        List<SubjectMarks> subjectMarksList1=new ArrayList<>();
        SubjectMarks securedMarks1=new SubjectMarks(99);
        subjectMarksList1.add(securedMarks1);

        List<Subject> subjectList1=new ArrayList<>();
        Subject subjectStudent1=new Subject("Java","100",subjectMarksList1);
        subjectList1.add(subjectStudent1);

        //................................................................................................
             //student 2 details

        List<FeeDetails> feeDetailsList2=new ArrayList<>();
        FeeDetails studentFeeDetails2=new FeeDetails(12000,"28/01/2021");
        feeDetailsList2.add(studentFeeDetails2);

        List<SubjectMarks> subjectMarksList2=new ArrayList<>();
        SubjectMarks securedMarks2=new SubjectMarks(98);
        subjectMarksList2.add(securedMarks2);

        List<Subject> subjectList2=new ArrayList<>();
        Subject subjectStudent2=new Subject("python","102",subjectMarksList2);
        subjectList2.add(subjectStudent2);

        //....................................................................................................
           //student 3 details

        List<FeeDetails> feeDetailsList3=new ArrayList<>();
        FeeDetails studentFeeDetails3=new FeeDetails(11000,"15/12/2020");
        feeDetailsList3.add(studentFeeDetails3);

        List<SubjectMarks> subjectMarksList3=new ArrayList<>();
        SubjectMarks securedMarks3=new SubjectMarks(97);
        subjectMarksList3.add(securedMarks3);

        List<Subject> subjectList3=new ArrayList<>();
        Subject subjectStudent3=new Subject("python","102",subjectMarksList2);
        subjectList3.add(subjectStudent3);

        Student student1=new Student("shravan ",1,"mechanical","1",feeDetailsList1,subjectList1);
        Student student2=new Student("keerthana",2,"mech","2",feeDetailsList2,subjectList2);
        Student student3=new Student("biswa",3,"mech","1",feeDetailsList3,subjectList3);

        List<Student> students=new ArrayList<>();
        //adding all details of all students to students rf
        students.add(student1);
        students.add(student2);
        students.add(student3);
        //...........................................................................................................

        //1Q :print rNo,studentName,branch of 1st year students
        System.out.println("                             print rNo,studentName,branch of 1st year students");
        StringBuffer s1=new StringBuffer();

        students.stream().filter(s->s.getYear().equalsIgnoreCase("1")).forEach(stu->{
            s1.append("rNo: "+stu.getrNo()+"\n").append("studentName: "+stu.getStudentName()+"\n").append("branch: "+stu.getBranch()+"\n"+"year: "+stu.getYear()+"\n--------\n");
        });
        System.out.println(s1);

        //.......................................................
        //2Q: print all students rNo,name,branch,fee,date

        System.out.println("                            print all students rNo,name,branch,fee,date");
        StringBuffer s2=new StringBuffer();
        students.stream().forEach(s->{
            s.getFeeDetailsList().forEach(stu->{
                s2.append("rNo: "+s.getrNo()+"\n").append("studentName: "+s.getStudentName()+"\n").append("branch: "+s.getBranch()+"\n").append("fee: "+stu.getFee()+"\n").append("date: "+stu.getDate()+"\n--------\n");
            });
        });
        System.out.println(s2);

        //.................................................................
        //3Q: print all students rNo,name,subjectName,marks

        System.out.println("                       print all students rNo,name,subjectName,marks");
        StringBuffer s3=new StringBuffer();
        students.stream().forEach(s->{
            s.getSubjectList().forEach(sb->{
                sb.getSubjectMarksList().forEach(sl->{
                    s3.append("rNo: "+s.getrNo()+"\n").append("studentName: "+s.getStudentName()+"\n").append("subjectName: "+sb.getSubjectName()+"\n").append("securedMarks: "+sl.getSecuredMarks()+"\n------\n");
                });
            });
        });
        System.out.println(s3);
        //......................................................................
        //4Q: print all students rNo,name,subjectName,marks order by year
        System.out.println("                         print all students rNo,name,subjectName,marks order by year");
        StringBuffer s4=new StringBuffer();

        students.stream().sorted(Comparator.comparing(Student::getYear)).forEach(s->{
            s.getSubjectList().forEach(sb->{
                sb.getSubjectMarksList().forEach(sl->{
                    s4.append("rNo: "+s.getrNo()+"\n").append("studentName: "+s.getStudentName()+"\n").append("subjectName: "+sb.getSubjectName()+"\n").append("securedMarks: "+sl.getSecuredMarks()+"\n")
                            .append("year: "+s.getYear()+"\n------\n");
                });
            });
        });
        System.out.println(s4);
    }
}