package com.cg.service;

import com.cg.bean.Goods;
import com.cg.dao.GoodsDaoImpl;

public class GoodsServiceImpl implements IGoodsService{
   GoodsDaoImpl gdao;
   
	/**
 * @param gdao
 */
public GoodsServiceImpl(GoodsDaoImpl gdao) {
	this.gdao = gdao;
}

	@Override
	public int addGoods(Goods goods) {
		// TODO Auto-generated method stub
		return gdao.addGoods(goods);
	}

	@Override
	public int removeGoods(Goods goods) {
		// TODO Auto-generated method stub
		return gdao.removeGoods(goods);
	}

	@Override
	public String orderGoods(Goods goods) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateGoods(Goods goods) {
		// TODO Auto-generated method stub
		return null;
	}

}
