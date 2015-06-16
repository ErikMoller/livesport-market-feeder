package com.sumb.livesport.market.feeder.client;

import com.sumb.livesport.market.feeder.client.data.FakeTeam;
import com.sumb.livesport.market.feeder.domain.id.MarketTeamId;
import com.sumb.livesport.market.feeder.domain.league.MarketTeam;
import org.yaml.snakeyaml.Yaml;

import java.io.InputStream;
import java.util.*;

/**
 * @author Erik Möller <mailto:erik.moller@live.com>
 * @since 1.0
 */
public class FakeMarketDataClientImpl implements MarketDataClient {

    private Map<String, MarketTeam> teams;
    private Yaml yaml = new Yaml();


    public FakeMarketDataClientImpl() {
        initData();

    }

    @Override
    public MarketTeam getTeam(String name) {
        return teams.get(name);
    }

    @Override
    public Set<MarketTeam> getAllTeams() {
        return new HashSet<MarketTeam>(teams.values());
    }

    private void initData() {
        initTeams();
    }

    private void initTeams() {
        InputStream input = getClass().getClassLoader().getResourceAsStream("data/teams.yaml");
        Object data = yaml.load(input);
        List<FakeTeam> fakeTeams = (List<FakeTeam>)data;
        teams = new HashMap<String, MarketTeam>();
        for (FakeTeam fakeTeam : fakeTeams) {
            String name = fakeTeam.getName();
            teams.put(name, MarketTeam.builder().withId(MarketTeamId.valueOf(fakeTeam.getId())).withName(name).build());
        }
    }
}
