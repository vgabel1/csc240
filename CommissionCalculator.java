import javax.naming.CommunicationException;
import java.util.Scanner;

public class CommissionCalculator {
    private Auto _auto;
    private Home _home;
    private Life _life;

    public CommissionCalculator(Auto auto, Home home, Life life) {
        _auto = auto;
        _home = home;
        _life = life;
    }
    public CommissionCalculator() {
        _auto = new Auto();
        _home = new Home();
        _life = new Life();
    }

    public void Run(){
        int select;
        Scanner scan = new Scanner(System.in);

        boolean done = false;
        do {
            System.out.println("\n\nWelcome to Parkland Insurance");
            System.out.println("-----------------------------");
            System.out.println("Enter any of the following:");
            System.out.println("    1) Enter auto policy information");
            System.out.println("    2) Enter home policy information");
            System.out.println("    3) Enter life policy information");
            System.out.println("    4) Compute commission and print auto policy");
            System.out.println("    5) Compute commission and print home policy");
            System.out.println("    6) Compute commission and print life policy");
            System.out.println("    7) Quit");

            select = scan.nextInt();
            switch(select){
                case 1:
                    String auto_fname, auto_lname, auto_make, auto_model;
                    double auto_liability, auto_collision;
                    System.out.println("Enter first name of insured: ");
                    auto_fname = scan.next();
                    System.out.println("Enter last name of insured: ");
                    auto_lname = scan.next();
                    System.out.println("Enter make of vehicle: ");
                    auto_make = scan.next();
                    System.out.println("Enter model of vehicle: ");
                    auto_model = scan.next();
                    System.out.println("Enter amount of liability: ");
                    auto_liability = scan.nextDouble();
                    System.out.println("Enter amount of collision: ");
                    auto_collision = scan.nextDouble();

                    this._auto = new Auto(auto_fname, auto_lname, auto_make, auto_model, auto_liability, auto_collision);
                    break;

                case 2:
                    String home_fname, home_lname;
                    int home_sqfootage;
                    double home_dwelling, home_contents, home_liability;
                    System.out.println("Enter first name of insured: ");
                    home_fname = scan.next();
                    System.out.println("Enter last name of insured: ");
                    home_lname = scan.next();
                    System.out.println("Enter house square footage: ");
                    home_sqfootage = scan.nextInt();
                    System.out.println("Enter amount of dwelling: ");
                    home_dwelling = scan.nextDouble();
                    System.out.println("Enter amount of contents: ");
                    home_contents = scan.nextDouble();
                    System.out.println("Enter amount of liability: ");
                    home_liability = scan.nextDouble();

                    this._home = new Home(home_fname, home_lname, home_sqfootage, home_dwelling, home_contents, home_liability);
                    break;

                case 3:
                    String life_fname, life_lname;
                    int life_age;
                    double life_coverage;
                    System.out.println("Enter first name of insured: ");
                    life_fname = scan.next();
                    System.out.println("Enter last name of insured: ");
                    life_lname = scan.next();
                    System.out.println("Enter age of insured: ");
                    life_age = scan.nextInt();
                    System.out.println("Enter amount of term: ");
                    life_coverage = scan.nextDouble();

                    this._life = new Life(life_fname, life_lname, life_age, life_coverage);
                    break;

                case 4:
                    System.out.println(this._auto.toString());
                    break;

                case 5:
                    System.out.println(this._home.toString());
                    break;

                case 6:
                    System.out.println(this._life.toString());
                    break;

                case 7:
                    done = true;
                    break;
            }
        } while (done != true);
    }
}
