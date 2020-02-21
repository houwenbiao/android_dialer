package com.android.dialer.calllog;

import android.content.Context;

import com.android.dialer.calllog.datasources.DataSources;

import javax.annotation.Generated;
import javax.inject.Provider;

import dagger.internal.Factory;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RefreshAnnotatedCallLogWorker_Factory
    implements Factory<RefreshAnnotatedCallLogWorker> {
  private final Provider<Context> appContextProvider;

  private final Provider<DataSources> dataSourcesProvider;

  public RefreshAnnotatedCallLogWorker_Factory(
          Provider<Context> appContextProvider, Provider<DataSources> dataSourcesProvider) {
    assert appContextProvider != null;
    this.appContextProvider = appContextProvider;
    assert dataSourcesProvider != null;
    this.dataSourcesProvider = dataSourcesProvider;
  }

  @Override
  public RefreshAnnotatedCallLogWorker get() {
    return new RefreshAnnotatedCallLogWorker(appContextProvider.get(), dataSourcesProvider.get());
  }

  public static Factory<RefreshAnnotatedCallLogWorker> create(
          Provider<Context> appContextProvider, Provider<DataSources> dataSourcesProvider) {
    return new RefreshAnnotatedCallLogWorker_Factory(appContextProvider, dataSourcesProvider);
  }
}
