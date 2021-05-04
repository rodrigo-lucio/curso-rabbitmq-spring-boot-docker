package com.spring.producer.ampq;

public interface AmpqProducer<T> {
    void producer(T t);
}
