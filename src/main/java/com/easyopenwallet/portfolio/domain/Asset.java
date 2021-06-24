package com.easyopenwallet.portfolio.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public abstract class Asset {

    private String name;
    private BigDecimal paidPrice;
    private LocalDateTime dateOfPurchase;
    private BigDecimal paidFee;
    private String vendor;
}
