package com.onbelay.shared.codes.model;

import com.onbelay.core.codes.model.CodeManager;
import com.onbelay.core.codes.repository.CodeRepository;
import com.onbelay.core.codes.snapshot.CodeLabel;
import com.onbelay.shared.test.SharedSpringTestCase;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CodesTest extends SharedSpringTestCase {

    @Autowired
    private CodeRepository codeRepository;

    @Autowired
    private CodeManager codeManager ;

    @Override
    public void setUp() {
        super.setUp();
    }

    @Test
    public void testBuySellCode() {

        List<CodeLabel> codeLabels = codeManager.findCodeLabels(BuySellCodeEntity.codeFamily);
        assertEquals(2, codeLabels.size());
    }

    @Test
    public void testCommodityCode() {

        List<CodeLabel> codeLabels = codeManager.findCodeLabels(CommodityCodeEntity.codeFamily);
        assertEquals(2, codeLabels.size());
    }

    @Test
    public void testCurrencyCode() {

        List<CodeLabel> codeLabels = codeManager.findCodeLabels(CurrencyCodeEntity.codeFamily);
        assertEquals(3, codeLabels.size());
    }


    @Test
    public void testFrequencyCode() {

        List<CodeLabel> codeLabels = codeManager.findCodeLabels(FrequencyCodeEntity.codeFamily);
        assertEquals(3, codeLabels.size());
    }

    @Test
    public void testUnitOfMeasureCode() {

        List<CodeLabel> codeLabels = codeManager.findCodeLabels(UnitOfMeasureCodeEntity.codeFamily);
        assertEquals(3, codeLabels.size());
    }


}
