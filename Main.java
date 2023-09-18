public class Main {
    public static void main(String[] args) {

        String input = "  Вводится ненормированная строка, у   которой  могут быть пробелы в начале, в конце        и между словами    более одного  пробела.  ";

        String trimmed = input.trim();

        String normalizedString = trimmed.replaceAll("\\s+", " ");

        System.out.println("Ненормированная строка: " + input);
        System.out.println("Нормированная строка: " + normalizedString);
    }
}