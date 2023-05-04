package app;

import lombok.Getter;
import misc.Vector2d;

import java.util.Objects;

public class Circle {

    @Getter
    private final Vector2d posA;
    @Getter
    private final Vector2d posB;

    public Circle(Vector2d posA, Vector2d posB) {
        this.posA = posA;
        this.posB = posB;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Objects.equals(posA, circle.posA) && Objects.equals(posB, circle.posB);
    }

    @Override
    public int hashCode() {
        return Objects.hash(posA, posB);
    }
}


