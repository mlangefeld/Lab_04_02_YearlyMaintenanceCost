public class Main {
    public static void main(String[] args)
    {
        double springMCost = 200;
        double summerMCost = 147;
        double winterMCost = 342;
        double fallMCost = 284;

        double totalMCost = springMCost + winterMCost + summerMCost + fallMCost;

        System.out.println("The cost of maintenance for the spring is " + springMCost);
        System.out.println("The cost of maintenance for the summer is " + summerMCost);
        System.out.println("The cost of maintenance for the fall is " + fallMCost);
        System.out.println("The cost of maintenance for the winter is " + winterMCost);
        System.out.println("The total maintenance cost for the year is " + totalMCost);
    }
}