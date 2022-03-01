public class Statistics {

    public int sum(int[] salaries) {
        int sum = 0;
        for (int salary : salaries) {
            sum += salary;
        }
        return sum;
    }

    // ["24 5 66", "4", "97 65"] -> 97
    public static int maxStr(String[] numberLines) {
        int max = 0;
        for (String line : numberLines) {
            String[] parts = line.split(" "); // "24 5 66" -> ["24", "5", "66"]
            for (String part : parts) {
                int element = Integer.parseInt(part); // "24" -> 24
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }
}
