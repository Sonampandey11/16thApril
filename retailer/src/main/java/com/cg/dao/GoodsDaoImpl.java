package com.cg.dao;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.cg.bean.Goods;

public class GoodsDaoImpl implements IGoodsDao {
   

	JdbcTemplate template;
	 
		public GoodsDaoImpl(JdbcTemplate template) {
			super();
			this.template = template;
		}

	@Override
	public int addGoods(Goods goods) {
		String sqlquery="insert into goods values('"+goods.getGoodsId()+"','"
				                                    +goods.getGoodsName()+"','"
				                                    +goods.getGoodsQuantity()+"','"
				                                    +goods.getGoodsPrice()+"','"
				                                    +goods.getSupplierId()+"')";
		template.update(sqlquery);
		return goods.getGoodsId();
		
	}

	@Override
	public int removeGoods(Goods goods) {
		String sqlquery="delete from goods where goodsId='"+goods.getGoodsId()+"')";
		return template.update(sqlquery);
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
