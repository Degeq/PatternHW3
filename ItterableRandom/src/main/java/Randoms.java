import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer>{

    protected Random random;
    protected int min, max;

    public Randoms(int min, int max) {
        if (min > max) {
            throw new IllegalArgumentException("Вы ввели неверный диапазон (минимум должен быть > максимума");
        } else {
            this.random = new Random();
            this.max = max;
            this.min = min;
        }

    }

    @Override
    public Iterator<Integer> iterator() {

        return new Iterator<Integer>() {
            int next;
            boolean hasNext;

            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                next = min + random.nextInt(max-min + 1);
                return next;
            }
        };
    }
}
