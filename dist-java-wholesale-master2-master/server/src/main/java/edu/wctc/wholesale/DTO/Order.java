package edu.wctc.wholesale.DTO;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class Order
{

    private String customerName;
    private LocalDateTime purchaseDate;
    private String purchaseOrderNumber;
    private String productName;
    private String terms;
    private LocalDateTime shippedDate;
    private double productCost;

}
