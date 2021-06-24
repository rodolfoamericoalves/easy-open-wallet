package com.easyopenwallet.portfolio.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@RequiredArgsConstructor
@Setter
@Getter
public class WarningValue {

    private BigDecimal upperValue;
    private BigDecimal lowerValue;
}
