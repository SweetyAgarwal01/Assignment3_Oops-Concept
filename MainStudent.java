import java.util.Scanner;
class Student
{
//private datatype initalizing
 private String name;
 private long phone;
 private int roll_no;
 private int class1;


//Constructor
Student()

{
Scanner st=new Scanner(System.in);
System.out.println("Enter the name of student");
name=st.next();
System.out.println("Enter phone number of student ");
phone=st.nextLong();
System.out.println("Enter Roll number of student ");
roll_no=st.nextInt();
System.out.println("Enter Class of student ");
class1=st.nextInt();
}
//functions-- setter
void input(String name, long phone, int roll_no, int class1) 
{
    this.name = name;
    this.phone = phone;
    this.roll_no = roll_no;
    this.class1 = class1;
}
// Function--getter
void output()
{
System.out.println("Name   :-" + name);
System.out.println("number  :-" + phone);
System.out.println("roll_no   :-" + roll_no);
System.out.println("class1   :-" + class1);
}

}

class MainStudent
{
public static void main(String a[])
{

Student s1=new Student();
s1.output();
}

}  
