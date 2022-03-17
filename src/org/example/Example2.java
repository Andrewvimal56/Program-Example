package org.example;

public class Example2 {
	public static void main(String[] args) {
		String s = "helllllooooo";
		int count;
		// Change String into Character Array

		char c[] = s.toCharArray();

        // Counts Each Character present in the string
		
		for (int i = 0; i < c.length; i++) {

			count = 1;
			for (int j = i + 1; j < c.length; j++) {

				if (c[i] == c[j]) {
					count++;
					// to avoid printing same value
					c[j] = 0;
					// count is greater then it considered as duplicate
					System.out.println("Duplicate Characters :"+ c[i]);
				}
				

					
				

			}

		}
	}
}
