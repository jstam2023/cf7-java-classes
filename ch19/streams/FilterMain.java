package gr.aueb.cf.ch19.streams;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FilterMain {

    public static void main(String[] args) {
        List<String> cities = List.of("Athens", "London", "Toronto", "Tunis");

        var tCities = cities.stream()
                .filter(city -> city.startsWith("T"))
                .collect(Collectors.toList());      // Java8 +, mutable List

        var tCities2 = cities.stream()
                .filter(city -> city.startsWith("T"))
                .toList();                          // Java16+, immutable List

        tCities.forEach(System.out::println);

        var tCities3 = cities.stream()
                .filter(city -> city.length() >= 6)
                .toList();                          // Java16+, immutable List

        tCities.forEach(System.out::println);


        Set<String> uniqueCityNames = cities.stream().collect(Collectors.toSet());
        //Set<String> uniqueCityNames = new HashSet<>(cities);

        uniqueCityNames.forEach(System.out::println);

        var strCities = cities.stream()
                .collect(Collectors.joining(", "));

        //String strCities = String.join(", ", cities);


        System.out.println(strCities);





    }//end main
}
