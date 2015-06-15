package com.sumb.livesport.market.feeder.yaml;

import com.sumb.livesport.market.feeder.client.data.FakeTeam;
import org.junit.Test;
import org.yaml.snakeyaml.Yaml;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Erik Möller <mailto:erik.moller@live.com>
 * @since 1.0
 */
public class YamlUnitTest {

    private Yaml yaml = new Yaml();


    @Test
    public void test2() {
        FakeTeam fakeTeam = new FakeTeam();
        fakeTeam.setId(2);
        fakeTeam.setName("name");

        FakeTeam fakeTeam2 = new FakeTeam();
        fakeTeam2.setId(3);
        fakeTeam2.setName("name2");

        List<FakeTeam> teams = new ArrayList<FakeTeam>();
        teams.add(fakeTeam);
        teams.add(fakeTeam2);

        System.out.println(yaml.dump(teams));
    }

    @Test
    public void testRead() {
        InputStream input = getClass().getClassLoader().getResourceAsStream("data/teams.yaml");
        Object data = yaml.load(input);
        List<FakeTeam> teams = (List<FakeTeam>)data;
        for (FakeTeam team : teams) {
            System.out.println(team.toMarketTeam().getName());
        }
    }
}
