public class PersonBuilder {
    public PersonBuilder (){}
    public String firstName;
    public String lastName;
    public Integer age;
    public String address;

    public PersonBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public PersonBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public PersonBuilder setAge(Integer age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person prototypeBuild () {
        return new Person(firstName, lastName, age, address);
    }
}
