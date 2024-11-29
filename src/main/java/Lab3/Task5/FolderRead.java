package Lab3.Task5;

import java.io.File;

public class FolderRead {

    public File[] readDirectory(String folderPath) {
        File folder = new File(folderPath);
        if (!folder.exists()) {
            System.out.println("Directory does not exist: " + folderPath);  // Debug print
            return new File[0];  // Return an empty array if directory does not exist
        }
        File[] list = folder.listFiles((dir, name) -> name.endsWith(".json"));
        if (list == null || list.length == 0) {
            System.out.println("No .json files found in the directory: " + folderPath);  // Debug print
        }
        return list;
    }

}