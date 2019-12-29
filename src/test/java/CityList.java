import java.util.ArrayList;
import java.util.Random;

public class CityList {

    public static String getRandomCity() {
        ArrayList<String> city = new ArrayList<>();
        city.add("Москва");
        city.add("Волгоград");
        city.add("Грозный");
        city.add("Махачкала");
        city.add("Самара");
        city.add("Ростов-на-Дону");
        city.add("Краснодар");
        city.add("Владивосток");
        city.add("Новосибирск");

        Random random = new Random();
        return city.get(random.nextInt(city.size()));
    }
}