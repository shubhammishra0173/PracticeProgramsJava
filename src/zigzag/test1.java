package zigzag;

public class test1 {
	public static String convert(String s, int numRows) {
        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }

        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int currentRow = 0;
        int direction = 1;

        for (char c : s.toCharArray()) {
            rows[currentRow].append(c);

            if (currentRow == 0) {
                direction = 1;
            } else if (currentRow == numRows - 1) {
                direction = -1;
            }

            currentRow += direction;
        }

        StringBuilder zigzag = new StringBuilder();
        for (StringBuilder row : rows) {
            zigzag.append(row);
        }

        return zigzag.toString();
    }

    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int numRows = 3;
        String zigzagPattern = convert(s, numRows);
        System.out.println(zigzagPattern);
    }
}
