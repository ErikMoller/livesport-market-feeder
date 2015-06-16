package com.sumb.livesport.market.feeder.client.runtime;

import com.sumb.livesport.market.feeder.client.MarketDataClient;
import com.sumb.market.feeder.common.test.AbstractMarketFeederClientTest;
import org.junit.Ignore;

/**
 * @author Erik Möller <mailto:erik.moller@live.com>
 * @since 1.0
 */
@Ignore
public class MarketDataClientImplIntegrationTest extends AbstractMarketFeederClientTest {


    @Override
    protected MarketDataClient getClient() {
        return new MarketDataClientImpl();
    }
}
