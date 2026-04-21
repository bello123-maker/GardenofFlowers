public abstract class Person {
    private String surname;
    private String firstname;

    // New constructor
    public Person(String firstname, String surname) {
        this.firstname = firstname;
        this.surname = surname;
    }

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

    // New constructor - calls Person's constructor via super()
    public Employee(String firstname, String surname, int id) {
        super(firstname, surname);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        // Now we can create an Employee in one line
        Employee emp = new Employee("John", "Smith", 101);

        System.out.println("First name: " + emp.getFirstname());
        System.out.println("Surname:    " + emp.getSurname());
        System.out.println("ID:         " + emp.getId());
    }
}