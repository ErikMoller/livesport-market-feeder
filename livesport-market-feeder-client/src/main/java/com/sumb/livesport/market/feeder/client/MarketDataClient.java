package com.sumb.livesport.market.feeder.client;

import com.sumb.livesport.market.feeder.domain.league.MarketTeam;

import java.util.Set;

/**
 * @author Erik Möller <mailto:erik.moller@live.com>
 * @since 1.0
 */
public interface MarketDataClient {

    MarketTeam getTeam(String name);

    Set<MarketTeam> getAllTeams();


}
