public class Main {
    public static void main(String[] args) {
        PersonBuilder pb = new PersonBuilder();
        pb.setFirstName("Zachary");
        pb.setLastName("Johnson");
        pb.setAge(24);
        Person p1 = pb.prototypeBuild();
        System.out.println(p1);

        PersonBuilder pb2 = new PersonBuilder();
        pb2.setFirstName("Zaira");
        pb2.setLastName("Williams");
        pb2.setAddress("86, Mulberry Street");
        Person p2 = pb2.prototypeBuild();
        System.out.println(p2);
    }
}
