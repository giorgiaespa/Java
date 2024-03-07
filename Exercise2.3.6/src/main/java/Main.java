public class Main {
    public static void main(String[] args) {
        Rettangolo rettangolo = new Rettangolo(7.13, 3.5);
        System.out.println(rettangolo.calcolaArea());;

        Triangolo triangolo = new Triangolo(7, 9);
        System.out.println(triangolo.calcolaArea());
    }
}