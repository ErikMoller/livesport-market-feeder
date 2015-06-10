package com.sumb.livesport.market.feeder.domain.league;

import com.sumb.livesport.market.feeder.domain.id.IdEntity;
import com.sumb.livesport.market.feeder.domain.id.MarketTeamId;

import java.util.Objects;

/**
 * @author Erik Möller <mailto:erik.moller@live.com>
 * @since 1.0
 */
public final class MarketTeam extends IdEntity<MarketTeamId> {

    private final static long serialVersionUID = 1L;

    private final MarketTeamId id;
    private final String name;

    public MarketTeam(Builder builder) {
        this.id = Objects.requireNonNull(builder.id, "id");
        this.name = Objects.requireNonNull(builder.name, "name");
    }


    public MarketTeamId getId() {
        return id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private MarketTeamId id;
        private String name;

        private Builder() {

        }

        public MarketTeam build() {
            return new MarketTeam(this);
        }

        public Builder withId(MarketTeamId id) {
            this.id = id;
            return this;
        }

        public Builder withName(String name) {
            this.name = name;
            return this;
        }
    }
}
