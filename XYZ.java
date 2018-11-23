import java.util.Scanner;

class Employee
{
String name;
int age;

//Constructor
Employee()

{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the name ");
name=sc.next();
System.out.println("Enter age ");
age=sc.nextInt();
}
//function overloading
void input(String name, int age)// now the names of the parameters and data member names are same
{
//using this keyword
this.name=name;
this.age=age;
}

void output()
{
System.out.println("Name   :-" + name);
System.out.println("Age  :-" + age);
}
}


class  XYZ
{
public static void main(String a[])
{

Employee e1=new Employee();
e1.output();
e1.input("Seema",12);
e1.output();

}

}  

