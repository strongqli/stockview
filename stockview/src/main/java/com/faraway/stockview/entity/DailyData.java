/**
 * 
 */
package com.faraway.stockview.entity;

import javax.persistence.Entity;

/**
 * @author liqiang
 *
 */
@Entity
public class DailyData {
	String code;
	String date;
	double open;
	double high;
	double low;
	double close;
	long dealVolumn;
	long dealValue;
}
