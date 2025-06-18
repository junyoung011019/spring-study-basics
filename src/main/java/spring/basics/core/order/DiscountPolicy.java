package spring.basics.core.order;

import spring.basics.core.member.Member;

public interface DiscountPolicy {

    Order discount(Order order);
}
