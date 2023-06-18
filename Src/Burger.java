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
        if(!doubleMeat) {
            this.meat = "М'ясо";
            System.out.printf("Звичайний бургер.\t\t\t Склад: %s, %s, %s, %s, %s, %n",
                    this.bun, this.meat, this.cheese, this.salad, this.mayonnaise);
        } else {
            this.meat = "Подвійне м'ясо";
            System.out.printf("Бургер з подвійним м'ясом.\t Склад: %s, %s, %s, %s, %s, %n",
                    this.bun, this.meat, this.cheese, this.salad, this.mayonnaise);
        }
    }

    public Burger(String bun, String meat, String cheese, String salad) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.salad = salad;
        System.out.printf("Дієтичний бургер.\t\t\t Склад: %s, %s, %s, %s, %n",
                this.bun, this.meat, this.cheese, this.salad);
    }



    @Override
    public String toString() {
        return "Burger{" +
                "bun='" + bun + '\'' +
                ", meat='" + meat + '\'' +
                ", cheese='" + cheese + '\'' +
                ", salad='" + salad + '\'' +
                ", mayonnaise='" + mayonnaise + '\'' +
                '}';
    }
}
