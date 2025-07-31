package io.github.equinoxelectronic.equinox_essentials.source;

import com.google.gson.Gson;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Getter {
    public Object readJson(String path) {
        try (FileReader reader = new FileReader(path)) {
            return new Gson().fromJson(reader, Object.class);
        } catch (IOException e) {
            throw new RuntimeException("Failed to read JSON file", e);
        }
    }

    public void writeJson(String path, Object data) {
        try (FileWriter writer = new FileWriter(path)) {
            new Gson().toJson(data, writer);
        } catch (IOException e) {
            throw new RuntimeException("Failed to write JSON file", e);
        }
    }
}
