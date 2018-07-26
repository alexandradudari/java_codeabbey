/* Suppose, we are given two timestamps - for example, when the train or ferry
boat starts its travel and when it finishes. This may look like:

start: May 3, 17:08:30
end  : May 8, 12:54:15

and we are curious to know, how much time (in days, hours, minutes and seconds)
is spent in traveling (perhaps, to choose faster variant). How this could be achieved?

One of the easiest way is:

    * convert both timestamps to big numbers, representing seconds from the
    beginning of the month (or year, or century);
    * calculate their difference - i.e. travel time in seconds;
    * convert this difference back to days, hours, minutes and seconds.

First operation could be performed by multiplying minutes by 60 and hours by
60*60 etc. and summing all values up. The third operation should be performed
on contrary by several divisions with keeping remainders.

In this task we are given several pair of timestamps. We suppose that both dates
in the pair are always in the same month, so only number of day will be given.
We want to calculate difference between timestamps in each pair.*/

import java.util.Scanner;

public class ModuloAndTimeDifference {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();              //numbers of test-cases

		int day1, hour1, min1, sec1, day2, hour2, min2, sec2;
		int duration1, duration2, diff;
		int dayf, hourf, minf, secf;

		for (int i = 0 ; i < n; i++) {

			day1 = sc.nextInt();
			hour1 = sc.nextInt();
			min1 = sc.nextInt();
			sec1 = sc.nextInt();
			day2 = sc.nextInt();
			hour2 = sc.nextInt();
			min2 = sc.nextInt();
			sec2 = sc.nextInt();

			//convert everything in seconds
			duration1 = sec1 + min1 * 60 + hour1 * 60 * 60 + day1 * 24 * 60 * 60;
			duration2 = sec2 + min2 * 60 + hour2 * 60 * 60 + day2 * 24 * 60 * 60;
			diff = duration2 - duration1;

			//convert everything in the original state
			dayf = diff / (24 * 60 * 60);
			diff %= 24 * 60 * 60;
			hourf = diff / (60 * 60);
			diff %= 60 * 60;
			minf = diff / 60;
			secf = diff % 60;

			String s = String.format("(%d %d %d %d) ", dayf, hourf, minf, secf);
			System.out.print(s);
		}
		sc.close();
	}
}
