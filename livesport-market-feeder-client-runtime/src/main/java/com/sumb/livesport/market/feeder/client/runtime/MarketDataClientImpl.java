package com.sumb.livesport.market.feeder.client.runtime;

import com.github.pabloo99.xmlsoccer.api.dto.GetTeamResultDto;
import com.github.pabloo99.xmlsoccer.api.service.XmlSoccerService;
import com.github.pabloo99.xmlsoccer.client.XmlSoccerServiceImpl;
import com.sumb.livesport.market.feeder.client.MarketDataClient;
import com.sumb.livesport.market.feeder.client.runtime.converter.MarketTeamConverter;
import com.sumb.livesport.market.feeder.domain.id.MarketTeamId;
import com.sumb.livesport.market.feeder.domain.league.MarketTeam;
import org.junit.Ignore;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Erik Möller <mailto:erik.moller@live.com>
 * @since 1.0
 */
public class MarketDataClientImpl implements MarketDataClient {


    private final XmlSoccerService xmlSoccerService;
    private final MarketTeamConverter marketTeamConverter = new MarketTeamConverter();


    public MarketDataClientImpl() {
        xmlSoccerService = new XmlSoccerServiceImpl();
        xmlSoccerService.setApiKey("EDMYCWBMLOPMRVUDPWSXSHMTYRBBIXFOVBNTYKOLNEQVOELZRV");
        // demo access
        xmlSoccerService.setServiceUrl("http://www.xmlsoccer.com/FootballDataDemo.asmx");
    }


    @Override
    public MarketTeam getTeam(String name) {
        GetTeamResultDto getTeamResultDto = xmlSoccerService.getTeam("Celtic");
        return marketTeamConverter.convert(getTeamResultDto);
    }

    @Override
    public Set<MarketTeam> getAllTeams() {
        List<GetTeamResultDto> teams = xmlSoccerService.getAllTeams();
        Set<MarketTeam> marketTeams = new HashSet<MarketTeam>();
        for (GetTeamResultDto team : teams) {
            marketTeams.add(createMarketTeam(team));
        }
        return marketTeams;
    }

    private MarketTeam createMarketTeam(GetTeamResultDto team) {
        return MarketTeam.builder().withId(MarketTeamId.valueOf(team.getTeamId())).withName(team.getName()).build();


    }
}
