package org.elasticsearch.plugin.example;

import org.elasticsearch.common.inject.AbstractModule;

public class ExampleRestModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(HelloRestHandler.class).asEagerSingleton();
    }
}
