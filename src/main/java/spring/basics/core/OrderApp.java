package spring.basics.core;

import spring.basics.core.member.Grade;
import spring.basics.core.member.Member;
import spring.basics.core.member.MemberService;
import spring.basics.core.member.MemberServiceImpl;
import spring.basics.core.order.Order;
import spring.basics.core.order.OrderService;
import spring.basics.core.order.OrderServiceImpl;

public class OrderApp {
    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();

        MemberService memberService = appConfig.memberService();
        OrderService orderService = appConfig.orderService();

        Long memberId = 1L;
        Member member = new Member(memberId, "홍길동", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "신발", 129000);
        System.out.println("order.toString() = " + order.toString());
        System.out.println("order.calculatePrice() = " + order.calculatePrice());
    }
}
