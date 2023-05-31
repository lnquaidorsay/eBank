package com.ln.eBank.services;

import java.util.List;

public interface AbstractService<T> {
	public long save(T dto);

	public List<T> findAll();

	public T findById(long id);

	public void delete(long id);
}
