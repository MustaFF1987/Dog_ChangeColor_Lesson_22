import java.util.Scanner;

public class DogDemo {

    public static void main(String[] args) {
        //  создаем экземпляр класса scanner для ввода с клавиатуры
        Scanner scanner = new Scanner(System.in);
        //  создаем экземпляр класса Dog с помощью дефолтного конструктора
        Dog dogDora = new Dog("","",1);
        //  выводим на экран запрос на ввод
        System.out.println("Дайте команду собаке: ");
        //  создаем строку для ввода с клавитуры
        String line1 = scanner.nextLine();
        // присваеваем экземпляру класса переменным значения
        dogDora.dogName = "Dora";
        dogDora.dogAge = 15;
        dogDora.dogColor = "Коричневый";
        // обращаемся к методу экземпляра класса dogDora
        dogDora.voice();
        dogDora.color();
        dogDora.age();

        System.out.println("----------------------");
        //  выводим на экран запрос на ввод
        System.out.println("Дайте команду собаке: ");
        //  создаем строку для ввода с клавитуры
        String line2 = scanner.nextLine();

        // обращаемся к методу экземпляра класса dogDora с новым методом changeColor
        dogDora.voice();
        dogDora.changeColor();
        dogDora.age();

        System.out.println("----------------------");
        //  выводим на экран запрос на ввод
        System.out.println("Дайте команду собаке: ");
        //  создаем строку для ввода с клавитуры
        String line3 = scanner.nextLine();
        // обращаемся к методу экземпляра класса dogDora с новым методом
        dogDora.voice();
        dogDora.changeColor2();
        dogDora.age();
    }
}
