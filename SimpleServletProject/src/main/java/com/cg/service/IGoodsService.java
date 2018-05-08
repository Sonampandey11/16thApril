package com.cg.service;

import com.cg.bean.Goods;

public interface IGoodsService {
	public int addGoods(Goods goods);
	public int removeGoods(Goods goods);
	public String orderGoods(Goods goods);
	public String updateGoods(Goods goods);
	

}
