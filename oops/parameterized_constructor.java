class Bache{
    String name;
    int age;

    public void show(){

        System.out.println(this.name);
        System.out.println(this.age);
    }
    Bache(String name,int age){
        this.name=name;
        this.age=age;


    }
}




public class parameterized_constructor {
    public static void main(String args[]){
        Bache s1=new Bache("priyashu pandey ",23);
        s1.show();

    }
}
