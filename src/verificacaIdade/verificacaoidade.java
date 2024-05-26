package verificacaIdade;

import java.util.Locale;
import java.util.Scanner;

public class verificacaoidade {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("digite sua idade: ");
        int idade = scanner.nextInt();
        int maior_idade = 18;

        if (idade >= maior_idade){
            System.out.print("Voce esta elegivel para criar uma conta bancaria.");
        }else{
            System.out.print("Voce nao esta elegivel para criar uma conta bancaria.");
        }
    }
}
