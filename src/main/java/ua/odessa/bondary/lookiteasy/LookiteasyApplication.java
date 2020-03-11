package ua.odessa.bondary.lookiteasy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ua.odessa.bondary.lookiteasy.domain.Car;
import ua.odessa.bondary.lookiteasy.repository.CarRepository;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

@SpringBootApplication
public class LookiteasyApplication {

	@Value("${image.path}")
	public static String imagesPath;

	public static void main(String[] args) {
		SpringApplication.run(LookiteasyApplication.class, args);
	}

	@Bean
	ApplicationRunner init(CarRepository repository) {
		return args -> {
			Stream.of("Ferrari", "Jaguar", "Porsche", "Lamborghini", "Bugatti",
					"AMC Gremlin", "Triumph Stag", "Ford Pinto", "Yugo GV", "Lada").forEach(name -> {
				Car car = new Car();
				car.setName(name);

				repository.save(car);
			});
			repository.findAll().forEach(System.out::println);

			System.out.println("image path:"+imagesPath);

			if (imagesPath == null)
				return;

			try (Stream<Path> paths = Files.walk(Paths.get(imagesPath))) {
				paths
						.filter(Files::isRegularFile)
						.forEach(System.out::println);
			}


		};
	}

}
