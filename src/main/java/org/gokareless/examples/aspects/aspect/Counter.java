package org.gokareless.examples.aspects.aspect;

import com.codahale.metrics.MetricRegistry;
import com.wavefront.integrations.metrics.WavefrontReporter;

import java.util.concurrent.TimeUnit;

public class Counter {

    com.codahale.metrics.Counter counter;
    WavefrontReporter reporter;

    public Counter() {
        MetricRegistry registry = new MetricRegistry();
        counter = registry.counter("req-ubuntu-count");
        String hostname = "localhost";
        int port = 2878;
        reporter = WavefrontReporter.forRegistry(registry).
                withSource("my.laptop.com").
                withPointTag("dc", "kyiv").
                withPointTag("my", "tag").
                build(hostname, port);
        reporter.start(5, TimeUnit.SECONDS);
    }

    public boolean increment() {
        counter.inc();
        reporter.report();
        return true;
    }
}
