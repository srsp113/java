public class Prime {
	public static void main(String[] args) {
		int j = 17, count = 0;
		for (int i = 1; i <= j; i++) {
			if (j % i == 0)
				count++;
		}
		if (count == 2)
			System.out.println(j + "is a prime number");
		else
			System.out.println(j + "is not a prime number");
	}
}