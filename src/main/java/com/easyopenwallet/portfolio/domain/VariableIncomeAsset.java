package com.easyopenwallet.portfolio.domain;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;

@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public class VariableIncomeAsset extends Asset {

    private VariableIncomeDomain type;
    private long quantity;
    private BigDecimal sellingPrice;
    private WarningValue warningValue;
}
