public class Statistics {

    public int max(int[] salaries) {
        int max = salaries[0];
        for (int salary : salaries) {
            if (salary > max) {
                max = salary;
            }
        }
        return max;
    }

    public int sum(int[] salaries) {
        int sum = 0;
        for (int salary : salaries) {
            sum += salary;
        }
        return sum;
    }
}
