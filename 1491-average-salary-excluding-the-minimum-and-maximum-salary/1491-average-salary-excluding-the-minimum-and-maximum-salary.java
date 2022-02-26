class Solution {
    public double average(int[] salary) {
        int n = salary.length;
		int min = salary[0];
        int max = salary[0];
        int sum = salary[0];
        for (int i = 1; i < n; ++i)
        {
            if (salary[i] < min)
                min = salary[i];
            else if (salary[i] > max)
                max = salary[i];
			sum += salary[i];
        }
        return (double)(sum - min - max) / (n - 2);
    }
}