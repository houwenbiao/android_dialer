package com.android.dialer.calllog.datasources.systemcalllog;

import javax.annotation.Generated;

import dagger.internal.Factory;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public enum SystemCallLogDataSource_Factory implements Factory<SystemCallLogDataSource> {
  INSTANCE;

  @Override
  public SystemCallLogDataSource get() {
    return new SystemCallLogDataSource();
  }

  public static Factory<SystemCallLogDataSource> create() {
    return INSTANCE;
  }
}
