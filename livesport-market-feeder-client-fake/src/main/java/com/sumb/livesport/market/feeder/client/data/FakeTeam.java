package com.sumb.livesport.market.feeder.client.data;

import com.sumb.livesport.market.feeder.domain.id.MarketTeamId;
import com.sumb.livesport.market.feeder.domain.league.MarketTeam;

/**
 * @author Erik Möller <mailto:erik.moller@live.com>
 * @since 1.0
 */
public class FakeTeam {

    private String name;
    private Integer id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public MarketTeam toMarketTeam() {
        return MarketTeam.builder()
                .withId(MarketTeamId.valueOf(id))
                .withName(name).build();
    }
}
