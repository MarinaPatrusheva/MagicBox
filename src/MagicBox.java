import java.util.Random;

public class MagicBox<T> {
    private int maxSize;
    private T[] item;
    public MagicBox(int maxSize) {
        this.maxSize = maxSize;
        item = (T[]) new Object[maxSize];
    }

    public boolean add(T item) {
        for (int i = 0; i < this.item.length; i++) {
            if (this.item[i] == null) {
                this.item[i] = item;
                return true;
            }
        }
            return false;
    }
    public T pick(){
        int count = 0;
        for(int i = 0; i < item.length; i++){
            if (item[i] == null){
                count += 1;
            }
        }
        if(count != 0){
            throw new RuntimeException("Коробка не заполнена! Осталось свободных мест: " + count);
        }else{
            Random random = new Random();
            return item[random.nextInt(item.length )];
        }
    }
}

