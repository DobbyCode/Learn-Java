package PackageC;

public class PackageC1 {

    public int packageC1Public;
    int packageC1Default;
    protected int packageC1Protected;
    private int packageC1Private;
    
    public PackageC1(int packageC1Public, int packageC1Default, int packageC1Protected, int packageC1Private) {
        this.packageC1Public = packageC1Public;
        this.packageC1Default = packageC1Default;
        this.packageC1Protected = packageC1Protected;
        this.packageC1Private = packageC1Private;
    }

    public int getPackageC1Public() {
        return packageC1Public;
    }
    public void setPackageC1Public(int packageC1Public) {
        this.packageC1Public = packageC1Public;
    }
    public int getPackageC1Default() {
        return packageC1Default;
    }
    public void setPackageC1Default(int packageC1Default) {
        this.packageC1Default = packageC1Default;
    }
    public int getPackageC1Protected() {
        return packageC1Protected;
    }
    public void setPackageC1Protected(int packageC1Protected) {
        this.packageC1Protected = packageC1Protected;
    }
    public int getPackageC1Private() {
        return packageC1Private;
    }
    public void setPackageC1Private(int packageC1Private) {
        this.packageC1Private = packageC1Private;
    }
    
    
    public void printPackageC1() {
        System.out.println("printPackageC1 metódus");
    }
}
