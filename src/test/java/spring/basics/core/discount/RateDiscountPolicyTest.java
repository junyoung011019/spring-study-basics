package spring.basics.core.discount;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import spring.basics.core.member.Grade;
import spring.basics.core.member.Member;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class RateDiscountPolicyTest {

    RateDiscountPolicy discountPolicy = new RateDiscountPolicy();

    @Test
    @DisplayName("VIP는 10% 할인이 적용되어야 한다")
    void vip_o(){
        //given
        Member member = new Member(1L, "홍길동", Grade.VIP);
        //when
        int discountPrice = discountPolicy.discount(member, 20000);
        //then
        assertThat(discountPrice).isEqualTo(2000);
    }

    @Test
    @DisplayName("VIP가 아니면 할인이 적용되지 않아야 한다")
    void vip_x(){
        //given
        Member member = new Member(1L, "홍길동", Grade.BASIC);
        //when
        int discountPrice = discountPolicy.discount(member, 10000);
        //then
        assertThat(discountPrice).isEqualTo(0);
    }


}