package app;

import lombok.Getter;
import misc.Vector2d;

import java.util.Objects;

public class Straight {

    @Getter
    private final Vector2d posA;
    @Getter
    private final Vector2d posB;

    public Straight(Vector2d posA, Vector2d posB) {
        this.posA = posA;
        this.posB = posB;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Straight straight = (Straight) o;
        return Objects.equals(posA, straight.posA) && Objects.equals(posB, straight.posB);
    }

    @Override
    public int hashCode() {
        return Objects.hash(posA, posB);
    }
}
