package br.unipar.si04.tdd.palavreado;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

import br.unipar.si04.tdd.palavreado.application.Palavreado;

public class Main {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite uma URL: ");
            String urlString = scanner.nextLine();

            URL url = new URL(urlString);
            URLConnection connection = url.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));

            StringBuilder responseBody = new StringBuilder();
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                responseBody.append(inputLine);
            }
            in.close();

            Palavreado palavreado = new Palavreado(responseBody.toString());

            System.out.println("\n\n+--------------------------------------------------------------+");
            System.out.printf("| %-60s |%n", "Estatísticas");
            System.out.println("+--------------------------------------------------------------+\n\n");
            System.out.println("+--------------------------------------------+----------------+");
            System.out.printf("| %-42s | %-14d |%n", "Contagem de palavras", palavreado.countWords());
            System.out.printf("| %-42s | %-14d |%n", "Contagem de caracteres", palavreado.countCharacters());
            System.out.printf("| %-42s | %-14d |%n", "Contagem de caracteres (sem espaços)", palavreado.countCharactersWithoutSpaces());
            System.out.printf("| %-42s | %-14d |%n", "Palavras com 1-5 letras", palavreado.countWordsWithOneToFiveLetters());
            System.out.printf("| %-42s | %-14d |%n", "Ocorrências da letra 'j'", palavreado.countLetterJ());
            System.out.println("+--------------------------------------------+----------------+");
        }
    }

}