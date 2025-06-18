package spring.basics.core.order;

import spring.basics.core.member.Member;

public interface OrderService {

    void create(Order order);
    Member findMember(Long memberId);
    Order discount(Order order);
    Order send(Member member);

}
