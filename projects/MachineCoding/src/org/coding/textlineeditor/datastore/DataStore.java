package org.coding.textlineeditor.datastore;

import java.util.Iterator;

public interface DataStore {
  void insert(int lineNumber, String line);

  String delete(int lineNumber);

  String get(int lineNumber);

  Iterator<String> getIterator();
}
