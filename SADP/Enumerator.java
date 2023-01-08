import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class enu implements Iterator {

    Enumeration enumeration;

    public enu(Enumeration enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        return enumeration.nextElement();
    }

    public static void main(String[] args) {
        Vector v = new Vector();
        v.add("piyush");
        v.add("pratiksha");
        Iterator i = new enu(v.elements());
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
