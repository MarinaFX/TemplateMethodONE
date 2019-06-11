package Templates;

public class Inverter extends TemplateMethod {
    @Override
    public String transformaString(String s) {
        super.className();
        StringBuilder newString = new StringBuilder(s);
        return newString.reverse().toString();
    }

}
