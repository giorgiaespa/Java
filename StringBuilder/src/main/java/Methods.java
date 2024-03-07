public class Methods {

    private static String input;
    private static int index;

    public Methods(String input, int index) {
        this.input = input;
        this.index = index;
    }

    public static String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public static int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
    public static String getUnicodeCharacter(Methods result) {
        if (getIndex() >= 0 && getIndex() < getInput().length()) {
            char character = getInput().charAt(getIndex());
            return "Il carattere in Unicode nella posizione " + getIndex() + " è: " + charToUnicode(character) + " (" + character + ")";
        } else {
            return "Errore: l'indice non rientra nel range";
        }
    }
    private static String charToUnicode(char character) {
        StringBuilder toUnicode = new StringBuilder();
        toUnicode.append("U+").append(String.format("%04X", (int) character));
        return toUnicode.toString();
    }

}