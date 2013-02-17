package net.exacode.example.application.query;

public class PageCriteria {
	private final int offset;
	private final int limit;

	public PageCriteria() {
		this(0, 10);
	}

	public PageCriteria(int offset, int limit) {
		this.offset = offset;
		this.limit = limit;
	}

	public int getOffset() {
		return offset;
	}

	public int getLimit() {
		return limit;
	}

	@Override
	public String toString() {
		return "PageCriteria [offset=" + offset + ", limit=" + limit + "]";
	}

}
