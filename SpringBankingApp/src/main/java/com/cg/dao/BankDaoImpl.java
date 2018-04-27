package com.cg.dao;

import java.util.HashSet;
import java.util.Set;

import com.cg.model.Bank;

/**
 * @author trainee
 *
 */

public class BankDaoImpl implements IBankDao {

	/* (non-Javadoc)
	 * @see com.cg.dao.IBankDao#bankName(com.cg.model.Bank)
	 */
	@Override
	public Set<Bank> bankName(final Bank banks) {
		final Set<Bank> set = new HashSet<Bank>();
		set.add(banks);
		return set;
	}
//displaying branch of corresponding branch
	@Override
	public Set<Bank> branch(final Bank branch) {
		final Set<Bank> setAll = new HashSet<Bank>();
		setAll.add(branch);
		return setAll;

	}

}
