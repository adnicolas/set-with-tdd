package es.geeksusma.set;

public class ArraySet {
  private Integer[] array = new Integer[0];

  public Boolean isEmpty() {
    return this.size() == 0;
  }
  public Integer size() {
    return this.array.length;
  }

  public Boolean contains(Integer item) {
    // TODO: Niveles de indentación
    for (int i = 0; i < array.length; i++) {
      if (array[i] == item) {
        return true;
      }
    }
    return false;
  }

  public void add(Integer item) {
    if (this.contains(item)) {
      return;
    }
    // Nuevo array con capacidad para el nuevo elemento
    Integer[] newArray = new Integer[this.array.length + 1];
    // Copio los elementos preexistentes
    for (int i = 0; i < array.length; i++) {
      newArray[i] = array[i];
    }
    // Asigno el nuevo
    newArray[array.length] = item;

    this.array = newArray;
  }

  public  Boolean remove(Integer item) {
    if (!this.contains(item)) {
      return false;
    }
    Integer[] newArray = new Integer[this.array.length - 1];
    // TODO: Niveles de indentación
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < newArray.length; j++) {
        if (array[i] != item) {
          newArray[j] = array[i];
        }
      }
    }
    this.array = newArray;
    return true;
  }
}
