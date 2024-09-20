package utils;

import com.github.javafaker.Faker;
import org.apache.commons.lang3.RandomStringUtils;

public class RandomDataGenerator {

    public static Faker faker = new Faker();

    public static String getRandomDataFor(String dataTypesNames) {
        switch (dataTypesNames) {
            case "firstname":
                return faker.name().firstName();
            case "lastname":
                return faker.name().lastName();
            case "fullname":
                return faker.name().fullName();
            case "country":
                return faker.address().country();
            case "cityname":
                return faker.address().cityName();
            default:
                return "Data type name not available";
        }
    }

    public static String getRandomNumber(int count) {
        return faker.number().digits(count);
    }

    public static int getRandomNumber(int min, int max) {
        return faker.number().numberBetween(min, max);
    }

    public static String getRandomAlphabets(int count) {
        return RandomStringUtils.randomAlphabetic(count);
    }

    public static String getRandomWebsiteName() {
        return "https://" + RandomDataGenerator.getRandomAlphabets(10) + ".com";
    }
}
