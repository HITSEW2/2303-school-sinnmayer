public class SchoolTest {

    public static void main(String[] args) {
        //Objekte
        //char sex, String dateOfBirth, String department, int year, String name
        Teacher t1 = new Teacher('m', "17.02.1975", "PE", "David Goggins");
        Teacher t2 = new Teacher('m', "06.09.1996", "PE", "Arda Saatci");
        Teacher t3 = new Teacher('f', "03.01.1991", "MB", "Mujal");
        Student s1 = new Student("Mustafa", "10.02.2004", 'm', "ET");
        Student s2 = new Student('f', "30.09.2007", "IT", 3, "Punti");

        //vor der Änderung der Zustände ausgeben
        System.out.println("Vor den Änderungen: \n");
        System.out.println(t1 + "\n");
        System.out.println(t2 + "\n");
        System.out.println(t3 + "\n");
        System.out.println(s1 + "\n");
        System.out.println(s2);

        //Werte Ändern
        t1.setDepartment("PE extreme");
        t2.setDateOfBirth("06.09.1997");
        t3.changeDepartmentRandom();
        s1.raiseYear(2);
        s2.setName("Rupert");
        s2.setDepartment("MB");

        //Nach den Änderugngen

        System.out.println("Nach den Änderungen: \n");
        System.out.println("Department geändert \n" + t1 + "\n");
        System.out.println("Date of birth korrigiert \n" + t2 + "\n");
        System.out.println("Zufälliges Department erzeugt und vergeben\n" + t3 + "\n");
        System.out.println("Name Geändert\n" + s1 + "\n");
        System.out.println("Department Geändert\n" + s2);

    }
}
