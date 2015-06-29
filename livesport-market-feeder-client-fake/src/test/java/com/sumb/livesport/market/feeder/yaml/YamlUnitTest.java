package com.sumb.livesport.market.feeder.yaml;

import com.sumb.livesport.market.feeder.client.data.FakeTeam;
import org.junit.BeforeClass;
import org.junit.Test;
import org.yaml.snakeyaml.Yaml;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;

/**
 * @author Erik Möller <mailto:erik.moller@live.com>
 * @since 1.0
 *
 * Used to generate yaml test data files
 */
public class YamlUnitTest {

    private static Yaml yaml = new Yaml();
    private static String PATH = "/Users/erimol/dev/livesport/livesport-market-feeder/livesport-market-feeder-client-fake/src/main/resources/data";
    private static String TEAM_FILE = "teams.yaml";

    @BeforeClass
    public static void beforeClass()  {
    }

    @Test
    public void createTeamsYamlFile() throws IOException {
        /*List<FakeTeam> fakeTeams = new ArrayList<FakeTeam>();

        for (GetTeamResultDto team : teams) {
            fakeTeams.add(createFakeTeam(team));
        }

        yal.dump(fakeTeams, new FileWriter(Paths.get(PATH, TEAM_FILE).toFile()));*/
    }

    @Test
    public void testReadTeamsYamlFile() throws FileNotFoundException {
        Object data = yaml.load(new FileReader(Paths.get(PATH, TEAM_FILE).toFile()));
        List<FakeTeam> teams = (List<FakeTeam>)data;
        for (FakeTeam team : teams) {
            System.out.println(team);
        }
    }

    @Test
    public void createLeaguesYamlFile() {
    }

    @Test
    public void test() {
    }
}
