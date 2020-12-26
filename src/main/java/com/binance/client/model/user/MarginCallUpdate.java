package com.binance.client.model.user;

import com.binance.client.constant.BinanceApiConstants;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.math.BigDecimal;
import java.util.List;

public class MarginCallUpdate {

    private BigDecimal crossWalletBalance;

    private List<PositionUpdate> positions;

    public List<PositionUpdate> getPositions() { return positions; }

    public void setPositions(List<PositionUpdate> positions) { this.positions = positions; }

    public BigDecimal getCrossWalletBalance() { return crossWalletBalance; }

    public void setCrossWalletBalance(BigDecimal crossWalletBalance) { this.crossWalletBalance = crossWalletBalance; }

    @Override
    public String toString() {
        return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE)
                .append("crossWalletBalance", crossWalletBalance)
                .append("positions", positions).toString();
    }
}
