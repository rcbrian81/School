
package school;


public class School {

    public static void main(String[] args) {
        
        Student alex = new Student("Alex","Sanchez","Male",11);
        Student cristal = new Student("Cristal", "Oriheula", "Female", 9);
        
        
        alex.printFullName();
        cristal.printFullName();
    }
    
}
