package Models;

import java.util.Locale;
import java.util.Scanner;

public class InverteString {
    private String entrada = "";
    private String saida = "";

    public String invertePalavra(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra...: ");
        entrada = scanner.nextLine().toLowerCase();

        for(int i = entrada.length() -1; i >=0; i--){
            saida += entrada.charAt(i);
        }
        return saida;
    }
    public void imprimeSaida(){
        System.out.println(saida);
    }
}
