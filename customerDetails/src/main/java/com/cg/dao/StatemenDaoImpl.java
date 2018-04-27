package com.cg.dao;

import java.util.HashSet;
import java.util.Set;

import com.cg.model.Statement;

public class StatemenDaoImpl implements IStatementDao{

	@Override
	public void getMiniStatement(final Statement statement) {
		final Set<Statement> set=new HashSet<>();
	    set.add(statement);
	    System.out.println(statement);
		
		
	}

}
