package hello.hellospring;

import hello.hellospring.aop.TimeTraceAop;
import hello.hellospring.repository.MemberRepository;
import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.sql.Time;

@Configuration

public class SpringConfig {

    private final MemberRepository memberRepository;

    @Autowired
    public SpringConfig(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository);
    }

/*    @Bean //스프링 2.1은 overriding 옵선이 false가 아닌 defalut로 설정되어 bean이 따로 필요 없음
    public TimeTraceAop timeTraceAop(){
        return new TimeTraceAop();
    }*/
//    @Bean
//    public MemberRepository memberRepository(){
        //return new MemoryMemberRepository();
        //return new JdbcMemberRepository(dataSource); // 굉장히 중요 위의 주석 처럼 컨테이너를 변경가능
        //return new JdbcMemberRepository(dataSource);
        //return new JpaMemberRepository(em);

    //}
}
