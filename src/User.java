public class User {
    String name;
    float weight;
    float height;
    int age;
    String hairColor;
    boolean sex;
    boolean isActive = true;

    public User() {
    }

    public User(String name, float weight, float height, int age, String hairColor, boolean sex) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.age = age;
        this.hairColor = hairColor;
        this.sex = sex;
    }

    public void eat() {
        // кушаем
        weight += 0.1f;
        height += 0.0001f;
    }

    public void drink() {
        // пьем
        weight += 0.2f;
    }

    public void walk() {
        // ходим
        weight -= 0.01f;
    }

    public void sleep() {
        // засыпаем
        isActive = false;
    }

    public void awake() {
        // просыпаемся
        isActive = true;
    }
}




