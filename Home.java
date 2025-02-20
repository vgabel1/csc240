import java.text.DecimalFormat;

public class Home {
    private String fname;
    private String lname;
    private int sqfootage;
    private double dwelling;
    private double contents;
    private double liability;

    public Home() {
        this.fname = "";
        this.lname = "";
        this.sqfootage = 0;
        this.dwelling = 0.0;
        this.contents = 0.0;
        this.liability = 0.0;
    }
    public Home(String fname, String lname, int sqfootage, double dwelling, double contents, double liability) {
        this.fname = fname;
        this.lname = lname;
        this.sqfootage = sqfootage;
        this.dwelling = dwelling;
        this.contents = contents;
        this.liability = liability;
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
    public int getSqfootage() {
        return sqfootage;
    }
    public void setSqfootage(int sqfootage) {
        this.sqfootage = sqfootage;
    }
    public double getDwelling() {
        return dwelling;
    }
    public void setDwelling(double dwelling) {
        this.dwelling = dwelling;
    }
    public double getContents() {
        return contents;
    }
    public void setContents(double contents) {
        this.contents = contents;
    }
    public double getLiability() {
        return liability;
    }
    public void setLiability(double liability) {
        this.liability = liability;
    }

    private String format(double number) {
        DecimalFormat df = new DecimalFormat("$#,###.00");
        return df.format(number);
    }

    public String commission() {
        double com = (this.liability * 0.3) + ((this.dwelling + this.contents) * 0.2);
        return format(com);
    }

    public String toString() {
        String str = "\n\nHome Policy\n\n----------\n\nName: " + fname + " " + lname + "\n\nSquare Feet: " +
                sqfootage + "\n\nDwelling: " + format(dwelling) + "\n\nContents: " + format(contents) + "\n\nLiability: "
                + format(liability) + "\n\nCommission: " + commission();
        return str;
    }
}
