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

    public boolean remove(int index) {
        if (array[index] != null) {
            array[index] = null;
            ClearEmpty();
            lastIndex--;
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
    public T[] getAll(){
        return array;
    }

    public int size() {
        return lastIndex + 1;
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

    public boolean copy(ArrayListInterface<T> anArray) {
        boolean flag = true;
        System.arraycopy(anArray.getAll(), 0,array , 0, anArray.size());
        for (int i = 0; i < array.length && flag; i++) {
            if (array[i] != null) {
                lastIndex = i;
            } else {
                flag = false;
            }
        }
        return true;
    }

    //<editor-fold defaultstate="collapsed" desc="Secret proccesses">
    private void expandArray() {
        T[] oldArray = array;
        int oldSize = array.length;
        array = (T[]) new Object[(oldSize + oldSize)];
        System.arraycopy(oldArray, 0, array, 0, oldSize);
    }

    private void ClearEmpty() {
        for (int i = 0; i < lastIndex; i++) {
            if (array[i] == null) {
                array[i] = array[i + 1];
                array[i + 1] = null;
            }

        }
    }
    //</editor-fold>
}
