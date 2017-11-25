/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school;

/**
 *
 * @author briansanchez
 */
public class Teacher extends Person{
    private String type;
    
    Teacher(String _firstName, String _lastName, String _gender, String _type, int _age, int _id){
        super(_firstName,_lastName,_gender,_age);
        type = _type;
        
    }
} 
