package misc;

import io.github.humbleui.jwm.Event;
import io.github.humbleui.jwm.EventMouseMove;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Класс двумерного вектора int
 */
public class Vector2i {
    /**
     * x - координата вектора
     */
    public int x;
    /**
     * y - координата вектора
     */
    public int y;

    /**
     * Конструктор вектора
     *
     * @param x координата X вектора
     * @param y координата Y вектора
     */
    public Vector2i(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Конструктор вектора от события
     *
     * @param e событие
     */
    public Vector2i(Event e) {
        // если событие кнопка мыши
        if (e instanceof EventMouseMove ee) {
            this.x = ee.getX();
            this.y = ee.getY();
        }
    }

    /**
     * Сложить два вектора
     *
     * @param a первый вектор
     * @param b второй вектор
     * @return сумма двух векторов
     */
    public static Vector2i sum(Vector2i a, Vector2i b) {
        return new Vector2i(a.x + b.x, a.y + b.y);
    }

    /**
     * Добавить вектор к текущему вектору
     *
     * @param v вектор, который нужно добавить
     */
    public void add(Vector2i v) {
        this.x = this.x + v.x;
        this.y = this.y + v.y;
    }

    /**
     * Вычесть второй вектор из первого
     *
     * @param a первый вектор
     * @param b второй вектор
     * @return разность двух векторов
     */
    public static Vector2i subtract(Vector2i a, Vector2i b) {
        return new Vector2i(a.x - b.x, a.y - b.y);
    }
    /**
     * Умножение вектора на число
     *
     * @param v вектор
     * @param s число
     * @return результат умножения
     */
    public static Vector2i mult(Vector2i v, int s) {
        return new Vector2i(v.x * s, v.y * s);
    }
    /**
     * Получить случайное значение в заданном диапазоне [min,max)
     *
     * @param min нижняя граница
     * @param max верхняя граница
     * @return случайное значение в заданном диапазоне [min,max)
     */
    public static Vector2i rand(Vector2i min, Vector2i max) {
        return new Vector2i(
                ThreadLocalRandom.current().nextInt(min.x, max.x),
                ThreadLocalRandom.current().nextInt(min.y, max.y)
        );
    }

    /**
     * Увеличить каждую из координат на 1
     */
    public void inc() {
        this.x++;
        this.y++;
    }

    /**
     * уменьшить каждую из координат на 1
     */
    public void dec() {
        this.x--;
        this.y--;
    }

    /**
     * Получить длину вектора
     *
     * @return длина вектора
     */
    public double length() {
        return Math.sqrt(x * x + y * y);
    }

    /**
     * Строковое представление объекта
     *
     * @return строковое представление объекта
     */
    @Override
    public String toString() {
        return "(" + x +
                ", " + y +
                ')';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vector2i vector2i = (Vector2i) o;

        if (x != vector2i.x) return false;
        return y == vector2i.y;
    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }
}

