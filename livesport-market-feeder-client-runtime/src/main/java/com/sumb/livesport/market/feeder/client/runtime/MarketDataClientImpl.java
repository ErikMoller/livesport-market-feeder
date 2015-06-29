package com.sumb.livesport.market.feeder.client.runtime;

import com.sumb.livesport.market.feeder.client.MarketDataClient;
import com.sumb.livesport.market.feeder.client.runtime.converter.MarketTeamConverter;
import com.sumb.livesport.market.feeder.domain.league.MarketTeam;

import java.util.Set;

/**
 * @author Erik Möller <mailto:erik.moller@live.com>
 * @since 1.0
 */
public class MarketDataClientImpl implements MarketDataClient {


    private final MarketTeamConverter marketTeamConverter = new MarketTeamConverter();


    public MarketDataClientImpl() {
    }


    @Override
    public MarketTeam getTeam(String name) {
        return null;
    }

    @Override
    public Set<MarketTeam> getAllTeams() {
        return null;
    }

}
