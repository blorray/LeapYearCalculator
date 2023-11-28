public class LeapYearCalculator
 
{

    public static void main(String[] args)
 
{
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the year you want to check: ");
        int year = scanner.nextInt();

        if (isLeapYear(year)) {
            System.out.println("The year you entered " + year + " is a leap year.");
        } else {
            System.out.println("The year you entered " + year + " is not a leap year.");
        }
    }
 private static boolean isLeapYear(int year)
 
{
        if (year % 400 == 0) {
            return
 
true;
        } else
 
if (year % 100 == 0) {
            return
 
false;
        } else {
            return year % 4 == 0;
        }
    }
}

class
 TriangleAreaCalculator
 
{

    public static void main(String[] args)
 
 
{
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the base of the triangle: ");
        double base = scanner.nextDouble();

        System.out.println("Enter the height of the triangle: ");
        double height = scanner.nextDouble();


        
double area = calculateArea(base, height);

        System.out.println("The area of the triangle is: " + area);
    }

    private static double calculateArea(double base, double height) {
        return 0.5 * base * height;
    }
}