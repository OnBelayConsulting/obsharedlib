package com.onbelay.shared.test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.onbelay.core.entity.persistence.TransactionalSpringTestCase;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

@ComponentScan("com.onbelay")
@EntityScan("com.onbelay.*")
@RunWith(SpringRunner.class)
@TestPropertySource( locations="classpath:application-shared-integrationtest.properties")
@SpringBootTest
@Ignore
public class SharedSpringTestCase extends TransactionalSpringTestCase {

    @Autowired
    protected ObjectMapper objectMapper;

    protected 	MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter;

    @Override
    public void setUp() {
        super.setUp();
        mappingJackson2HttpMessageConverter = new  MappingJackson2HttpMessageConverter();
        mappingJackson2HttpMessageConverter.setObjectMapper(objectMapper);
    }
}
