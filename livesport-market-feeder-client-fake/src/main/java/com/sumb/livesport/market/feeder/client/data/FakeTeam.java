package com.sumb.livesport.market.feeder.client.data;

import com.sumb.livesport.market.feeder.domain.id.MarketTeamId;
import com.sumb.livesport.market.feeder.domain.league.MarketTeam;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/**
 * @author Erik Möller <mailto:erik.moller@live.com>
 * @since 1.0
 */
public class FakeTeam extends YamlData {

    private String name;
    private Integer id;
    private String country;
    private String stadium;

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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getStadium() {
        return stadium;
    }

    public void setStadium(String stadium) {
        this.stadium = stadium;
    }

    public MarketTeam toMarketTeam() {
        return MarketTeam.builder()
                .withId(MarketTeamId.valueOf(id))
                .withName(name).build();
    }
}
