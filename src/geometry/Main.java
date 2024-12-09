package geometry;

import java.util.Scanner;

/**
 * Main class with REPL for managing geometries.
 */
public class Main {
    public static void main(String[] args) {
        LinkedList<Object> geometries = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Options: 1-Add, 2-Remove, 3-Find, 4-Print, 5-Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Add Geometry: 1-Rectangle, 2-Circle, 3-Triangle, 4-Sphere, 5-TriangularPrism");
                    int type = scanner.nextInt();

                    if (type == 1) {
                        System.out.print("Enter length and width: ");
                        double length = scanner.nextDouble();
                        double width = scanner.nextDouble();
                        geometries.add(new Rectangle(length, width));
                    } else if (type == 2) {
                        System.out.print("Enter radius: ");
                        double radius = scanner.nextDouble();
                        geometries.add(new Circle(radius));
                    } else if (type == 3) {
                        System.out.print("Enter base and height: ");
                        double base = scanner.nextDouble();
                        double height = scanner.nextDouble();
                        geometries.add(new Triangle(base, height));
                    } else if (type == 4) {
                        System.out.print("Enter radius: ");
                        double radius = scanner.nextDouble();
                        geometries.add(new Sphere(radius));
                    } else if (type == 5) {
                        System.out.print("Enter base, height, and length: ");
                        double base = scanner.nextDouble();
                        double height = scanner.nextDouble();
                        double length = scanner.nextDouble();
                        geometries.add(new TriangularPrism(base, height, length));
                    }
                    break;

                case 2:
                    System.out.print("Enter index to remove: ");
                    int removeIndex = scanner.nextInt();
                    try {
                        geometries.remove(geometries.find(removeIndex));
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Invalid index.");
                    }
                    break;

                case 3:
                    System.out.print("Enter index to find: ");
                    int findIndex = scanner.nextInt();
                    try {
                        System.out.println(geometries.find(findIndex));
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Invalid index.");
                    }
                    break;

                case 4:
                    geometries.printAll();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}
