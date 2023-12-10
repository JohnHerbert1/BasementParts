package model;

import java.util.Random;

public class GerarSenhaAleatoria {

	public static String gerarCodigo() {
        StringBuilder codigo = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            char letra = (char) (random.nextInt(26) + 'A'); 
            codigo.append(letra);
        }

        for (int i = 0; i < 4; i++) {
            int digito = random.nextInt(10);
            codigo.append(digito);
        }

        return codigo.toString();
    }
}
