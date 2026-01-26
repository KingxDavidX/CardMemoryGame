package Controller;
import Model.ScoreRecord;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class FileManager {
    private String filePath = System.getProperty("user.dir") + "\\Data\\Leaderboard.json";
    Gson gson;

    public FileManager() {
        gson = new Gson();
        try {
            Path path = Paths.get(filePath);

            if (!Files.exists(path)) {
                Files.createFile(path);
                System.out.println("File created");
            }
        }
        catch (Exception e) {
            System.out.println("File not loaded!");
        }
    }

    public void saveLeaderboard(ArrayList<ScoreRecord> records) {
        String json = gson.toJson(records);

        try {
            FileWriter fw = new FileWriter(filePath);
            fw.write(json);
            fw.close();
            System.out.println("Leaderboard saved Successfully!");
        }
        catch (IOException e) {
            System.out.println("Error saving leaderboard!");
        }
    }

    public ArrayList<ScoreRecord> getLeaderboard() {
        ArrayList<ScoreRecord> records = new ArrayList<>();

        try {
            Type listType = new TypeToken<ArrayList<ScoreRecord>>(){}.getType();
            records = gson.fromJson(new FileReader(filePath), listType);
        }
        catch (Exception e) {
            System.out.println("Error getting Leaderboard!");
        }
        return records;
    }
}
