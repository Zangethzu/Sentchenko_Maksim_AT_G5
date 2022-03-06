package main.java.tasks.classwork.day7;

public class ObjectContainer {

    private Object[] container = new Object[10]; //иницифлазация массива на 10 ячееек
    int position;


    public void add(Object ob) {

        if (position < container.length) {
            this.container[position++] = ob;
        }
    }

    public Object removeLast() {
        if (position > 0) {
            Object temp = container[position - 1]; //обратился к ячейке номер 4 и присвоил значение ячейке temp
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
