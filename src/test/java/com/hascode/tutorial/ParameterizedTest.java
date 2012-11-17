package com.hascode.tutorial;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParameterizedTest {
	@Parameters(name = "Run {index}: findUserById({0})={1}")
	public static Iterable<Object[]> data() {
		return Arrays.asList(new Object[][] { { 1l, new User(1l, "Fred") },
				{ 3l, new User(3l, "Suzie") }, { 5l, new User(5l, "Tim") },
				{ 666l, new User(666l, "Luzi") },
				{ 1024l, new User(1025l, "Bob") } });
	}

	private final Long idParam;
	private final User userParam;

	public ParameterizedTest(final Long idParam, final User userParam) {
		this.idParam = idParam;
		this.userParam = userParam;
	}

	@Test
	public void testUserMapping() {
		UserDao userDao = new UserDao();
		User user = userDao.findById(idParam);
		System.err.print(idParam + " :\t");
		System.err.println(userParam.toString());
		assertEquals(idParam, user.getId());
		assertEquals(userParam.getName(), user.getName());
	}
}
