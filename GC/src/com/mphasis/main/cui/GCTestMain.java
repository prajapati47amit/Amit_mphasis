package com.mphasis.main.cui;

import javax.management.*;
import java.lang.management.ManagementFactory;

public class GCTestMain {

    private static void init() throws MalformedObjectNameException, InstanceAlreadyExistsException, MBeanRegistrationException, NotCompliantMBeanException {
        MBeanServer mbs = null;
        mbs = ManagementFactory.getPlatformMBeanServer();
        GCTestAgent agent = new GCTestAgent();
        ObjectName agentName;
        agentName = new ObjectName("AATests:name=GCTestAgent");
        mbs.registerMBean(agent, agentName);
    }

    public static void main(String[] args) throws Exception {
        init();
        for (;;) {
            Thread.sleep(1000);
        }
    }
}