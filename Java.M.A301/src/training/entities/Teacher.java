/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training.entities;

/**
 *
 * @author ASUS
 */
public class Teacher extends Person{
    private double basic_salary;
    private double subsidy;

    public double getBasic_salary() {
        return basic_salary;
    }

    public void setBasic_salary(double basic_salary) {
        this.basic_salary = basic_salary;
    }

    public double getSubsidy() {
        return subsidy;
    }

    public void setSubsidy(double subsidy) {
        this.subsidy = subsidy;
    }

    public Teacher() {
    }

    public Teacher(String name, String gender, String phone_number, String email,double basic_salary, double subsidy) {
        super(name, gender, phone_number, email);
        this.basic_salary = basic_salary;
        this.subsidy = subsidy;
    }
    
    
    
    @Override
    public void purchaseParkingPass() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public double calculateSalary(){
        return this.basic_salary+this.subsidy;
    }

    @Override
    public String toString() {
        return "Teacher{"+", name:"+super.getName()+", gender:"+super.getGender()+", phone"+super.getPhone_number()+
                ", email: "+super.getEmail()+", salary"+this.calculateSalary() + '}';
    }
    
}
