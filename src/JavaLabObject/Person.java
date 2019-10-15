package JavaLabObject;

//Defines a person by name and address

public class Person
{
    //The person's last name
    private String lastName;

    //The person's first name
    private String firstName;

    //The person's address
    private Address home;

    //Constructor creates a person from a last name,
    //first name, and address
    public Person(String last, String first, Address residence)
    {
        lastName = last;
        firstName = first;
        home = residence;
    }

    //toString method returns information about the person
    public String toString()
    {
        return(firstName + " " + lastName + ", " + home.toString());
    }

}

