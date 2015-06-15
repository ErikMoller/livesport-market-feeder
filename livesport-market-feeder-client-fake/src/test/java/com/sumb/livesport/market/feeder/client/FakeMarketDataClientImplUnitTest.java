package com.sumb.livesport.market.feeder.client;

import com.sumb.market.feeder.common.test.AbstractMarketFeederClientTest;

/**
 * @author Erik Möller <mailto:erik.moller@live.com>
 * @since 1.0
 */
public class FakeMarketDataClientImplUnitTest extends AbstractMarketFeederClientTest {

    @Override
    protected MarketDataClient getClient() {
        return new FakeMarketDataClientImpl();
    }
}
