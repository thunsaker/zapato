package com.thunsaker.zapato.dagger;

import dagger.ObjectGraph;

public interface Injector {
    void inject(Object object);
    ObjectGraph getObjectGraph();
}
