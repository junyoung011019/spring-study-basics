package spring.basics.core.order;

import spring.basics.core.member.Member;

public interface OrderService {

    Order createOrder(Long memberId, String itemName, int itemPrice);

}
