package com.onbelay.shared.codes.model;

import com.onbelay.core.codes.model.AbstractCodeEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "CURRENCY_CODE")
public class CurrencyCodeEntity extends AbstractCodeEntity {

    public static String codeFamily = "currencyCode";

}
