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
public abstract class Person {
    private String name;
    private String gender;
    private String phone_number;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Person(){
        
    }
    public Person(String name, String gender, String phone_number, String email) {
        this.name = name;
        this.gender = gender;
        this.phone_number = phone_number;
        this.email = email;
    }
    
    public abstract void purchaseParkingPass();
}
