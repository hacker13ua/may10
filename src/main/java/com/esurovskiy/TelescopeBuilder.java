package com.esurovskiy;

public class TelescopeBuilder {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;

    public TelescopeObject build() {
        return new TelescopeObject(a, b, c, d, e, f);
    }

    public TelescopeBuilder setA(final int a) {
        this.a = a;
        return this;
    }

    public TelescopeBuilder setB(final int b) {
        this.b = b;
        return this;
    }

    public TelescopeBuilder setC(final int c) {
        this.c = c;
        return this;
    }

    public TelescopeBuilder setD(final int d) {
        this.d = d;
        return this;
    }

    public TelescopeBuilder setE(final int e) {
        this.e = e;
        return this;
    }

    public TelescopeBuilder setF(final int f) {
        this.f = f;
        return this;
    }
}
