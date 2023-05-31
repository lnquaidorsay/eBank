package com.ln.eBank.utils;

import lombok.Getter;

@Getter
public enum TypeOperation {
	ACHAT("Achat"), RETRAIT("Retrait");

	private String name;

	TypeOperation(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
}
