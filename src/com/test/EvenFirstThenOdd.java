package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EvenFirstThenOdd {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 4, 7, 8, 9, 0, 4, 3, 6);

		List<Integer> evenList = list.stream().filter(i -> i % 2 == 0).sorted().collect(Collectors.toList());
		List<Integer> oddList = list.stream().filter(i -> i % 2 != 0).sorted().collect(Collectors.toList());

		List<Integer> finalList = Stream.concat(evenList.stream(), oddList.stream()).collect(Collectors.toList());

		System.out.println(finalList);

	}

}
