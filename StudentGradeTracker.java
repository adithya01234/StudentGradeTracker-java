import java.util.*;
class StudentGradeTracker
{
    String name;
    int marks;

    StudentGradeTracker(String name,int marks)
    {
        this.name=name;
        this.marks=marks;
    }

    
}
class student{

public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
        ArrayList<StudentGradeTracker>students=new ArrayList<>();
        System.out.println("Enter Number of students :");
        int noStudents=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<noStudents;i++)
        {
            System.out.println("Enter Student Name"+(i+1));
            String name=sc.nextLine();
            System.out.println("Enter Marks of Student"+(i+1));
            int marks=sc.nextInt();
            sc.nextLine();
            students.add(new StudentGradeTracker(name,marks));
        }
        //calculations
        int total=0;
        int lowest=Integer.MAX_VALUE;
        int highest=Integer.MIN_VALUE;
        for(StudentGradeTracker x:students)
        {
            total+=x.marks;
        if(x.marks>highest)
        {
            highest=x.marks;
        }
        if(x.marks<lowest)
        {
            lowest=x.marks;
        }
       


        }
         double average=(double)total/students.size();

        //display

        System.out.println("----------Student report---------");
        for(StudentGradeTracker x:students)
        {
           System.out.println("Name: " + x.name + " | Marks: " + x.marks);
        }
        System.out.println("\nAverage Marks: " + average);
        System.out.println("Highest Marks: " + highest);
        System.out.println("Lowest Marks: " + lowest);

        sc.close();

    }
}