package edu.wctc.wholesale.controller;

import edu.wctc.wholesale.entity.WholesaleOrder;
import edu.wctc.wholesale.service.WholesaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class HomeController
{
    private WholesaleService wholesaleService;

    @Autowired
    public HomeController(WholesaleService ws)
    {
        wholesaleService = ws;
    }


    @RequestMapping("/")
    public String showHomePage(Model model)
    {
        List<WholesaleOrder> orderList = wholesaleService.getWholesaleOrderList();
        model.addAttribute("orderList", orderList);
        return "index";
    }
}
