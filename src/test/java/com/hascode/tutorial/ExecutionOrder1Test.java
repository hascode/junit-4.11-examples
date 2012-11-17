package com.hascode.tutorial;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.JVM)
public class ExecutionOrder1Test {

	@Test
	public void bTest() {
		System.out.println("b");
	}

	@Test
	public void aTest() {
		System.out.println("a");
	}

	@Test
	public void dTest() {
		System.out.println("d");
	}

	@Test
	public void cTest() {
		System.out.println("c");
	}
}
