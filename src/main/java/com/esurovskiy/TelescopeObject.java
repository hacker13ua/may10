package com.esurovskiy;

/**
 * TODO: write javadoc
 *
 * @author Evgeniy Surovskiy
 */
public class TelescopeObject {
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;

    TelescopeObject(final int a, final int b, final int c,
                    final int d, final int e, final int f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }


    public static void main(String[] args) {
        final TelescopeObject build = new TelescopeBuilder()
                .setA(1)
                .setB(3)
                .setC(4)
                .setD(5)
                .build();
    }
}
