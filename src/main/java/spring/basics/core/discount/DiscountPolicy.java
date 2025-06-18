package spring.basics.core.discount;

import spring.basics.core.member.Member;
import spring.basics.core.order.Order;

public interface DiscountPolicy {
    //할인 금액 리턴
    int discount(Member member, int price);
}
