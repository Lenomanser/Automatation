package Task_7;

interface Properties {

    public void perimeter();
    public void corners();
}

class triangle implements Properties {
    private int side1, side2, side3;

    triangle(int Side1, int Side2, int Side3) {

        this.side1 = Side1;
        this.side2 = Side2;
        this.side3 = Side3;
    }

    public void perimeter() {
        System.out.print("Perimeter of triangle = " + (side1 + side2 + side3));
    }

    public void corners() {
        System.out.println(" (3 corner)");
    }
}

class square implements Properties {
    private int side;

    square(int Side) {
        this.side = Side;
    }

    public void perimeter() {
        System.out.print("Perimeter of square= " + (side * 4));
    }

    public void corners() {
        System.out.println("  (4 corner)");
    }
}

class regular_hexagon implements Properties {
    private int side;

    regular_hexagon(int Side) {
        this.side = Side;
    }

    public void perimeter() {
        System.out.print("Perimeter of hexagon= " + (side * 6));
    }

    public void corners() {
        System.out.println("  (6 corners )");
    }
}

public class task_7 {
    public static void main(String[] args) {
        triangle tr = new triangle(6, 4, 3);
        tr.perimeter();
        tr.corners();
        square sq = new square(4);
        sq.perimeter();
        sq.corners();
        regular_hexagon hex = new regular_hexagon(10);
        hex.perimeter();
        hex.corners();


    }
}
