package com.cg.bean;

/**
 * @author trainee
 *
 */
public class Goods {
	private int goodsId;
	private String goodsName;
	private int goodsQuantity;
	private String goodsPrice;
	private int supplierId;
	
	/**
	 * @return the supplierId
	 */
	public int getSupplierId() {
		return supplierId;
	}
	/**
	 * @param supplierId the supplierId to set
	 */
	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}
	/**
	 * @return the goodsId
	 */
	public int getGoodsId() {
		return goodsId;
	}
	/**
	 * @param goodsId the goodsId to set
	 */
	public void setGoodsId(final int goodsId) {
		this.goodsId = goodsId;
	}
	/**
	 * @return the goodsName
	 */
	public String getGoodsName() {
		return goodsName;
	}
	/**
	 * @param goodsName the goodsName to set
	 */
	public void setGoodsName(final String goodsName) {
		this.goodsName = goodsName;
	}
	/**
	 * @return the goodsQuantity
	 */
	public int getGoodsQuantity() {
		return goodsQuantity;
	}
	/**
	 * @param goodsQuantity the goodsQuantity to set
	 */
	public void setGoodsQuantity(final int goodsQuantity) {
		this.goodsQuantity = goodsQuantity;
	}
	/**
	 * @return the goodsPrice
	 */
	public String getGoodsPrice() {
		return goodsPrice;
	}
	/**
	 * @param goodsPrice the goodsPrice to set
	 */
	public void setGoodsPrice(final String goodsPrice) {
		this.goodsPrice = goodsPrice;
	}
	

	/**
	 * @param goodsId
	 * @param goodsName
	 * @param goodsQuantity
	 * @param goodsPrice
	 * @param supplierId
	 */
	public Goods(int goodsId, String goodsName, int goodsQuantity, String goodsPrice, int supplierId) {
		this.goodsId = goodsId;
		this.goodsName = goodsName;
		this.goodsQuantity = goodsQuantity;
		this.goodsPrice = goodsPrice;
		this.supplierId = supplierId;
	}
	/**
	 * 
	 */
	public Goods() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
