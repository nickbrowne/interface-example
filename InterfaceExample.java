import java.util.*;

class InterfaceExample {

  interface Reader {
    public void read();
  }

  class FunReader implements Reader {
    public void read() {
      System.out.println("fun byte reader reporting in");
    }
  }

  class SuperReader implements Reader {
    public void read() {
      System.out.println("super byte reader reporting in");
    }
  }

  public static void main(String args[]) {
    new InterfaceExample();
  }

  public InterfaceExample() {
    List<Reader> readerArray = new ArrayList<Reader>();
    readerArray.add(new FunReader());
    readerArray.add(new SuperReader());
    readerArray.add(new FunReader());

    Iterator<Reader> iterator = readerArray.iterator();

    while(iterator.hasNext()) {
      Reader reader = iterator.next();
      reader.read();
    }
  }
}
