public class Triangolo extends Forma{
    public Triangolo(double base, double altezza) {
        super(base, altezza);
    }
    @Override
    public String calcolaArea() {
        return "L'area del triangolo è: " + (String.valueOf(base*altezza/2));
    }
}