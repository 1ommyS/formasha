//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        User vanya = new User(
                "Ваня",
                75.0f,
                180.0f,
                20,
                "русый",
                true
        );
        User misha = new User(
                "Миша",
                81.0f,
                180.0f,
                21,
                "черный",
                true
        );

        System.out.println("Вес Вани до приема пищи: " + vanya.weight);
        vanya.eat();
        vanya.eat();
        System.out.println("Вес Вани после приема пищи: " + vanya.weight);

        System.out.println();

        System.out.println("Вес Миши до приема пищи: " + misha.weight);
        misha.eat();
        System.out.println("Вес Миши после приема пищи: " + misha.weight);
    }
}