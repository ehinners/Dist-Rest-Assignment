package edu.wctc.wholesale.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@Table(name="wholesale_order")
public class WholesaleOrder
{
    @Id
    @Column(name="order_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderId;

    @Column(name="purchase_order_num")
    private String purchaseOrderNumber;

    @Column(name = "terms")
    private String terms;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name="product_id")
    private Product product;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name="customer_id")
    private Customer customer;



    @Column(name="purchase_date")
    private LocalDateTime purchaseDate;

    @Column(name="shipped_date")
    private LocalDateTime shippedDate;

    /*

create table wholesale_order
(
    order_id int auto_increment,
    purchase_order_num varchar(100) not null,
    terms varchar(100) not null,
    customer_id int not null,
    product_id int not null,
    purchase_date timestamp not null,
    shipped_date timestamp,
    constraint order_pk
        primary key (order_id),
    constraint order_customer_customer_id_fk
        foreign key (customer_id) references customer (customer_id),
    constraint order_product_product_id_fk
        foreign key (product_id) references product (product_id)
);*/
}
