package utils;

public class MessageUtil {

    public static String setResultScript(int ballCount, int strikeCount) {
        return (setBallCount(ballCount) + " " + setStrikeCount(strikeCount)).trim();
    }

    private static String setBallCount(int ballCount) {
        String ball = "";
        if(ballCount > 0) {
            ball = ballCount + Message.BALL.getValue();
        }
        return ball;
    }

    private static String setStrikeCount(int strikeCount) {
        String strike = "";
        if(strikeCount > 0) {
            strike = strikeCount + Message.STRIKE.getValue();
        }
        return strike;
    }
}
