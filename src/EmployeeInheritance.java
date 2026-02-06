import java.util.Scanner;

class Employee {
    String name;
    int age;
    String phone;
    String address;
    double salary;
}

class Officer extends Employee {
    String specialization;
}

class Manager extends Employee {
    String department;
}

public class EmployeeInheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Officer of = new Officer();

        of.name = sc.nextLine();
        of.age = sc.nextInt();
        sc.nextLine();
        of.phone = sc.nextLine();
        of.address = sc.nextLine();
        of.salary = sc.nextDouble();
        sc.nextLine();
        of.specialization = sc.nextLine();

        Manager ma = new Manager();

        ma.name = sc.nextLine();
        ma.age = sc.nextInt();
        sc.nextLine(); 

        ma.phone = sc.nextLine();
        ma.address = sc.nextLine();
        ma.salary = sc.nextDouble();
        sc.nextLine(); 

        ma.department = sc.nextLine();

        System.out.println("Officer:");
        System.out.println(of.name);
        System.out.println(of.age);
        System.out.println(of.phone);
        System.out.println(of.address);
        System.out.println(of.salary);
        System.out.println(of.specialization);

        System.out.println("Manager:");
        System.out.println(ma.name);
        System.out.println(ma.age);
        System.out.println(ma.phone);
        System.out.println(ma.address);
        System.out.println(ma.salary);
        System.out.println(ma.department);

        sc.close();
    }
}
