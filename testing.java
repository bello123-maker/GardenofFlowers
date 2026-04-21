public abstract class Person {
    private String surname;
    private String firstname;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
}

public class Employee extends Person {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp = new Employee();

        emp.setFirstname("John");
        emp.setSurname("Smith");
        emp.setId(101);

        System.out.println("First name: " + emp.getFirstname());
        System.out.println("Surname:    " + emp.getSurname());
        System.out.println("ID:         " + emp.getId());
    }
}