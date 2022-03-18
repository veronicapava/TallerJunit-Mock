public class Dependency {

    private final Subdependency subDependecy;

    public Dependency(Subdependency subDependecy) {
        super();
        this.subDependecy = subDependecy;
    }

    public String getClassName() {
        return this.getClass().getSimpleName();
    }

    public String getSubdepedencyClassName() {
        return this.subDependecy.getClassName();
    }

    public int addTwo(int i) {
        return i + 2;
    }

    public String getClassNameUpperCase() {
        return getClassName().toUpperCase();
    }
}

