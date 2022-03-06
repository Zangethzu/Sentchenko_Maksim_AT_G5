package main.java.tasks.classwork.day7;

public class GenericContainer<T> {

    private T[] container; //иницифлазация массива на 10 ячееек
    int position;

    public GenericContainer() {
        container = (T[]) new Object[10];
        position = 0;
    }


    public void add(T ob) {

        if (position < container.length) {
            this.container[position++] = ob;
        }
    }

    public T removeLast() {
        T temp = null;
        if (position > 0) {
            temp = container[position - 1]; //обратился к ячейке номер 4 и присвоил значение ячейке temp
            container[--position] = null;//уменьшаю на единицу и ссылаюсь сразу на 4 ячейку контейнер
            return temp;

        }
        return null;
    }

    public boolean isEmpty() {
//        if (position == 0) {
//            return true;
//        } else {
//            return false;
//        }
        return position == 0;
    }
}

