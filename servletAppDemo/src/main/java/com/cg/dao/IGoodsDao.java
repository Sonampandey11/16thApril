package com.cg.dao;

import com.cg.bean.Goods;

public interface IGoodsDao {
	public int addGoods(Goods goods);
	public int removeGoods(Goods goods);
	public String orderGoods(Goods goods);
	public String updateGoods(Goods goods);

}
