
package school;


public class Student extends Person{
    private static int numStudents = 0;
    
    
    
    Student(String _firstName, String _lastName, String _Gender, int _age){
        super(_firstName,_lastName,_Gender,_age);
        numStudents++;
        super.setID(numStudents);
    }
    
    
    
    
}
