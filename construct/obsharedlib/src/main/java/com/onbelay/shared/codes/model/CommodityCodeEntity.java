package com.onbelay.shared.codes.model;

import com.onbelay.core.codes.model.AbstractCodeEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "COMMODITY_CODE")
public class CommodityCodeEntity extends AbstractCodeEntity {

    public static String codeFamily = "commodityCode";

}
