package com;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class B {
public static void main(String[] args) {
	List<Integer> list = Arrays.asList(2, 4, 5, 6);
	int sum = list.stream()
	        .reduce(3, (a, b) -> a + b);
        System.out.println(sum);
}
}
