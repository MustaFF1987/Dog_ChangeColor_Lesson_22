public class Dog {

    //создали переменные в классе Dog
String dogName;
String dogColor;
Integer dogAge;

    //cоздали конструктор с помощью клавишь alt+insert
    public Dog(String dogName, String dogColor, Integer dogAge) {
        this.dogName = dogName;
        this.dogColor = dogColor;
        this.dogAge = dogAge;
    }

    //создали методы voice, color, age
    public void voice(){System.out.println("Я собака по имени " + dogName);
    }
    public void color(){System.out.println("Мой цвет " + dogColor );
    }
    public void age(){System.out.println("Мне " + dogAge + " лет!" );
    }
    public void changeColor(){System.out.println("Я поменяла свой цвет на мраморный");
    }
    public void changeColor2(){System.out.println("И мой цвет опять " + dogColor);
    }
}
