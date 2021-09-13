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
public class Student extends Person{
    
    private String id;
    private double theory;
    private double practice;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getTheory() {
        return theory;
    }

    public void setTheory(double theory) {
        this.theory = theory;
    }

    public double getPractice() {
        return practice;
    }

    public void setPractice(double practice) {
        this.practice = practice;
    }

    public Student() {
    }

    public Student(String name, String gender, String phone_number, String email, String id, double theory, double practice) {
        super(name, gender, phone_number, email);
        this.id = id;
        this.theory = theory;
        this.practice = practice;
    }
    
    
    @Override
    public void purchaseParkingPass() {
    }
    
    public double calculateFinalMark(){
        return (this.theory + this.practice)/2;
    }

    @Override
    public String toString() {
        return "Student: id:"+this.id+", name:"+super.getName()+", gender:"+super.getGender()+", phone"+super.getPhone_number()+
                ", email: "+super.getEmail()+", theory"+this.theory+", practice:"+this.practice+", Final mark:"+this.calculateFinalMark();
    }
    
}
