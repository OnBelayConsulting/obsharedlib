package com.onbelay.shared.codes.model;

import com.onbelay.core.codes.model.AbstractCodeEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "BUY_SELL_CODE")
public class BuySellCodeEntity extends AbstractCodeEntity {

    public static String codeFamily = "buySellCode";

}
