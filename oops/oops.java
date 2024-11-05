class Pen{
    String color;
    String type; // ball pen or gel pen 

    public void write(){
        System.out.println("writing Something  ");
    }

    public void showProperties(){
        System.out.println(this.color);


    }
    
}


class Student {
    String name;
    // int rollno;
    int age ;
    

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);

    }
    Student(){
        System.out.println("this is a constructor of student class");
    }


}

// main class where all the object of the above class will be used 

public class oops {
    public static void main(String args[])

    {
    
        // Pen PenObj1=new Pen();
        // PenObj1.color="blue";
        // PenObj1.type="gel";
        // // System.out.print("this obj is called by object 1 of the pen class :" , PenObj1.showProperties());
        // PenObj1.showProperties();


        // PenObj1.write();

        // Pen penobj2=new Pen();
        // penobj2.color="black";
        // penobj2.showProperties();

        Student s1=new Student();
        s1.name="Priyanshu pandey ";
        s1.age=23;
        s1.printInfo();




    }
}
