/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class VendingMachine {

    public VendingMachine() {
    }

    // 师傅这个要是你写你咋写啊？ 我只能传递进去一个 Product 的 instance 进去
    // 老师不让这么写，老师让传递进去一个 Type
    public Product buy_product(Product product) {
        if (product.getClass().equals(Drink.class)) {
            return new Drink();
        }
        else {
            throw new IllegalArgumentException("Type is not Drink!!!");
        }

    }

    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();
        machine.buy_product(new Drink());


    }
}

// Product 类 有两个子类，Drink 和 SomethingElse

class Product {
    public Product() {
    }

    public String toString() {
        return "This is Parent Class";
    }

}

class Drink extends Product {
    public Drink() {
        super();
    }

    @Override
    public String toString() {
        return "This is Child Class";
    }
}

class SomethingElse extends Product {
    public SomethingElse() {
        super();
    }
}
