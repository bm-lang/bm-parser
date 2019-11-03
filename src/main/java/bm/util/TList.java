package bm.util;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TList<T> implements Iterable<T> {

  private final Class<T> type;

  private T[] values;

  public TList(Class<T> type) {
    this.type = type;
    this.values = null;
  }

  public TList(Class<T> type, List<T> source) {
    this.type = type;

    set(source);
  }

  public TList(Class<T> type, T[] values) {
    this.type = type;

    set(values);
  }

  public void set(List<T> source) {
    int length = source.size();
    T[] values = newArray(length);

    for (int i = 0; i < length; i++) {
      values[i] = source.get(i);
    }

    this.values = values;
  }

  public void set(T[] values) {
    this.values = Arrays.copyOf(values, values.length);
  }

  public <S> void set(List<S> source, Function<S, T> mapper) {
    int length = source.size();
    T[] values = newArray(length);

    for (int i = 0; i < length; i++) {
      values[i] = mapper.apply(source.get(i));
    }

    this.values = values;
  }

  public <S> void set(TList<S> source, Function<S, T> mapper) {
    int length = source.size();
    T[] values = newArray(length);

    for (int i = 0; i < length; i++) {
      values[i] = mapper.apply(source.get(i));
    }

    this.values = values;
  }

  public int size() {
    return values != null ? values.length : 0;
  }

  public boolean isEmpty() {
    return values == null || values.length == 0;
  }

  public T get(int index) {
    if (values == null) {
      throw new IndexOutOfBoundsException();
    }
    return values[index];
  }

  public Class<T> getType() {
    return type;
  }

  @Override
  public Iterator<T> iterator() {
    T[] array = values;
    AtomicInteger index = new AtomicInteger(0);
    return new Iterator<T>() {
      @Override
      public boolean hasNext() {
        return index.get() < array.length;
      }

      @Override
      public T next() {
        return array[index.getAndIncrement()];
      }
    };
  }

  @SuppressWarnings("unchecked")
  private T[] newArray(int length) {
    return (T[])Array.newInstance(type, length);
  }
}
