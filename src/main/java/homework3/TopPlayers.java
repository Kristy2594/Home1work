package homework3;

public class TopPlayers {
    public static void main(String[] args) {

        String[] players = new String[10];
        players[0] = "Анатолий";
        players[1] = "Алексей";
        players[2] = "Архип";
        players[3] = "Алена";
        players[4] = "Анастасия";
        players[5] = "Александр";
        players[6] = "Анна";
        players[7] = "Агриппина";
        players[8] = "Артем";
        players[9] = "Арина";

        for (int i = 0; i < 3; i = i + 1) {
            System.out.println(players[i]);
        }
    }
}
