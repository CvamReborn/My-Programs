import java.util.*;
interface Human{
    public void walk();
}
interface Person{
    public void talk();
}
class Student implements Person,Human{
    public void talk(){
        System.out.println("Student talk");
    }
    public void walk(){
        System.out.println("Student walk");
    }
}

public class Main {
    public static void main(String[] args) {
        Object student = new Student();
        if(student instanceof Person){
            ((Person)student).talk();
        }
        else{
            ((Human)student).walk();
        }
    }
}