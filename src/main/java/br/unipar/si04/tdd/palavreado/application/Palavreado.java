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
        return words.length;
    }
    
}