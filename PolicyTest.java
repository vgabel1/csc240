public class PolicyTest {
    public static void main(String[] args) {
        //create auto policy:
        Auto a = new Auto("Jerry", "Seinfeld", "Chevy", "Malibu", 10000.0, 50000.0);
        //compute commission for some reason?
        a.commission();
        //to string:
        System.out.println(a);

        //create home policy:
        Home h = new Home();
        h.setFirstName("Elaine");
        h.setLastName("Benes");
        h.setContents(5000.0);
        h.setDwelling(32000.0);
        h.setSqfootage(4000);
        h.setLiability(10000.0);
        //commission again:
        h.commission();
        //to string:
        System.out.println(h);

        //create life policy:
        Life l = new Life("Cosmo", "Kramer", 35, 50000.0);
        //useless commission call:
        l.commission();
        //to string:
        System.out.println(l);

        //getter tests:
        System.out.println("\n\nGet Life Policy's First Name: " + l.getFirstName());
        System.out.println("Get Life Policy's Last Name: " + l.getLastName());
        System.out.println("Get Life Policy's age: " + l.getAge());
        System.out.println("Get life term: " + l.getCoverage());
    }
}
