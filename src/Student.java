import java.util.Scanner;

public class Student {

    String FirstName;
    int age;
    boolean married;

    public static void main (String[] args) {
        //all the input data will be compared to this specific student
        Student s = new Student();
        s.setFirstName("Pablo");
        s.setAge(25);
        s.setMarried(false);

        Scanner scan = new Scanner(System.in);

        System.out.println("What is your first name?");
        String askName = scan.next();

        System.out.println("What is your age?");
        int askAge = scan.nextInt();

        System.out.println("Are you Married?");
        boolean askMarriageStatus = scan.nextBoolean();

        if (askMarriageStatus && askAge > s.getAge()) {
            System.out.println("You are Married.");
        } else if (!askMarriageStatus && askAge > s.getAge()) {
            System.out.println("Congrats "+ askName + "! You are oldest person which is not married!");
        }
    }
    public void setFirstName(String FirstName){
        this.FirstName = FirstName;
    }
    public String getFirstName(){
        return this.FirstName;
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public boolean getMarried(){
        return this.married;
    }
    public void setMarried(boolean married) {
        this.married = married;
    }

}
