package com.cg.service;

import com.cg.dao.StatemenDaoImpl;
import com.cg.model.Statement;

/* (non-Javadoc)
 * @see com.cg.service.IStatement#getMiniStatement()
 */
public class StatementImpl implements IStatement {

	StatemenDaoImpl dao;
	@Override
	public void getMiniStatement(Statement satement) {
		
		
		dao.getMiniStatement(satement);
		
	}
	

}
