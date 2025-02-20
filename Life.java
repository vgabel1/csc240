import java.text.DecimalFormat;

public class Life {
    private String fname;
    private String lname;
    private int age;
    private double coverage;

    public Life() {
        this.fname = "";
        this.lname = "";
        this.age = 0;
        this.coverage = 0.0;
    }
    public Life(String fname, String lname, int age, double coverage) {
        this.fname = fname;
        this.lname = lname;
        this.age = age;
        this.coverage = coverage;
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
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public double getCoverage() {
        return coverage;
    }
    public void setCoverage(double coverage) {
        this.coverage = coverage;
    }

    private String format(double number) {
        DecimalFormat df = new DecimalFormat("$#,###.00");
        return df.format(number);
    }

    public String commission() {
        double com = coverage * 0.2;
        return format(com);
    }

    public String toString() {
        String str = "\n\nLife Policy\n\n----------\n\nName: " + fname + " " + lname + "\n\nAge: " + age +
                "\n\nTerm: " + format(coverage) + "\n\nCommission: " + commission();
        return str;
    }
}
