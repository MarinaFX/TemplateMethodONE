package Templates;

import java.util.Scanner;

public abstract class TemplateMethod {
    private String resposta = "";

    public void leString(){
        Scanner in = new Scanner(System.in);
        System.out.print("Digite uma String: ");
        resposta = in.nextLine();
        System.out.println();
        resposta = transformaString(resposta);
    }

    public void imprimeString(){
        System.out.println(resposta);
    }

    public abstract String transformaString(String s);

    public void className(){
        System.out.println(getClass().toString());
    }
}
