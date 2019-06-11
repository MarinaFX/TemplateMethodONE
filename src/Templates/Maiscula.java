package Templates;

public class Maiscula extends TemplateMethod {

    @Override
    public String transformaString(String s) {
        super.className();
        return s.toUpperCase();
    }
}
