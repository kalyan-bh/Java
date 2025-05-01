package designPatterns;
/*
The Builder Design Pattern is a creational pattern used to construct complex objects step-by-step.
It separates the construction of an object from its representation

When an object has many parameters, especially optional ones.
When object creation involves multiple steps.
*/
class User {
    // required parameters
    private final String firstName;
    private final String lastName;

    // optional parameters
    private final int age;
    private final String phone;
    private final String address;

    // private constructor
    private User(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.phone = builder.phone;
        this.address = builder.address;
    }

    public static class Builder {
        // required parameters
        private final String firstName;
        private final String lastName;

        // optional parameters - initialized to default values
        private int age = 0;
        private String phone = "";
        private String address = "";

        public Builder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }

    public String toString() {
        return String.format("User: %s %s, Age: %d, Phone: %s, Address: %s",
                firstName, lastName, age, phone, address);
    }

}


public class Builder {
    public static void main(String[] args) {
        User user = new User.Builder("John", "Doe")
                .age(30)
                .phone("1234567890")
                .address("123 Main St")
                .build();

        System.out.println(user);
    }
}
