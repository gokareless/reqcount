package org.gokareless.examples.aspects;

import org.gokareless.examples.aspects.aspect.Counter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {

    @Bean
    public Counter counter() {
        return new Counter();
    }
}
