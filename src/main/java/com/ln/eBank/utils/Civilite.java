package com.ln.eBank.utils;

import lombok.Getter;

@Getter
public enum Civilite {
	MME("Mme"), MR("Mr"), MLLE("Mlle");

	private String name;

	Civilite(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
}
