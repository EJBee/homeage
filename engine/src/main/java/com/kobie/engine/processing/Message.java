package com.kobie.engine.processing;

public final class Message {
	public static final int HELLO = 0;
	public static final int GOODBYE = 1;

	private int status;
	private String message;

	public String getMessage() {
		return message;
	}

	public int getStatus() {
		return status;
	}

	public void setMessage(final String message) {
		this.message = message;
	}

	public void setStatus(final int status) {
		this.status = status;
	}
}