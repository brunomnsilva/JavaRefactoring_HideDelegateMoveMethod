package pt.pa.refactoring.C_identify_codesmells;

public class Main {
    public static void main(String[] args) {
        Figure figure = new Figure();

        figure.addLine(new Line(new Point(1,2),new Point(0,0)));
        figure.addLine(new Line(new Point(0,0),new Point(-1,-2)));
        figure.addLine(new Line(new Point(0,0),new Point(7,3)));

        System.out.println("Figure: "+ figure);

        figure.move(5, 2);

        System.out.println("Figure: "+ figure);
    }
}
