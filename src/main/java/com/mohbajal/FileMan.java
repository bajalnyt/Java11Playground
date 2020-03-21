package com.mohbajal;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileMan {


        public static void main(String[] args) {
            try {
                Path path = Paths.get("/tmp/TRR-20190909.zyXiu4xkDC.008.CSV");
                Stream<String> lines = Files.lines(path);
                List<String> replaced = lines.map(line -> line.replaceAll("\"", "")).collect(Collectors.toList());
                Files.write(path, replaced);
                lines.close();
                System.out.println("Find and Replace done!!!");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
}
