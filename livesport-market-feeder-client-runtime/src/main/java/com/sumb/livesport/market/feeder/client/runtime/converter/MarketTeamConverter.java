package com.sumb.livesport.market.feeder.client.runtime.converter;

import com.github.pabloo99.xmlsoccer.api.dto.GetTeamResultDto;
import com.sumb.livesport.market.feeder.domain.id.MarketTeamId;
import com.sumb.livesport.market.feeder.domain.league.MarketTeam;

/**
 * @author Erik Möller <mailto:erik.moller@live.com>
 * @since 1.0
 */
public class MarketTeamConverter {


    public MarketTeam convert(GetTeamResultDto getTeamResultDto) {
        return MarketTeam.builder()
                .withId(MarketTeamId.valueOf(getTeamResultDto.getTeamId()))
                .withName(getTeamResultDto.getName()).build();
    }
}
