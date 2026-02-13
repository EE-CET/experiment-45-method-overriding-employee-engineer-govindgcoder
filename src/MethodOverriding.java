class Employee {
   public void display(){
       System.out.print("Name of class is Employee");
   }
}

class Engineer extends Employee {
    // Override display() method
    // 1. Print "Name of class is Engineer"
    // 2. Call super.display() to print the parent's message
    @Override
    public void display(){
        System.out.println("Name of class is Engineer");
        super.display();
    }
}

public class MethodOverriding {
   
        // Create an Engineer object
        // Call the display() method
    public static void main(String[] args){
        Engineer eng = new Engineer();
        eng.display();
    }
}
