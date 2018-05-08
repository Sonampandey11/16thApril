package com.cg.dao;

import com.cg.bean.Supplier;

public interface ISupplierDao {
	public int addSupplier(Supplier supplier);
	public int removeSupplier(Supplier supplier);
	public int updateSubblier(Supplier supplier);

}
