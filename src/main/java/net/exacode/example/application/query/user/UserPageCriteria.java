package net.exacode.example.application.query.user;

import net.exacode.example.application.query.PageCriteria;

public class UserPageCriteria extends PageCriteria {
	private final String contains;

	public UserPageCriteria(int offset, int limit, String contains) {
		super(offset, limit);
		this.contains = contains;
	}

	public UserPageCriteria(int offset, int limit) {
		this(offset, limit, null);
	}

	public String getContains() {
		return contains;
	}

	@Override
	public String toString() {
		return "UserPageCriteria [contains=" + contains + "]";
	}

}
