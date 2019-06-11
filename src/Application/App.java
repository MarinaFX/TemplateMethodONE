package Application;

import Templates.*;

public class App {
    public static void main(String[] args) {
        TemplateMethod template = new Maiscula();
        template.leString();
        template.imprimeString();

        template = new Minuscula();
        template.leString();
        template.imprimeString();

        template = new Duplicate();
        template.leString();
        template.imprimeString();

        template = new Inverter();
        template.leString();
        template.imprimeString();
    }
}
