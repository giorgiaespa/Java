public class Rettangolo extends Forma{
    public Rettangolo(double base, double altezza) {
        super(base, altezza);
    }

    @Override
    public String calcolaArea() {
        return "L'area del rettangolo è: " + String.valueOf(base*altezza);
    }
}