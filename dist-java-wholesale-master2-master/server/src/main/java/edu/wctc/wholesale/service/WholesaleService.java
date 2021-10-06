package edu.wctc.wholesale.service;

import edu.wctc.wholesale.entity.WholesaleOrder;

import java.util.List;

public interface WholesaleService
{
    public WholesaleOrder getWholesaleOrder(int wholesaleOrderId);

    public List<WholesaleOrder> getWholesaleOrderList();
}
