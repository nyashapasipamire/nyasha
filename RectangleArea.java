public class RectangleArea {

        public double length;
        public double width;
        public double area;

        public void getData()
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the length of the rectangle: ");
            length = sc.nextDouble();
            System.out.print("Enter the width of the rectangle: ");
            width = sc.nextDouble();
            scanner.close();
        }

        public void computeField() {
            area = length * width;
        }

        public void fieldDisplay() {
            System.out.println("Rectangle Area Calculation:");
            System.out.println("Length: " + length);
            System.out.println("Width: " + width);
            System.out.println("Area: " + area);
        }
    }









