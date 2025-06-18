package spring.basics.core.order;

import spring.basics.core.member.Grade;
import spring.basics.core.member.MemberRepository;
import spring.basics.core.member.MemoryMemberRepository;

public class RateDiscountPolicy implements DiscountPolicy{

    MemberRepository memberRepository = new MemoryMemberRepository();

    @Override
    public Order discount(Order order) {
        Grade grade = memberRepository.findById(order.getId()).getGrade();
        if(grade == Grade.VIP){
            order.setPrice(order.getPrice()*0.9);
        }
        return order;
    }
}
