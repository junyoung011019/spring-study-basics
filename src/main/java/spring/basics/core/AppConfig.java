package spring.basics.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring.basics.core.discount.DiscountPolicy;
import spring.basics.core.discount.FixDiscountPolicy;
import spring.basics.core.discount.RateDiscountPolicy;
import spring.basics.core.member.MemberRepository;
import spring.basics.core.member.MemberService;
import spring.basics.core.member.MemberServiceImpl;
import spring.basics.core.member.MemoryMemberRepository;
import spring.basics.core.order.OrderService;
import spring.basics.core.order.OrderServiceImpl;

@Configuration
public class AppConfig {

    @Bean
    public MemberService memberService(){
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    private static MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    @Bean
    public OrderService orderService(){
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    @Bean
    public DiscountPolicy discountPolicy(){
        return new RateDiscountPolicy();
    }

}
