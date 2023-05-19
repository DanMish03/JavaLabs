package org.example.controller;

import com.google.gson.Gson;
import org.example.model.University;

import java.io.*;

public class JsonManager {
    private Gson gson;

    public JsonManager() {
        this.gson = new Gson();
    }

    public void writeUniversityToJsonFile(University university, String filePath) {
        try (Writer writer = new FileWriter(filePath)) {
            gson.toJson(university, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public University readUniversityFromJsonFile(String filePath) {
        try (Reader reader = new FileReader(filePath)) {
            return gson.fromJson(reader, University.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
