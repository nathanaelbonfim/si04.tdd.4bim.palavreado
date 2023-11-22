package br.unipar.si04.tdd.palavreado.application;

public class Palavreado {
    private String text;

    public void ingestText(String string) {
        text = string;
    }

    public int countWords() {
        if (text == null) {
            return 0;
        }

        String[] words = text.split(" ");

        // desconsidera espaços em branco
        words = java.util.Arrays.stream(words).map(s -> s.trim()).toArray(String[]::new);

        // remove palavras vazias
        words = java.util.Arrays.stream(words).filter(s -> (s != null && s.length() > 0)).toArray(String[]::new);

        return words.length;
    }

    public Object countCharacters() {
        return text.length();
    }

    public Object countCharactersWithoutSpaces() {
        String textWithoutSpaces = text.replaceAll(" ", "");

        return textWithoutSpaces.length();
    }

    public Object countWordsWithOneToFiveLetters() {
        int count = 0;
        String[] words = text.split(" ");

        // desconsidera espaços em branco
        words = java.util.Arrays.stream(words).map(s -> s.trim()).toArray(String[]::new);

        for (int i = 0; i < words.length; i++) {
            boolean isOneToFiveLetters = words[i].length() >= 1 && words[i].length() <= 5;

            if (isOneToFiveLetters) {
                count++;
            }
        }

        return count;
    }

}