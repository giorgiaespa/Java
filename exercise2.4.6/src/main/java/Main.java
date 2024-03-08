public class Main {

    public static void main(String[] args) {
        System.out.println(User.getUser());
        User u2 = User.updateUser("Zak", 23);
        System.out.println(u2);
    }
}
