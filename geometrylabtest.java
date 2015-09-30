public class GeometryLabTest {
    
    public static void main (string[] args) {
        GeometryLab geo = new GeometryLab();
        System.out.println(geo.f(2,3));
        System.out.println(geo.f(4,8));
        System.out.println(geo.g(3,5));
        System.out.println(geo.g(5,3));
        System.out.println(geo.h(2,9));
        System.out.println(geo.h(4,10));
        System.out.println(geo.j(5,10));
        System.out.println(geo.j(10,5));
        System.out.println(geo.k(9,7));
        System.out.println(geo.k(7,9));
        System.out.println(geo.m(3,4,5));
        System.out.println(geo.m(4,6,3));
        System.out.println(geo.f(geo.g(3,5), geo.k(7,9));
        System.out.println(geo.f(geo.j(10,5), geo.h(2,9));
        System.out.println(geo.g(geo.m(3,4,5), geo.h(4,10));
        System.out.println(geo.g(geo.j(5,10), geo.f(2.3));
        System.out.println(geo.h(geo.m(4,6,3), geo.f(4,8));
        System.out.println(geo.h(geo.k(9,7), geo.g(5,3));
        System.out.println(geo.j(geo.k(7,9), geo.g(3,5));
        System.out.println(geo.j(geo.h(2,9), geo.m(4,6,3));
        System.out.println(geo.k(goe.m(3,4,5), geo.j(10,5));
        System.out.println(geo.k(geo.k(9,7), geo.f(4,8));
        System.out.println(geo.m(geo.h(4,10), geo.f(2,3), geo.g(5,3));
        System.out.println(geo.m(geo.k(7,9), geo.j(5,10), geo.h(4,10));
        
        
        System.out.println(geo.triArea(2,3));
        System.out.println(geo.triArea(4,8));
        System.out.println(geo.trapArea(3,4,5));
        System.out.println(geo.trapArea(4,6,3));
        System.out.println(geo.rectArea(3,5));
        System.out.println(geo.rectArea(5,3));
        System.out.println(geo.circArea(7));
        System.out.println(geo.circArea(9));
        System.out.println(geo.paralArea(2, 9));
        System.out.println(geo.paralArea(4, 10));
        System.out.println(geo.pythHypotenuse(5, 10));
        System.out.println(geo.pythHypotenuse(9, 7));
        System.out.println(geo.triPrismVol(10, 5, 4));
        System.out.println(geo.triPrismVol(10, 5, 4));
        System.out.println(geo.triPrismVol(10, 5, 4));
        System.out.println(geo.rectPyramidVol(4, 6, 8));
        System.out.println(geo.cylVol(9, 2));
        System.out.println(geo.cylVol(10, 3));
        System.out.println(geo.sphereVol(6));
        System.out.println(geo.sphereVol(8));
        System.out.println(geo.coneVol(6, 5));
        System.out.println(geo.coneVol(8, 7));
        System.out.println(geo.sphereSurfArea(4));
        System.out.println(geo.sphereSurfArea(7));
        System.out.println(geo.cylSurfArea(4, 7));
        System.out.println(geo.cylSurfArea(5, 3));
        System.out.println(geo.rectPrismSurfArea(2, 3, 4));
        System.out.println(geo.rectPrismSurfArea(8, 3, 6));
        System.out.println(geo.triArea(geo.f(2, 3), geo.h(4, 8)));
        System.out.println(geo.rectArea(geo.g(7, 5), geo.j(5, 3)));
        System.out.println(geo.trapArea(geo.m(3, 4, 5), geo.m(4, 6, 3), geo.m(8, 3, 6)));
        System.out.println(geo.circArea(geo.k(8, 5)));
        System.out.println(geo.paralArea(geo.j(9, 2), geo.f(4, 10)));
        System.out.println(geo.pythHypotenuse(geo.f(5, 10), geo.g(9, 7)));
        System.out.println(geo.triPrismVol(geo.m(10, 5, 4), geo.m(7, 9, 3), geo.m(5, 7, 3)));
        System.out.println(geo.rectPrismVol(geo.h(2, 4), geo.m(8, 3, 6), geo.h(3, 6)));
        System.out.println(geo.rectPyramidVol(geo.m(5, 7, 9), geo.m(4, 6, 8), geo.k(20, 7)));
        System.out.println(geo.cylVol(geo.h(9, 2), geo.k(10, 3)));
        System.out.println(geo.coneVol(geo.j(6, 5), geo.j(8, 7)));
        System.out.println(geo.cylSurfArea(4, geo.f(5, 3)));
        System.out.println(geo.rectPrismSurfArea(geo.pythHypotenuse(3, 4), 3, geo.k(13, 5)));
        System.out.println(geo.sphereVol(geo.g(9, 6)));
        System.out.println(geo.sphereSurfArea(geo.m(4, 3, 1)));
    }
}