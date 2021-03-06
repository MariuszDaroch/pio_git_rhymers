package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	public static final int EMPTY = -1;
	public static final int STACK_SIZE = 12;
	public static final int FULL_SIZE = 11;

	final private int[] numbers = new int[STACK_SIZE];

	public int total = EMPTY;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == EMPTY;
	}

	public boolean isFull() {
		return total == FULL_SIZE;
	}

	protected int peekaboo() {
		if (callCheck())
			return -1;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return -1;
		return numbers[total--];
	}

}
