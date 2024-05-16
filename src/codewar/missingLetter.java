package codewar;

public class missingLetter {

	public static char findMissingLetter(char[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] - array[i] > 1) {
                return (char) (array[i] + 1);
            }
        }
        // If no missing letter is found, return '\0' or throw an exception, depending on the requirements.
        return '\0';
    }

    public static void main(String[] args) {
        char[] letters1 = {'a', 'b', 'c', 'e', 'f'};
        char[] letters2 = {'O', 'Q', 'R', 'S'};
        char[] letters3 = {'z', 'x', 'w', 'v', 't'};
     System.out.println(   findMissingLetter(letters1));
        System.out.println(findMissingLetter(letters2));
        System.out.println(findMissingLetter(letters3));
    }
}
