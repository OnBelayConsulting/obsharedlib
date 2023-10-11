package com.onbelay.shared.codes.model;

import com.onbelay.core.codes.model.CodeManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class SharedCodeManagerConfig {

    @Primary
    @Bean
    public CodeManager codeManager() {
        return new SharedCodeManagerBean();
    }

}
