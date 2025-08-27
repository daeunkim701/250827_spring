package org.example;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // 스프링 설정 클래스
@ComponentScan("org.example")
// com.example.demo
// 컴포넌트 -> Spring은 의존성 주입을 위해 Bean이라는 걸 쓰는데 이걸 위해 지정되어 있는 게 Component
public class AppConfig {
    // @Bean ... ???
}
