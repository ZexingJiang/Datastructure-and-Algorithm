
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

    private int getCapacity() {
        return arr.length;
    }

    private void expand() {
        tempArr = new int[arr.length * 2];
        for (int i = 0; i < arr.length; i++) {
            tempArr[i] = arr[i];
        }
        arr = tempArr;
    }

    public void append(int e) {
        add(size, e);
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

    public void addFirst(int e) {
        add(0, e);
    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append(String.forma)
        return res.toString();
    } 

}