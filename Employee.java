public class Employee {
    // Instance variables
    private int id;
    private String firstName;
    private String lastName;
    private String address;

    // Default constructor
    public Employee() {
        this.id = 0;
        this.firstName = "";
        this.lastName = "";
        this.address = "";
    }

    // Parameterized constructor
    public Employee(int id, String firstName, String lastName, String address) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    // Getter and Setter methods
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Method to get full name
    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Using default constructor
        Employee employee1 = new Employee();
        employee1.setId(1);
        employee1.setFirstName("John");
        employee1.setLastName("Doe");
        employee1.setAddress("123 Main Street");
        System.out.println("Employee 1 Full Name: " + employee1.getFullName());

        // Using parameterized constructor
        Employee employee2 = new Employee(2, "Jane", "Smith", "456 Elm Street");
        System.out.println("Employee 2 Full Name: " + employee2.getFullName());
    }
}
