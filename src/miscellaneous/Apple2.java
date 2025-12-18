package miscellaneous;

public enum Apple2 {

    Jonathan(10), GoldenDel(12), Cortland(15), RedSap;
    int price;

    Apple2(int price) {
        this.price = price;
    }

    Apple2() {
        this.price = -1;
    }

    int getPrice() {
        return price;
    }
}
