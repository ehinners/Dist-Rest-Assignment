package edu.wctc.wholesale.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@NoArgsConstructor
@Table(name="product")
public class Product
{
    @Id
    @Column(name="product_id")
    private int productId;

    @Column(name="name")
    private String name;

    @Column(name = "cost")
    private double cost;
    /*
create table product
(
    product_id int,
    name varchar(200) not null,
    cost double not null,
    constraint product_pk
        primary key (product_id)
);

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
