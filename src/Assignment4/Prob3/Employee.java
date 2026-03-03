package Assignment4.Prob3;

abstract class Employee {
    private final String firsName;
    private final String lastName;
    private final String socialSecurityNumber;

    Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firsName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getFirsName() {
        return firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    abstract double getPayment();

    @Override
    public String toString() {
        return String.format("""
                Firstname: %s
                Lastname: %s
                Social security number: %s
                """, firsName, lastName, socialSecurityNumber);
    }
}
