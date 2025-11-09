public class Student {

    private char sex;
    private String dateOfBirth;
    private String department;
    private int year;
    private String name;

    //KONSTRUKTOREN

    public Student() {

    }

    public Student (String name, String dateOfBirth, char sex) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.sex = sex;
    }

    public Student (char sex, String dateOfBirth, String department, int year, String name) {
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.department = department;
        this.year = year;
        this.name = name;
    }

    //GETTER SETTER

    //sex
    public char getSex() {
        return sex;
    }
    public void setSex(char sex) {
        this.sex = sex;
    }
    //dateofbirth
    public String getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    //department
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    //Year
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    //name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    //METHODEN

    public void raiseYear(int years) {
        setYear(getYear() + years);

        if (getYear() > 5) setYear(5);
    }

    public boolean checkStats(char sex, String dateOfBirth, String department, int year, String name) {
        if ((sex == getSex())
                && (dateOfBirth.equalsIgnoreCase(getDateOfBirth()))
                && (department.equalsIgnoreCase(getDepartment()))
                && (year == getYear())
                && (name.equalsIgnoreCase(getName()))) {
            return true;
        } else return false;
    }


}
