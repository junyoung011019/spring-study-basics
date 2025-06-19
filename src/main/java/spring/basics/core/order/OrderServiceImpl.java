package spring.basics.core.order;

import spring.basics.core.discount.DiscountPolicy;
import spring.basics.core.discount.FixDiscountPolicy;
import spring.basics.core.discount.RateDiscountPolicy;
import spring.basics.core.member.*;

import java.util.HashMap;
import java.util.Map;

public class OrderServiceImpl implements OrderService{

    private final MemberRepository memberRepository;
    private final DiscountPolicy discountPolicy;

    public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }



}
