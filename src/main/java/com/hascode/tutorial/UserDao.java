package com.hascode.tutorial;

import java.util.HashMap;
import java.util.Map;

public class UserDao {
	final Map<Long, User> userStore = new HashMap<Long, User>();
	{
		userStore.put(1l, new User(1l, "Fred"));
		userStore.put(3l, new User(3l, "Suzie"));
		userStore.put(5l, new User(5l, "Tim"));
		userStore.put(666l, new User(666l, "Luzi"));
		userStore.put(1024l, new User(1024l, "Bob"));
	}

	public User findById(final Long id) {
		return userStore.get(id);
	}
}
