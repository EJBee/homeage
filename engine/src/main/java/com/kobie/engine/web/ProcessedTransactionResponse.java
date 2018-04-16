package com.kobie.engine.web;

public final class ProcessedTransactionResponse {
	private final String xref;

	public ProcessedTransactionResponse(final String xref) {
		this.xref = xref;
	}

	public String getXref() {
		return xref;
	}
}