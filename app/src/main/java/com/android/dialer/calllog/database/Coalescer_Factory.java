package com.android.dialer.calllog.database;

import com.android.dialer.calllog.datasources.DataSources;

import javax.annotation.Generated;
import javax.inject.Provider;

import dagger.internal.Factory;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class Coalescer_Factory implements Factory<Coalescer> {
  private final Provider<DataSources> dataSourcesProvider;

  public Coalescer_Factory(Provider<DataSources> dataSourcesProvider) {
    assert dataSourcesProvider != null;
    this.dataSourcesProvider = dataSourcesProvider;
  }

  @Override
  public Coalescer get() {
    return new Coalescer(dataSourcesProvider.get());
  }

  public static Factory<Coalescer> create(Provider<DataSources> dataSourcesProvider) {
    return new Coalescer_Factory(dataSourcesProvider);
  }
}
