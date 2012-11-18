package com.hascode.tutorial;

import static org.junit.Assert.assertTrue;
import static org.junit.Assume.assumeFalse;

import org.junit.Rule;
import org.junit.Test;
import org.junit.internal.AssumptionViolatedException;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

public class WatcherExampleTest {
	@Rule
	public TestWatcher watcher = new TestWatcher() {
		@Override
		protected void skipped(final AssumptionViolatedException e,
				final Description description) {
			System.out.println("method " + description.getMethodName()
					+ " was skipped because of '" + e.getMessage() + "'");
		}
	};

	@Test
	public void testSomething() {
		assertTrue(true);
	}

	@Test
	public void testIgnored() {
		assumeFalse(true); // assumption fails
	}
}
