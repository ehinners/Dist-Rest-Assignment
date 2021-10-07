package edu.wctc.wholesale.controller;

import edu.wctc.wholesale.DTO.Order;
import edu.wctc.wholesale.entity.WholesaleOrder;
import edu.wctc.wholesale.service.WholesaleService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin
@RestController
@RequestMapping("/api/")
public class APIController
{
    private WholesaleService wholesaleService;

    @Autowired
    private ModelMapper modelMapper;

    private Order convertToDTO(WholesaleOrder wholesaleOrder)
    {
        Order order = modelMapper.map(wholesaleOrder, Order.class);

        return order;
    }

    @Autowired
    public APIController(WholesaleService ws)
    {
        wholesaleService = ws;
    }


    @GetMapping("orders")
    public List<Order> getOrders()
    {

        List<Order> data = wholesaleService.getWholesaleOrderList().stream().map(this::convertToDTO).collect(Collectors.toList());
        return data;
    }

}
