package com.binance.client.model.market;

import java.math.BigDecimal;

public class OpenInterest {
    
    private String symbol;
    private BigDecimal openInterest;
    private Long timestamp;

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) { this.symbol = symbol; }

    public BigDecimal getOpenInterest() {
        return openInterest;
    }

    public void setOpenInterest(BigDecimal openInterest) {
        this.openInterest = openInterest;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "OpenInterestStat{" +
                "symbol='" + symbol + '\'' +
                ", openInterest=" + openInterest +
                ", timestamp=" + timestamp +
                '}';
    }
}
