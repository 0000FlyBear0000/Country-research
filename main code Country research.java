import java.util.Scanner;

public class CountryExplorer {
    public static void main(String[] args) {
        // Создание массива стран
        String[] countryNames = {"Russia", "Canada", "China"};
        int[] countryPopulations = {145_934_462, 37_742_154, 1_439_323_776};
        double[] countryAreas = {17.1e6, 9.98e6, 9.597e6};

        // Создание объекта Scanner для ввода данных с клавиатуры
        Scanner scanner = new Scanner(System.in);

        // Вывод списка стран
        System.out.println("Country list:");
        for (int i = 0; i < countryNames.length; i++) {
            System.out.println((i + 1) + ". " + countryNames[i] + " (population: " + countryPopulations[i] + ", area: " + countryAreas[i] + " sq. km)");
        }

        // Ввод номера страны
        System.out.print("Enter the country number: ");
        int countryNumber = scanner.nextInt();

        // Проверка, существует ли страна с заданным номером
        if (countryNumber >= 1 && countryNumber <= countryNames.length) {
            // Вывод информации о стране
            System.out.println("Country name: " + countryNames[countryNumber - 1]);
            System.out.println("Population: " + countryPopulations[countryNumber - 1]);
            System.out.println("Area: " + countryAreas[countryNumber - 1] + " sq. km");
        } else {
            // Вывод сообщения об ошибке
            System.out.println("Error: invalid country number.");
        }
    }
}
