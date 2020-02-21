package com.android.dialer.calllog;

import com.android.dialer.calllog.datasources.DataSources;

import javax.annotation.Generated;
import javax.inject.Provider;

import dagger.internal.Factory;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CallLogFramework_Factory implements Factory<CallLogFramework> {
  private final Provider<DataSources> dataSourcesProvider;

  public CallLogFramework_Factory(Provider<DataSources> dataSourcesProvider) {
    assert dataSourcesProvider != null;
    this.dataSourcesProvider = dataSourcesProvider;
  }

  @Override
  public CallLogFramework get() {
    return new CallLogFramework(dataSourcesProvider.get());
  }

  public static Factory<CallLogFramework> create(Provider<DataSources> dataSourcesProvider) {
    return new CallLogFramework_Factory(dataSourcesProvider);
  }
}
