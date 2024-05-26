package jpabook.jpashop.domain;

import jakarta.persistence.*;

@Entity
public class Delivery {

    @Id
    @GeneratedValue
    private Long id;

    // 배송지 주소
    private String city;
    private String street;
    private String zipcode;

    private DeliveryStatus status; // 배송 상태

    @OneToOne(mappedBy = "delivery")
    private Order order;
}
