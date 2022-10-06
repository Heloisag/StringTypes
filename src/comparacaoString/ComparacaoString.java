package comparacaoString;

import java.security.SecureRandom;

public class ComparacaoString {

    public static void main (String[] args){
        // declaração de variaveis
        String name01 = "Heloisa";
        String name02 = "Marcelo";
        String name03 = new String("Heloisa");
        String answer;
        answer = (name01 == name02) ? "Same" : "Different";
        // Answer = Name01 é igual a nome 02 ? se sim imprime o valor "igual" se não imprime o valo "Diferente.
        System.out.print(answer);
    }

}
