package spring.basics.core;

import spring.basics.core.discount.DiscountPolicy;
import spring.basics.core.discount.FixDiscountPolicy;
import spring.basics.core.discount.RateDiscountPolicy;
import spring.basics.core.member.MemberRepository;
import spring.basics.core.member.MemberService;
import spring.basics.core.member.MemberServiceImpl;
import spring.basics.core.member.MemoryMemberRepository;
import spring.basics.core.order.OrderService;
import spring.basics.core.order.OrderServiceImpl;

public class AppConfig {

    public MemberService memberService(){
        return new MemberServiceImpl(memberRepository());
    }

    private static MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    public OrderService orderService(){
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    public DiscountPolicy discountPolicy(){
        return new RateDiscountPolicy();
    }

}
