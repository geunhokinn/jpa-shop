package jpabook.jpashop.domain;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "ORDERS") // DB 에 ORDER 가 예약어(order by) 이므로
public class Order {

    @Id
    @GeneratedValue
    @Column(name = "ORDER_ID") // 회사 마다 데이터 베이스 컬럼명을 대문자, 소문자 하는 곳이 다양하다. 규칙을 따르자.
    private Long id;

    @Column(name = "MEMBER_ID")
    private Long memberId;

    // 하이버네이트가 자동으로 데이터 베이스 날짜 타입과 매핑해줌
    private LocalDateTime orderDate;

    @Enumerated(EnumType.STRING)
    private OrderStatus status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }
}
