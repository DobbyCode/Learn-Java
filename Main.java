import PackageA.PackageA1;
import PackageA.PackageA2;
import PackageB.PackageB1;
import PackageB.PackageB2;
import PackageC.PackageC1;
import PackageC.PackageC2;

public class Main {
    public static void main(String[] args) {

        int mainDefault;

        PackageA1 packageA1 = new PackageA1(1, 2, 3, 4);
        packageA1.printPackageA1();
        packageA1.PackageA.PackageA2.printPackageA2();
        packageA1.PackageB1.printPackageB1();



        PackageA2 packageA2 = new PackageA2(1, 2, 3, 4);


        PackageB1 packageB1 = new PackageB1(1, 2, 3, 4);
        packageA1.printPackageA1();
        packageA1.PackageA.PackageA2.printPackageA2();
        packageB1.printPackageB1();


        PackageB2 packageB2 = new PackageB2(1, 2, 3, 4);


        PackageC1 packageC1 = new PackageC1(1, 2, 3, 4);


        PackageC2 packageC2 = new PackageC2(1, 2, 3, 4);


        Mappa mappa = new Mappa(1, 2, 3, 4);
        packageA1.printPackageA1();
        packageA1.PackageA.PackageA2.printPackageA2();
        packageA1.PackageB1.printPackageB1();
        
    }
}