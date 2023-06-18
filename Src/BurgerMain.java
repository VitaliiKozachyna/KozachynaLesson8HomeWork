public class BurgerMain {
    public static void main(String[] args) {
        Burger ordinaryBurger = new Burger("Булочка", false,
                "Сир", "Зелень", "Майонез");
        Burger dietaryBurger = new Burger("Булочка",
                "М'ясо", "Сир", "Зелень");
        Burger doubleMeatBurger = new Burger("Булочка", true,
                "Сир", "Зелень", "Майонез");

    }
}
