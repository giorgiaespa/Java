public class User {
    private static User user;
    private String name;
    private Integer age;

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User= " +
                "name: " + name +
                "; age: " + age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public static User getUser() {
        if (user == null) {
            user = new User("Giò", 24);
        }
        return user;
    }

    public static User updateUser(String name, Integer age) {
        user.setName(name);
        user.setAge(age);
        return user;
    }
}
