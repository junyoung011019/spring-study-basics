package spring.basics.core.member;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import spring.basics.core.AppConfig;

import static org.assertj.core.api.Assertions.assertThat;

class MemberServiceTest {

    MemberService memberService;

    @BeforeEach
    public void beforeEach(){
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
    }

    @Test
    void 회원가입() {
        //given
        Member member1 = new Member(1L, "홍길동",Grade.BASIC);

        //when
        memberService.join(member1);
        Member findMember = memberService.findMember(member1.getId());

        //then
        assertThat(findMember).isEqualTo(member1);
    }

    @Test
    void 회원조회() {
        //given
        Member member1 = new Member(1L, "홍길동1",Grade.BASIC);
        memberService.join(member1);

        Member member2 = new Member(2L, "홍길동2",Grade.VIP);
        memberService.join(member2);

        //when
        Member findMember = memberService.findMember(member1.getId());

        //then
        assertThat(findMember).isEqualTo(member1);
    }
}