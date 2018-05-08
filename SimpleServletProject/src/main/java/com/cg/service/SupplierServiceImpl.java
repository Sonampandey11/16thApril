package com.cg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.bean.Supplier;
import com.cg.dao.SupplierDaoImpl;
@Service
public class SupplierServiceImpl implements ISupplierService{
  
	SupplierDaoImpl sdao;
	
	/**
	 * @param sdao
	 */
	public SupplierServiceImpl(SupplierDaoImpl sdao) {
		this.sdao = sdao;
	}

	@Override
	public int addSupplier(Supplier supplier) {
		
		return sdao.addSupplier(supplier);
	}

	@Override
	public int removeSupplier(Supplier supplier) {
		// TODO Auto-generated method stub
		return sdao.removeSupplier(supplier);
	}

	@Override
	public int updateSubblier(Supplier supplier) {
		// TODO Auto-generated method stub
		return sdao.updateSubblier(supplier);
	}

}
