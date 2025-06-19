package spring.basics.core.discount;

import spring.basics.core.member.Grade;
import spring.basics.core.member.Member;
import spring.basics.core.member.MemberRepository;
import spring.basics.core.member.MemoryMemberRepository;
import spring.basics.core.order.Order;

public class RateDiscountPolicy implements DiscountPolicy{

    private int discountPercent=10;

    @Override
    public int discount(Member member, int price) {
        if(member.getGrade() == Grade.VIP){
            return price * discountPercent / 100;
        }
        return 0;
    }
}
