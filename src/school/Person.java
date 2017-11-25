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
public class Person {
    private String firstName;
    private String lastName;
    private String Gender;
    private int age;
    private int id;
    
    Person(String _firstName, String _lastName, String _Gender, int _age){
        firstName = _firstName;
        lastName = _lastName;
        Gender = _Gender;
        age = _age;
    }
    
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getFullName(){
        return firstName + " " + lastName;
    }
    public void printFullName(){
        System.out.println(getFullName());
    }
    
    public void setID(int _id){
        id = _id;
    }
}
