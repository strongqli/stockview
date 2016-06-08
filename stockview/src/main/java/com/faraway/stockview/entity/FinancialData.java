/**
 * 
 */
package com.faraway.stockview.entity;

/**
 * @author liqiang
 *
 */
public class FinancialData {

	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getQuarter() {
		return quarter;
	}
	public void setQuarter(String quarter) {
		this.quarter = quarter;
	}
	public float getEps() {
		return eps;
	}
	public void setEps(float eps) {
		this.eps = eps;
	}
	public float getRevenue() {
		return revenue;
	}
	public void setRevenue(float revenue) {
		this.revenue = revenue;
	}
	public float getEarning() {
		return earning;
	}
	public void setEarning(float earning) {
		this.earning = earning;
	}
	public float getNetAssets() {
		return netAssets;
	}
	public void setNetAssets(float netAssets) {
		this.netAssets = netAssets;
	}
	private String code;
	private String name;
	private String quarter;
	private float eps;
	private float revenue;
	private float earning;
	private float netAssets;
}
