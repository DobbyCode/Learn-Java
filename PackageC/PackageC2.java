package PackageC;

public class PackageC2 {

    public int packageC2Public;
    int packageC2Default;
    protected int packageC2Protected;
    private int packageC2Private;
    
    public PackageC2(int packageC2Public, int packageC2Default, int packageC2Protected, int packageC2Private) {
        this.packageC2Public = packageC2Public;
        this.packageC2Default = packageC2Default;
        this.packageC2Protected = packageC2Protected;
        this.packageC2Private = packageC2Private;
    }

    public int getPackageC2Public() {
        return packageC2Public;
    }
    public void setPackageC2Public(int packageC2Public) {
        this.packageC2Public = packageC2Public;
    }
    public int getPackageC2Default() {
        return packageC2Default;
    }
    public void setPackageC2Default(int packageC2Default) {
        this.packageC2Default = packageC2Default;
    }
    public int getPackageC2Protected() {
        return packageC2Protected;
    }
    public void setPackageC2Protected(int packageC2Protected) {
        this.packageC2Protected = packageC2Protected;
    }
    public int getPackageC2Private() {
        return packageC2Private;
    }
    public void setPackageC2Private(int packageC2Private) {
        this.packageC2Private = packageC2Private;
    }
    
    
    public void printPackageC2() {
        System.out.println("printPackageC2 metódus");
    }
}
