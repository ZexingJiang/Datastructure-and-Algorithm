- 不要同时引用下标的时候修改数组，导致下标变化，出现循环
- 使用泛型创建对象时用到强转`(E[])new Object[capacity]`;
- `String.format("Array: size = %d , capacity = %d\n", size, data.length)`