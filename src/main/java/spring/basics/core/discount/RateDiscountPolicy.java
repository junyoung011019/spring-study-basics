package spring.basics.core.discount;

import spring.basics.core.member.Grade;
import spring.basics.core.member.Member;
import spring.basics.core.member.MemberRepository;
import spring.basics.core.member.MemoryMemberRepository;
import spring.basics.core.order.Order;

public class RateDiscountPolicy implements DiscountPolicy{

    @Override
    public int discount(Member member, int price) {
        if(member.getGrade() == Grade.VIP){
            return price*=0.1;
        }
        return 0;
    }
}
