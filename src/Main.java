
public class Main {
    public static void main(String[] args) {

   Student justin = new Student("Justin", 28, 2);
   Teacher alex = new Teacher("Alex", 35, "Astronomy");
   Principal brian = new Principal("Brian", 38, 5);

   justin.callPersonToDuty(justin);
   alex.callPersonToDuty(alex);
   brian.callPersonToDuty(brian);


    }


}