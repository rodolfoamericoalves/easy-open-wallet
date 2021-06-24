package com.easyopenwallet.portfolio.domain;

import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@RequiredArgsConstructor
public class Portfolio {
    private List<Asset> assets;
    private BigDecimal actualInvestedAmount;
    private BigDecimal investedProfitAmount;
    private BigDecimal currentAssetsValue; //TODO understand the correct place
}
