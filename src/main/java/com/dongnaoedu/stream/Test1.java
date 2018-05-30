package com.dongnaoedu.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import org.junit.Test;

public class Test1 {

	// 取出一组集合中长度最长的字符串
	@Test
	public void test() {
		List<String> list = new ArrayList<>();
		list.add("tony1");
		list.add("tony_1");
		list.add("mike");
		list.add("mike_1");
		list.add("allen_18");
		
		Optional<String> result = list.stream().max((x, y) -> x.length() - y.length());
		System.out.println(result.get());
		
		list.forEach(e -> System.out.print(e));
		list.forEach(System.out::print);
	}
	
	@Test
	public void test2() {
		//System.out.println(() -> 5);
	}
}
