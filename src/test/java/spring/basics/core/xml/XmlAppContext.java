package spring.basics.core.xml;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.test.context.support.GenericGroovyXmlContextLoader;
import spring.basics.core.member.MemberService;
import spring.basics.core.member.MemberServiceImpl;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class XmlAppContext {

    @Test
    void XmlAppContext() {
        ApplicationContext ac = new GenericXmlApplicationContext("appConfig.xml");
        MemberService memberService = ac.getBean("memberService", MemberService.class);
        assertThat(memberService).isInstanceOf(MemberService.class);

    }
}
