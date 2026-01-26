package Model;
import java.sql.Time;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class ScoreRecord {
    private int score;
    private long time;

    public ScoreRecord(int score) {
        if (score < 0) {
            this.score = 0;
        }
        this.score = score;
        this.time = System.currentTimeMillis();
    }

    public ScoreRecord(int score, long time) {
        if (score < 0) {
            this.score = 0;
        }
        this.time = time;
    }

    public int getScore() {
        return score;
    }

    public LocalDateTime getTime() {
        return LocalDateTime.ofEpochSecond((this.time/1000), 0 , ZoneOffset.UTC);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(score);
        sb.append("\n");
        sb.append(getTime());
        return sb.toString();
    }
}
