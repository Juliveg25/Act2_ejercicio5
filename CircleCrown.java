public class CircleCrown {

    // Encuentra el area de la corona circular restando las areas de ambos circulos.
    public static void findCrownArea(double innerArea, double outerRadius) {
        double outerArea = Circle.findArea(outerRadius); //Usando el metodo de la clase Circle.
        double crownArea = outerArea - innerArea;
        System.out.println("El area del circulo interno es: " + String.format("%.2f", innerArea) + "\n");
        System.out.println("El area del circulo externo es: " + String.format("%.2f", outerArea) + "\n");
        System.out.println("El area de la corona circular es: " + String.format("%.2f", crownArea) + "\n");
    }

    //Encuentra la diferencia o grosor de la corona circular restando los radios r - R
    public static double findThickness(double innerRadius, double outerRadius){
        double thickness = outerRadius - innerRadius;
        System.out.println("La diferencia de r y R, o grosor es: " + String.format("%.2f", thickness) + "\n");
        return thickness;
    }

    //Como modo alternativo, si se conoce el radio del círculo exterior (outerRadius) y el grosor de la corona
    // (thickness) se puede calcular el radio del círculo interior (rInner)
    // y volver a calcular el area de la corona.

    public static void otherCrownAlternative(double outerR, double difference){
        double rInner = difference - outerR;
        double rArea = Circle.findArea(rInner);
        double outerArea = Circle.findArea(outerR);
        double otherCrownArea = outerArea - rArea;
        System.out.println("El area de la corona usando otro metodo alternativo (grosor - radio de R) es: " + String.format("%.2f", otherCrownArea) + "\n"); //add aprox
    }
}