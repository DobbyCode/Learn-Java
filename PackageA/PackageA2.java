package PackageA;

public class PackageA2 {

    public int packageA2Public;
    int packageA2Default;
    protected int packageA2Protected;
    private int packageA2Private;

    public PackageA2(int packageA2Public, int packageA2Default, int packageA2Protected, int packageA2Private) {
        this.packageA2Public = packageA2Public;
        this.packageA2Default = packageA2Default;
        this.packageA2Protected = packageA2Protected;
        this.packageA2Private = packageA2Private;
    }

    public int getPackageA2Public() {
        return packageA2Public;
    }
    public void setPackageA2Public(int packageA2Public) {
        this.packageA2Public = packageA2Public;
    }
    public int getPackageA2Default() {
        return packageA2Default;
    }
    public void setPackageA2Default(int packageA2Default) {
        this.packageA2Default = packageA2Default;
    }
    public int getPackageA2Protected() {
        return packageA2Protected;
    }
    public void setPackageA2Protected(int packageA2Protected) {
        this.packageA2Protected = packageA2Protected;
    }
    public int getPackageA2Private() {
        return packageA2Private;
    }
    public void setPackageA2Private(int packageA2Private) {
        this.packageA2Private = packageA2Private;
    }


    public static void printPackageA2() {
        System.out.println("printPackageA2 metódus");
    }
}
