package es.geeksusma.set;

import java.util.Arrays;

public class ArraySet {
  private Integer[] array = new Integer[0];

  public Integer size() {
    return array.length;
  }

  public Boolean isEmpty() {
    return size() == 0;
  }

  public Boolean contains(Integer item) {
    return Arrays.stream(array).anyMatch(elem -> elem.equals(item));
  }

  public void add(Integer item) {
    if (contains(item)) {
      return;
    }
    Integer[] newArray = new Integer[array.length + 1];

    for (int i = 0; i < array.length; i++) {
      newArray[i] = array[i];
    }

    newArray[array.length] = item;
    array = newArray;
  }

  public Boolean remove(Integer item) {
    if (!contains(item)) {
      return false;
    }
    Integer[] filteredArray = Arrays.stream(array).filter(elem -> !elem.equals(item)).toArray(Integer[]::new);
    array = filteredArray;
    return true;
  }
}
