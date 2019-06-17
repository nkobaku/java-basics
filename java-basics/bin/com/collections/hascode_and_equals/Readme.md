* Java equals() and hashCode() methods are present in Object class. So every java class gets the default implementation of equals() and hashCode().

##Java equals()

* Object class defined equals() method like this:

  public boolean equals(Object obj) {
        return (this == obj);
  }