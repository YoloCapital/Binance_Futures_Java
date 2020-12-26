package com.binance.client.model.user;

import com.binance.client.constant.BinanceApiConstants;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.List;

public class AccountUpdate {

    private String eventReasonType;

    private List<BalanceUpdate> balances;

    private List<PositionUpdate> positions;

    public String getEventReasonType() { return eventReasonType; }

    public void setEventReasonType(String eventReasonType) { this.eventReasonType = eventReasonType; }

    public List<BalanceUpdate> getBalances() {
        return balances;
    }

    public void setBalances(List<BalanceUpdate> balances) {
        this.balances = balances;
    }

    public List<PositionUpdate> getPositions() {
        return positions;
    }

    public void setPositions(List<PositionUpdate> positions) {
        this.positions = positions;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE)
                .append("eventReason", eventReasonType)
                .append("balances", balances)
                .append("positions", positions).toString();
    }
}
