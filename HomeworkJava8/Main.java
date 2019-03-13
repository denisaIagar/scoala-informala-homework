import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Please insert a month");
        Scanner keyboard = new Scanner(System.in);

        int month = keyboard.nextInt();
        if (Java8Assignament.checkMonth(month)) {
            Java8Assignament oc = new Java8Assignament("HomeworkJava8\\InputText\\Namelist.csv",
                    "HomeworkJava8\\InputText\\Namelist2.csv", month);
            oc.writeFile();

        } else {
            System.out.println(" incorrect month, bye!");
        }
    }
}
