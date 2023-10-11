package com.onbelay.shared.codes.model;

import com.onbelay.core.codes.model.CodeManager;
import com.onbelay.core.codes.model.CodeManagerBean;
import com.onbelay.core.codes.repository.CodeRepository;

public class SharedCodeManagerBean extends CodeManagerBean implements CodeManager {

    public SharedCodeManagerBean() {
        initialize();
    }

    private void initialize() {
        addCodeEntity(CurrencyCodeEntity.codeFamily, "CurrencyCodeEntity");
        addCodeEntity(BuySellCodeEntity.codeFamily, "BuySellCodeEntity");
    }


}
