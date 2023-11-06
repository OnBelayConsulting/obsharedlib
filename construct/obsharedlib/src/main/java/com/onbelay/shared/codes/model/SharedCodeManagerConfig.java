package com.onbelay.shared.codes.model;

import com.onbelay.core.codes.model.CodeManager;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SharedCodeManagerConfig implements InitializingBean {

    @Autowired
    private CodeManager codeManager;

    @Override
    public void afterPropertiesSet() throws Exception {
        codeManager.addCodeEntity(CurrencyCodeEntity.codeFamily, "CurrencyCodeEntity");
        codeManager.addCodeEntity(BuySellCodeEntity.codeFamily, "BuySellCodeEntity");

    }
}
