package hackerrank.easy;

public class beautiful_day_at_the_movies {

	// Complete the beautifulDays function below.
	static int beautifulDays(int i, int j, int k) {
		int happy = 0;
		for (int m = i; m <= j; m++) {
			int num = m;
			int reverse = 0;
			int check = 0;
			while (num != 0) {
				reverse = reverse * 10 + num % 10;
				num /= 10;
			}
			check = (Math.abs(m - reverse)) % k;
			;
			if (check == 0)
				happy++;

		}
		return happy;
	}
}
