package prepration.AccessSpecifiers.Protected.Pkg2;

import prepration.AccessSpecifiers.Protected.Pkg1.Pkg1Class;


class TestProtected extends Pkg1Class {


    void test () {
        Pkg1Class pkg1Class= new Pkg1Class();
        System.out.println(name); //accessible
    }
}

public class Pkg2Class {
    public static void main(String[] args) {
        Pkg1Class pkg1Class = new Pkg1Class();
//        System.out.println(pkg1Class.name); // not accessible
    }
}
