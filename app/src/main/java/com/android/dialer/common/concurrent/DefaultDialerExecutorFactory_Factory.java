package com.android.dialer.common.concurrent;

import javax.annotation.Generated;

import dagger.internal.Factory;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public enum DefaultDialerExecutorFactory_Factory implements Factory<DefaultDialerExecutorFactory> {
  INSTANCE;

  @Override
  public DefaultDialerExecutorFactory get() {
    return new DefaultDialerExecutorFactory();
  }

  public static Factory<DefaultDialerExecutorFactory> create() {
    return INSTANCE;
  }
}
