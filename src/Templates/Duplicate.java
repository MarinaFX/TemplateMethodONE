package Templates;

public class Duplicate extends TemplateMethod {
    @Override
    public String transformaString(String s) {
        super.className();
        return s + "" + s;
    }
}
