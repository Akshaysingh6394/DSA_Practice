public class returnNumberBet {
    public static void main(String[] args) {
        String str = "1ab1cd11";
        int count = 0;
        String temp = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isDigit(ch)) {
                temp += ch;
            } else {
                // When we hit a letter, check if there was a number before
                if (!temp.isEmpty()) {
                    // Check previous and current both are letters
                    if (i - temp.length() - 1 >= 0 && Character.isLetter(str.charAt(i - temp.length() - 1))) {
                        count++;
                    }
                    temp = "";
                }
            }
        }

        System.out.println("Number of numbers between letters: " + count);

    }
    
}
