package com.sumb.market.feeder.common.test;

import com.sumb.livesport.market.feeder.client.MarketDataClient;
import com.sumb.livesport.market.feeder.domain.league.MarketTeam;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Erik Möller <mailto:erik.moller@live.com>
 * @since 1.0
 */
public abstract class AbstractMarketFeederClientTest {

    protected abstract MarketDataClient getClient();

    @Test
    @Ignore
    public void testGetCeltic() {
        MarketTeam team = getClient().getTeam("Celtic");
        assertEquals(team.getName(), "Celtic");

    }
}
