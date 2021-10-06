package edu.wctc.wholesale.service;

import edu.wctc.wholesale.entity.WholesaleOrder;
import edu.wctc.wholesale.repo.WholesaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BasicWholesaleService implements WholesaleService
{
    private WholesaleRepository wholesaleRepository;

    @Autowired
    public BasicWholesaleService(WholesaleRepository wr)
    {
        wholesaleRepository = wr;
    }

    @Override
    public WholesaleOrder getWholesaleOrder(int wholesaleOrderId)
    {
        Optional<WholesaleOrder> w = wholesaleRepository.findById(wholesaleOrderId);
        if(w.isPresent())
        {
            return w.get();
        }

        return null;
    }

    @Override
    public List<WholesaleOrder> getWholesaleOrderList()
    {
        List<WholesaleOrder> list = new ArrayList<>();
        wholesaleRepository.findAll().forEach(list::add);
        return list;
    }
}
