package spring.basics.core;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import spring.basics.core.member.MemberRepository;
import spring.basics.core.member.MemoryMemberRepository;

@Configuration
@ComponentScan(
        basePackages = "spring.basics.core",
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)

public class AutoAppConfig {

    @Bean(name="memoryMemberRepository")
    MemberRepository memberRepository(){
        return new MemoryMemberRepository();
    }

}


