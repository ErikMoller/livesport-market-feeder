package com.sumb.livesport.market.feeder.domain.id;

/**
 * @author Erik Möller <mailto:erik.moller@live.com>
 * @since 1.0
 */
public final class MarketTeamId extends IntegerId {

    private final static long serialVersionUID = 1L;

    public static MarketTeamId valueOf(Integer id) {
        return new MarketTeamId(id);
    }

    private MarketTeamId(Integer id) {
        super(id);
    }

}
