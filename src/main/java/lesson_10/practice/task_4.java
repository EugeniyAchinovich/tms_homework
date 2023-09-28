package lesson_10.practice;


public class task_4 {
    public static class Pair {
        char letter;
        int  count;

        Pair() {
            this.letter = ' ';
            this.count = 0;
        }
    }
    static final int ENG_ALPHABET_SIZE = 26;

    public static Pair[] FrequencyDictionary(String expression) {
        Pair[] frequencyDictionary = new Pair[ENG_ALPHABET_SIZE];

        for (int i = 0; i < frequencyDictionary.length; i++) {
            frequencyDictionary[i] = new Pair();
            frequencyDictionary[i].letter = (char) ('a' + i);
        }

        for (char letter : expression.toCharArray()) {
            if (letter < 'a' || letter > 'z')
                continue;
            frequencyDictionary[letter - 'a'].count += 1;
        }
        return frequencyDictionary;
    }

    public static void main(String[] args) {
        String expression = "counter strike forever";

        Pair[] dictionary = FrequencyDictionary(expression);

        for (Pair p : dictionary)
            if (p.count > 0)
                System.out.println(p.letter + " - " + p.count);
    }
}
