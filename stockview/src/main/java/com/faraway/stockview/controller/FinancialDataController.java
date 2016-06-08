/**
 * 
 */
package com.faraway.stockview.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.faraway.stockview.entity.FinancialData;


/**
 * @author liqiang
 *
 */
@Controller
@RequestMapping("/financial-data")
public class FinancialDataController {
	
	@RequestMapping(value="/{CODE}", method=RequestMethod.GET, produces={"application/json"})
	public List<FinancialData> getFinancialDatas(@PathVariable("CODE")String code) {
		return new ArrayList<FinancialData>();		
	}

}
