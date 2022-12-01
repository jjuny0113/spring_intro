package start.firstspringproject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import start.firstspringproject.repository.MemberRepository;
import start.firstspringproject.repository.MemoryMemberRepository;
import start.firstspringproject.service.MemberService;

@Configuration
public class SpringConfig {

//    @Bean
//    public MemberService memberService(){
//        return new MemberService(memberRepository());
//    }
//
//    @Bean
//
//    public MemberRepository memberRepository(){
//        return new MemoryMemberRepository();
//    }
}
