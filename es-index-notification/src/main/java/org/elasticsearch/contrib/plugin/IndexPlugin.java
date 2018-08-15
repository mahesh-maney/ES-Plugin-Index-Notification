package org.elasticsearch.contrib.plugin;

import org.elasticsearch.plugins.Plugin;
import org.elasticsearch.rest.RestModule;

public class IndexPlugin extends Plugin {
    @Override
    public String name() {
        return "index-notification-plugin";
    }

    @Override
    public String description() {
        return "Notifies the indexer after index operation is complete";
    }

    public void onModule(RestModule module) {
        module.addRestAction(IndexRestAction.class);
    }
}
