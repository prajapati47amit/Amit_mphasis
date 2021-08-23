package com.mphasis.main.cui;

public interface GCTestAgentMBean {
    void newThread(String threadName);
    void newCollectableObject(int size);
    void newLeakedObject(int size);
    void clearLeaked();
    void cpuIntensiveOperation(int iterations);
}