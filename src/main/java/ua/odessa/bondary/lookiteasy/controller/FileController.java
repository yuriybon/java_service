package ua.odessa.bondary.lookiteasy.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
public class FileController {

    @Value("${image.path}")
    String imagePath;

    @GetMapping("/files")
    public List<Path> getFiles() throws IOException {
        try (Stream<Path> filePathStream = Files.walk(Paths.get(imagePath))) {
            return filePathStream.filter(Files::isRegularFile).collect(Collectors.toList());
        }
    }
}
