package gr.aueb.cf.ch12;
/*
Data Class.
POJO (Plain Old Java Object)
Java Bean.
 */
public class Student {
    private int id;
    private String firstname;
    private String lastname;


    //Default constructor
    public Student() {
        id = 0;
        firstname = null;
        lastname = null;
    }// end default constructor



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id=id;
    }//end setID()

    public String getFirstname() {
        return firstname;
    }//end getFirstname()

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }// end setFirstname()

    public String getLastname() {
        return lastname;
    }//end getLastname()

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }//end setLastname()

}
