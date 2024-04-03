
// Parent class
class Parent {
    int Var1;

    // Constructor for Parent class
    Parent(int parentVar) {
        this.Var1 = parentVar;
    }
}

// Child class inheriting from Parent class
class Child extends Parent {
    int Var2;

    // Constructor for Child class
    Child(int parentVar, int childVar) {
        super(parentVar); // Calling Parent class constructor using super keyword
        this.Var2 = childVar;
    }
}

// Class to print values of variables
class PrintValues {
    void printValues(Parent objParent, Child objChild) {
        System.out.println("Parent Variable: " + objParent.Var1);
        System.out.println("Child Variable: " + objChild.Var2);
    }
}

public class Super {
    public static void main(String[] args) {
        // Creating instances of Parent and Child classes
        Parent parentObj = new Parent(10);
        Child childObj = new Child(20, 30);

        // Creating instance of PrintValues class
        PrintValues printObj = new PrintValues();

        // Calling printValues method to print the values
        printObj.printValues(parentObj, childObj);
    }
}
