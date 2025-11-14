public class Person
{
    private String fName;
    private String lName;
    private int age;
    private int ssn;


    Person(String f, String l, int a, int s) 
    {
        fName = f;
        lName = l;
        age = a;
        ssn = s;
    }

    public String getFName() { return fName; }
    public String getLName() { return lName; }
    public int getAge() { return age; }
    public int getSSN() { return ssn; }

    public void setFName(String f) { fName = f; }
    public void setLName(String l) { lName = l; }
    public void setAge(int a) { age = a; }
    public void setSSN(int s) { ssn = s; }

    public String toString() 
    {
        return ("SSN: " + ssn + "\n\tName: " + fName + " " + lName + "\n\tAge: " + age);
    }
}
