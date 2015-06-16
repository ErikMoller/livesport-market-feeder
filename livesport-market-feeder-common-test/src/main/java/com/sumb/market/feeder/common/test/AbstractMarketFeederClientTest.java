package com.sumb.market.feeder.common.test;

import com.sumb.livesport.market.feeder.client.MarketDataClient;
import com.sumb.livesport.market.feeder.domain.league.MarketTeam;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * @author Erik Möller <mailto:erik.moller@live.com>
 * @since 1.0
 */
public abstract class AbstractMarketFeederClientTest {

    protected abstract MarketDataClient getClient();

    @Test
    public void testGetCeltic() {
        MarketTeam team = getClient().getTeam("Celtic");
        assertEquals(team.getName(), "Celtic");
    }

    @Test
    public void testGetAllTeams() {
        Set<MarketTeam> teams = getClient().getAllTeams();
        assertTrue(teams.size() == 36);
    }
}
