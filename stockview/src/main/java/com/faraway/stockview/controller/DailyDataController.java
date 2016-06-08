package com.faraway.stockview.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class DailyDataController {
	@RequestMapping("/dailydata")
    public String greeting(@RequestParam(value="code", required=true) String name, Model model) {
        model.addAttribute("data", name);
        return "greeting";
    }
}
