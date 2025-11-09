import java.util.Random;

public class Teacher {

    private char sex;
    private String dateOfBirth;
    private String department;
    private String name;

    //KONSTRUKTOREN

    public Teacher() {
    }

    public Teacher (String name, String dateOfBirth, char sex) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.sex = sex;
    }

    public Teacher (char sex, String dateOfBirth, String department, String name) {
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.department = department;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Teacher Name: " + name + "\n Sex: " + sex + "\n Date of birth: " + dateOfBirth + "\n Department: " + department.toUpperCase();
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
    //name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    //METHODEN

    public boolean checkAttributes(char sex, String dateOfBirth, String department, String name) {
        return (sex == getSex())
                && (dateOfBirth.equalsIgnoreCase(getDateOfBirth()))
                && (department.equalsIgnoreCase(getDepartment()))
                && (name.equalsIgnoreCase(getName()));
    }

    public void changeDepartmentRandom(){

        Random rd = new Random();
        String newDepartment = "error";
        int nextDepartment = rd.nextInt(4) + 1;
        switch (nextDepartment) {
            case 1:
                newDepartment = "IT";
                break;
            case 2:
                newDepartment = "MB";
                break;
            case 3:
                newDepartment = "PE";
                break;
            case 4:
                newDepartment = "ET";
                break;
        }
        setDepartment(newDepartment);

    }

}
