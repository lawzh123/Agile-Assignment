package Interfaces;

public class myArrayList<T> implements ArrayListInterface<T> {

    private static int Initial_Size = 25;
    private int lastIndex = -1;
    private T[] array;

    //<editor-fold defaultstate="collapsed" desc="constructor">
    public myArrayList() {
        this(Initial_Size);
    }

    public myArrayList(int size) {
        array = (T[]) new Object[size];
    }
    //</editor-fold>

    public boolean Add(T newItem) {
        lastIndex++;
        if (lastIndex < Initial_Size) {
            expandArray();
        }
        array[lastIndex] = newItem;
        return true;
    }

    public boolean remove(int i) {
        if (array[i] != null) {
            array[i] = null;
            lastIndex--;
            ClearEmpty();
            return true;
        } else {
            return false;
        }
    }

    public boolean replace(int index, T item) {
        if (index >= 0 && index < lastIndex) {
            array[index] = item;
            return true;
        } else {
            return false;
        }
    }

    public T get(int index) {
        if (index >= 0 && index <= lastIndex) {
            return array[index];
        } else {
            return null;
        }
    }

    public int size() {
        return lastIndex+1;
    }

    public boolean isEmpty() {
        if (lastIndex == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void clear() {
        array = null;
        lastIndex = 0;
    }

    //<editor-fold defaultstate="collapsed" desc="Secret proccesses">
    private void expandArray() {
        T[] oldArray = array;
        int oldSize = array.length;
        array = (T[]) new Object[(oldSize + oldSize)];
        System.arraycopy(oldArray, 0, array, 0, oldSize);
    }

    private void ClearEmpty() {
        for (int i = 0; i < array.length && (i + 1) != array.length; i++) {
            if (array[i].equals(null)) {
                array[i] = array[i + 1];
                array[i + 1] = null;
            }
        }
    }
    //</editor-fold>
}
