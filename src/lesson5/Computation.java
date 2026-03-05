package lesson5;

// Abstraction, implemented(private, default, protected) and unimplemented(Abstract)methods - public
// You cannot create object for Interface.
// Interface ca have fields. public static final
public interface Computation {
    double INTEREST = 5.5; // This line is equivalient to public static final double INTEREST = 5.5;

    //    Methods - Unimplemented - public abstract - nobody
    public abstract int add(int x, int y);

    //    This method is also public abstract
    double add(double d1, double d2);

    //    Implement methods, default implementation(belongs to objects)
    //   or static implementation Interface level
    //   default keyword indicated providing default implementation,
    //   not access modifier default(Package visibility)

    // Only public or default
    default String concat(String s1, String s2) {
        if (input(s1, s2))
            return s1 + " " + s2;

        return null;
    }

    default String concat(String s1, String s2, String s3) {
        return s1 + " " + s2 + " " + s3;
    }

    //Inside you provide private method for internal Interface use
    private boolean input(String x, String y) {
        return (x != null && y != null);
    }

    //Static methods - Utility methods, call using Interface.static method inside class

}