package spring.basics.core.order;

import org.springframework.beans.factory.annotation.Autowired;
import spring.basics.core.member.*;

import java.util.HashMap;
import java.util.Map;

public class OrderServiceImpl implements OrderService{

    MemberService memberService = new MemberServiceImpl();

    // 정가 할인(1000원)
    DiscountPolicy fixDiscount = new FixDiscountPolicy();

    // 정률 할인(10%)
    // DiscountPolicy rateDiscount = new RateDiscountPolicy();

    Map<Long, Order> store = new HashMap<>();

    @Override
    public void create(Order order) {
        store.put(order.getId(), order);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberService.findMember(memberId);
    }

    @Override
    public Order discount(Order order) {
        return fixDiscount.discount(order);
    }

    @Override
    public Order send(Member member) {
        return store.get(member.getId());
    }

}
