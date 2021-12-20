package BusinessLogic;

import java.util.ArrayList;
import java.util.Scanner;

public class Classroom
{
    String code;
    String instructor;
    String coursename;
    String coursecode;
    ArrayList<Student> enrolledstudents = new ArrayList<>();
    ArrayList<Posts> posts = new ArrayList<>();

    public Classroom(String code,String instructormail,String cn,String cc)
    {
        this.code = code;
        this.instructor = instructormail;
        this.coursename = cn;
        this.coursecode = cc;
    }
    public void makeannoucement(String teachername,String material)
    {
        Posts ann = new Announcement();
        ann.UploadContent(teachername,material);
        posts.add(ann);
    }
    public void uploadsomething(String teacher,String path,String fname,String filetype)
    {
        Posts ann = new UploadMaterial();
        String material = path +","+fname+","+filetype;
        ann.UploadContent(teacher,material);
        posts.add(ann);
    }
    public void Displayannoucements()
    {
        for (int i=0;i< posts.size();i++)
        {
            if(posts.get(i) instanceof Announcement)
            {
                posts.get(i).Display();
            }
        }
    }
    public void Displayupload()
    {
        for (int i=0;i< posts.size();i++)
        {
            if(posts.get(i) instanceof UploadMaterial)
            {
                posts.get(i).Display();
            }
        }
    }
    public void Takeattendance()
    {
        Scanner input = new Scanner(System.in);
        for (int i=0;i<enrolledstudents.size();i++)
        {
            System.out.print("Enter attendance for "+enrolledstudents.get(i).name+" (A,P): ");
            String attendance = input.nextLine();
            if(attendance.equalsIgnoreCase("A"))
            enrolledstudents.get(i).reduceattendance();
        }
    }
    public void ShowAttendance(String email)
    {
        for (int i=0;i<enrolledstudents.size();i++)
        {
            if(enrolledstudents.get(i).email.equalsIgnoreCase(email)) {
                System.out.println("Attendance: " + enrolledstudents.get(i).attendance);
            }
        }
    }
    public void Display()
    {
        System.out.println("\n\nClassroom Code: "+code);
        System.out.println("Instructor Email: "+instructor);
        System.out.println("Course name: "+coursename);
        System.out.println("Course code: "+coursecode);
        System.out.println("Enrolled Students: ");
        for (int i=0;i<enrolledstudents.size();i++)
        {
            enrolledstudents.get(i).Display();
        }
    }
    public Student Searchenroll(String email)
    {
        for (int i =0;i<enrolledstudents.size();i++)
        {
            if(enrolledstudents.get(i).email.equalsIgnoreCase(email))
                return enrolledstudents.get(i);
        }
        return null;
    }
    public void RemoveStudent(String email)
    {
        if(Searchenroll(email) == null)
            System.out.println("Not present");
        else
            enrolledstudents.remove(Searchenroll(email));
    }
    public void Addstudent(Student obj)
    {
        if(Searchenroll(obj.email) == null)
        enrolledstudents.add(obj);
        else
            System.out.println("Already enrolled");
    }
}
