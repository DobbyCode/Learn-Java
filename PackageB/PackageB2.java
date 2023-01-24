package PackageB;

public class PackageB2 {

    public int packageB2Public;
    int packageB2Default;
    protected int packageB2Protected;
    private int packageB2Private;
    
    public PackageB2(int packageB2Public, int packageB2Default, int packageB2Protected, int packageB2Private) {
        this.packageB2Public = packageB2Public;
        this.packageB2Default = packageB2Default;
        this.packageB2Protected = packageB2Protected;
        this.packageB2Private = packageB2Private;
    }

    public int getPackageB2Public() {
        return packageB2Public;
    }
    public void setPackageB2Public(int packageB2Public) {
        this.packageB2Public = packageB2Public;
    }
    public int getPackageB2Default() {
        return packageB2Default;
    }
    public void setPackageB2Default(int packageB2Default) {
        this.packageB2Default = packageB2Default;
    }
    public int getPackageB2Protected() {
        return packageB2Protected;
    }
    public void setPackageB2Protected(int packageB2Protected) {
        this.packageB2Protected = packageB2Protected;
    }
    public int getPackageB2Private() {
        return packageB2Private;
    }
    public void setPackageB2Private(int packageB2Private) {
        this.packageB2Private = packageB2Private;
    }


    public void printPackageB2() {
        System.out.println("printPackageB2metódus");
    }
}
