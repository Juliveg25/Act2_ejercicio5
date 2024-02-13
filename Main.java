
public class Main {
    public static void main(String[] args) {
        double innerRadius = 5.0;
        double innerArea = Circle.findArea(innerRadius);
        double outerRadius = 10.0;
        CircleCrown.findCrownArea(innerArea, outerRadius);
        double crownThickness = CircleCrown.findThickness(innerRadius, outerRadius);
        CircleCrown.otherCrownAlternative(outerRadius, crownThickness);
    }
}

