package spring.basics.core.order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import spring.basics.core.AppConfig;
import spring.basics.core.member.Grade;
import spring.basics.core.member.Member;
import spring.basics.core.member.MemberService;
import spring.basics.core.member.MemberServiceImpl;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class OrderServiceTest {

    OrderService orderService;
    MemberService memberService;

    @BeforeEach
    public void beforeEach(){
        AppConfig appConfig = new AppConfig();
        orderService = appConfig.orderService();
        memberService = appConfig.memberService();
    }

    @Test
    void 주문생성(){
        //given
        Long memberId = 1L;
        Member member = new Member(memberId, "홍길동", Grade.VIP);
        memberService.join(member);

        //when
        Order order = orderService.createOrder(1L, "신발", 129000);

        //then
        assertThat(order.getDiscountPrice()).isEqualTo(12900);
    }
}