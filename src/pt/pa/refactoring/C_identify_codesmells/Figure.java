package pt.pa.refactoring.C_identify_codesmells;

import java.util.ArrayList;
import java.util.List;

public class Figure {

    private final List<Line> lines;

    public Figure() {
        lines = new ArrayList<>();
    }

    public void addLine(Line line) {
        lines.add(line);
    }

    public void move(int dx, int dy) {
        for (Line l : lines) {
            l.getStart().setX(l.getStart().getX()+dx);
            l.getStart().setY(l.getStart().getY()+dy);
            l.getEnd().setX(l.getEnd().getX()+dx);
            l.getEnd().setY(l.getEnd().getY()+dy);
        }
    }

    public boolean contains(Point point) {

        for (Line l : lines) {
            if ( l.getStart().getX() == point.getX() && l.getStart().getY() == point.getY() )
                return true;
            if ( l.getEnd().getX() == point.getX() && l.getEnd().getY() == point.getY() )
                return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "<" + lines + '>';
    }
}
