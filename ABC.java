import java.util.Scanner;
class Company extends Employee
{

String  designation;
double salary;

//constructor
Company()
{
super();//this will call the constructor of parent class
designation="HR";
salary=1009100.2046;
}

void input()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the designation ");
designation=sc.next();
System.out.println("Enter Salary ");
salary=sc.nextDouble();
}

void output()
{
System.out.println("Designtion  :-" + designation);
System.out.println("Salary  :-" + salary);
}
}




class  ABC
{
public static void main(String a[])
{

Company f1=new Company();

f1.output();

Company Comp[]=new Company[5];
for( int i=0;i<5;i++)
{
Comp[i]=new Company();
Comp[i].input();
}

System.out.println("Information of ALL Companies");

for( int i=0;i<5;i++)
{
Comp[i].output();
}
}

}  