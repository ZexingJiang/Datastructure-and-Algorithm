package mylib;

public class Array {
    public int size;
    public int arr[];

    public Array(int capacity) {
        arr = new int[capacity];
        size = 0;
    }

    public Array() {
        this(10);
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return arr.length;
    }

    private void expand() {
        System.out.println("The array is full. auto expand to: " + arr.length * 2);
        int[] tempArr = new int[arr.length * 2];
        for (int i = 0; i < arr.length; i++) {
            tempArr[i] = arr[i];
        }
        arr = tempArr;
    }

    public void add(int idx, int e) {
        if (idx > size || idx < 0) {
            throw new IllegalArgumentException("Wrong Index");
        }

        if (size == arr.length) {
            expand();
        }

        for (int i = size - 1; i >= idx; i--) {
            arr[i + 1] = arr[i];
        }
        arr[idx] = e;
        size++;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void append(int e) {
        add(size, e);
    }

    public void addFirst(int e) {
        add(0, e);
    }

    public void resize(int newCapacity) {
        int[] newArr = new int[newCapacity];
        for (int i = 0; i < size; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }

    public int removeFirst() {
        return remove(0);
    }

    public int removeLast() {
        return remove(size - 1);
    }

    public int remove(int idx) {
        if (idx >= size || idx < 0) {
            throw new IllegalArgumentException("wrong index when remove.");
        }
        int ret = get(idx);
        for (int i = idx; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        // arr[size] = null; // loitering objects != memory leak TODO: meaning?
        size--;
        if (size == arr.length / 2)
            resize(arr.length / 2);
        return ret;
    }

    public int get(int idx) {
        if (idx >= size || idx < 0) {
            throw new IllegalArgumentException("Wrong index");
        }
        return arr[idx];
    }

    public void set(int idx, int e) {
        if (idx >= size || idx < 0) {
            throw new IllegalArgumentException("Wrong index");
        }
        arr[idx] = e;
    }

    public Boolean contains(int e) {
        for (int i = 0; i < size; i++) {
            if (e == arr[i]) {
                return true;
            }
        }
        return false;
    }

    public int find(int e) {
        for (int i = 0; i < size; i++) {
            if (e == arr[i]) {
                return i;
            }
        }
        return -1;
    }

    public void removeElement(int e){
        int index = find(e);
        if(index != -1)
            remove(index);
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("[");
        for (int i = 0; i < size; i++) {
            res.append(arr[i]);
            if (i != size - 1) {
                res.append(",");
            }
        }
        res.append("]");
        return res.toString();
    }

}