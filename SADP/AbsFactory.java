class MainClass {

    interface Shape {
        void draw();
    }

    public class Rectangle implements Shape {
        public void draw() {
            System.out.println("This is Rectangle");
        }
    }

    public class Square implements Shape {
        public void draw() {
            System.out.println("This is Square");
        }
    }

    abstract class AbstractMethod{
        abstract Shape getShape(String shape);
    }

    public class FormShape extends AbstractMethod{
        
        public Shape getShape(String shape)
        {
            if (shape.equals("rect"))
                return new Rectangle();
            else if (shape.equals("squ"))
                return new Square(); 
            return null;
        }
    }

    static class AbsFactory {
        public static void main(String[] args) {
            MainClass x = new MainClass();
            AbstractMethod a1 = x.new FormShape();
            Shape s1 = a1.getShape("rect");
            s1.draw();
        }
    }
}
