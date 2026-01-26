package Model;
import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

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
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        StringBuilder sb = new StringBuilder();
        sb.append("Score: " + score + " | " + dateFormat.format(getTime()) + " |");
        return sb.toString();
    }
}
