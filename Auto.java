import java.text.DecimalFormat;

public class Auto {
    private String fname;
    private String lname;
    private String make;
    private String model;
    private double liability;
    private double collision;

    public Auto() {
        this.fname = "";
        this.lname = "";
        this.make = "";
        this.model = "";
        this.liability = 0.0;
        this.collision = 0.0;
    }
    public Auto(String fname, String lname, String make, String model, double liability, double collision) {
        this.fname = fname;
        this.lname = lname;
        this.make = make;
        this.model = model;
        this.liability = liability;
        this.collision = collision;
    }

    public String getFirstName() {
        return fname;
    }
    public void setFirstName(String name) {
        this.fname = name;
    }
    public String getLastName() {
        return lname;
    }
    public void setLastName(String name) {
        this.lname = name;
    }
    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public double getLiability() {
        return liability;
    }
    public void setLiability(double liability) {
        this.liability = liability;
    }
    public double getCollision() {
        return collision;
    }
    public void setCollision(double collision) {
        this.collision = collision;
    }

    private String format(double number) {
        DecimalFormat df = new DecimalFormat("$#,###.00");
        return df.format(number);
    }

    public String commission() {
        double com = (this.liability + this.collision) * 0.3;
        return format(com);
    }

    public String toString() {
        String str = "\n\nAuto Policy\n\n----------\n\nName: " + fname + " " + lname + "\n\nMake and Model: " +
                make + " " + model + "\n\nLiability: " + format(liability) + "\n\nCollision: " + format(collision) +
                "\n\nCommission: " + commission();
        return str;
    }
}
