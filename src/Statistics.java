public class Statistics {

    public long max(long[] salaries) {
        long max = salaries[0];
        for (long salary : salaries) {
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
