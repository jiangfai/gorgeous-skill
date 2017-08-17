package com.qfedu.ds;

import java.util.Arrays;

public class List<T> {
	private static final int DEFAULT_INIT_CAPACITY = 16;
	private T[] elements;
	private int capacity;
	private int size;

	public List() {
		this(DEFAULT_INIT_CAPACITY);
	}

	public List(int capacity) {
		this.size = 0;
		this.capacity = capacity;
		this.elements = (T[]) new Object[capacity];
	}

	public void add(T elem) {
		this.add(size, elem);
	}

	public void add(int index, T elem) {
		ensureCapacity();
		for (int i = size - 1; i >= index; --i) {
			elements[i + 1] = elements[i];
		}
		elements[index] = elem;
		size += 1;
	}

	private void ensureCapacity() {
		if (size == capacity) {
			elements = Arrays.copyOf(elements, capacity << 1);
			capacity = capacity << 1;
		}
	}

	public T removeAt(int index) {
		T temp = elements[index];
		for (int i = index + 1; i < size; ++i) {
			elements[i - 1] = elements[i];
		}
		elements[size - 1] = null;
		size -= 1;
		return temp;
	}

	public void remove(T elem) {
		int index = indexOf(elem);
		if (index != -1) {
			removeAt(index);
		}
	}

	public int indexOf(T elem) {
		for (int i = 0; i < size; ++i) {
			if (elements[i].equals(elem)) {
				return i;
			}
		}
		return -1;
	}

	public T get(int index) {
		return elements[index];
	}

	public int size() {
		return size;
	}

}
