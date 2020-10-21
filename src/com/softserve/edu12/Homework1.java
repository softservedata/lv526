package com.softserve.edu12;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Homework1 {

	public static void main(String[] args) {

		Random random = new Random(1000);
		Stream.generate(() -> random.nextInt(1000))
			.limit(20).
			forEach(System.out::println);

		System.out.println();
		IntStream s2 = random.ints();
		s2.limit(10)
			.sorted()
			.forEach(System.out::println);

		System.out.println();
		IntStream s3 = IntStream.of(1, 45, 7869, 45, 78);
		int max = s3.limit(10)
				.max()
				.getAsInt();
		System.out.println(max);
	}

}
