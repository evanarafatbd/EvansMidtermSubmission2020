package design;

public abstract class EmpAbstrctClass implements Employee {

     String fname, lname, fullname;
     private int id;


    public void employeeName(String fname, String lname, int id){
        this.fname = fname;
        this.lname = lname;
        this.id = id;

        fullname = fname+lname;
        System.out.println("Employee ID "+ id+ " Employee Name: "+
                fullname);
    }
}
