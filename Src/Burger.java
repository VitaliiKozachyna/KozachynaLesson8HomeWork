public class Burger {
    String bun;
    String meat;
    String cheese;
    String salad;
    String mayonnaise;


    public Burger(String bun, boolean doubleMeat, String cheese, String salad, String mayonnaise) {
        this.bun = bun;
        this.cheese = cheese;
        this.salad = salad;
        this.mayonnaise = mayonnaise;
        if(doubleMeat) {
            this.meat = "Подвійне м'ясо";
            System.out.printf("Бургер з подвійним м'ясом.\t Склад: %s, %s, %s, %s, %s%n",
                    this.bun, this.meat, this.cheese, this.salad, this.mayonnaise);
        } else {
            System.out.println("Додайте подвійне м'ясо для бургера з подвійним м'ясом!!!");
        }
    }

    public Burger(String bun, String meat, String cheese, String salad, String mayonnaise) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.salad = salad;
        this.mayonnaise = mayonnaise;
        System.out.printf("Звичайний бургер.\t\t\t Склад: %s, %s ,%s, %s, %s%n",
                this.bun, this.meat, this.cheese, this.salad, this.mayonnaise);
    }

    public Burger(String bun, String meat, String cheese, String salad) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.salad = salad;
        System.out.printf("Дієтичний бургер.\t\t\t Склад: %s, %s, %s, %s%n",
                this.bun, this.meat, this.cheese, this.salad);
    }

}
