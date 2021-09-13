/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training.main;

import java.util.ArrayList;
import java.util.Scanner;
import training.entities.Person;
import training.entities.Student;
import training.entities.Teacher;
import training.utils.Validator;

/**
 *
 * @author ASUS
 */
public class PersonManage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Person> listPer = new ArrayList();
        //ArrayList<Student> listStu = new ArrayList();
        //ArrayList<Teacher> listTeach = new ArrayList();
        Validator valid = new Validator();
        int choice;
        do{
            System.out.println("1.Add Student");
            System.out.println("2.Add teacher");
            System.out.println("3.Update Student");
            System.out.println("4.Display teacher has salary > 1000");
            System.out.println("5.Display students has passing mark");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Id:");
                    String id = sc.next();
                    System.out.println("Name:");
                    String name = sc.next();
                    System.out.println("Gender:");
                    String gender = sc.next();
                    System.out.println("Phone");
                    String phone = sc.next();
                    System.out.println("Email");
                    String email = sc.next();
                    System.out.println("Theory:");
                    double theory = sc.nextDouble();
                    System.out.println("Practice:");
                    double practice = sc.nextDouble();
                    
                    Person stu = new Student(name, gender, phone, email, id, theory, practice);
                    listPer.add(stu);
                    break;
                case 2:
                    System.out.println("Name:");
                    String name1 = sc.next();
                    System.out.println("Gender:");
                    String gender1 = sc.next();
                    System.out.println("Phone");
                    String phone1 = sc.next();
                    System.out.println("Email");
                    String email1 = sc.next();
                    System.out.println("Basic salary:");
                    double basic_salary = sc.nextDouble();
                    System.out.println("Subsidy:");
                    double subsidy = sc.nextDouble();
                    Person teach = new Teacher(name1, gender1, phone1, email1,basic_salary, subsidy);
                    listPer.add(teach);
                    break;
                case 3:
                    System.out.println("Enter id to search:");
                    String searchId = sc.next();
                    for(Person x:listPer){
                        if(x instanceof Student){
                            if(((Student) x).getId().equalsIgnoreCase(searchId) == true){
                                System.out.println("Name:");
                                String name2 = sc.next();
                                x.setName(name2);
                                System.out.println("Gender:");
                                String gender2 = sc.next();
                                x.setGender(gender2);
                                System.out.println("Phone");
                                String phone2 = sc.next();
                                x.setPhone_number(phone2);
                                System.out.println("Email");
                                String email2 = sc.next();
                                x.setEmail(email2);
                                System.out.println("Theory:");
                                double theory2 = sc.nextDouble();
                                ((Student) x).setTheory(theory2);
                                System.out.println("Practice:");
                                double practice2 = sc.nextDouble();
                                ((Student) x).setPractice(practice2);
                                System.out.println(x);
                            }
                        }
                    }
                    break;
                case 4:
                    for(Person y: listPer){
                        if(y instanceof Teacher){
                            if(valid.checkMoreSalary(((Teacher) y).calculateSalary()) == true){
                                System.out.println(y);
                            }
                        }
                    }
                    break;
                case 5:
                    for(Person z: listPer){
                        if(z instanceof Student){
                            if(valid.passMark(((Student) z).calculateFinalMark()) == true){
                                System.out.println(z);
                            }
                        }
                    }
                    break;
                default:
                    System.out.println("Exit!");
                    break;
            }
        }while(choice<=5);

    }
}
