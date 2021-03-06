package pl.mzelechowski;

public class User {
        private int id;
    private final String firstName;
    private final String lastName;
    private final String nickName;
    private static int COUNTER_ID=0;

    public User( String firstName, String lastName, String nickName) {
        this.id = ++COUNTER_ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.nickName = nickName;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getNickName() {
        return nickName;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}
