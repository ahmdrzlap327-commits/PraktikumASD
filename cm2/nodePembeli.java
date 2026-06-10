package cm2;

public class nodePembeli {
    pembeli data;
    nodePembeli prev;
    nodePembeli next;

    public nodePembeli(pembeli data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
