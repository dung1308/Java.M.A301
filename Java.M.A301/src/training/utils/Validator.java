/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training.utils;

import training.entities.Teacher;

/**
 *
 * @author ASUS
 */
public class Validator {
    public boolean checkMoreSalary(double salary){
        if(salary>1000){
            return true;
        }
        return false;
    }
    public boolean passMark(double mark){
        if(mark>=6){
            return true;
        }
        return false;
    }
}
