package com.android.dialer.configprovider;

import android.content.Context;

import javax.annotation.Generated;
import javax.inject.Provider;

import dagger.internal.Factory;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SharedPrefConfigProvider_Factory implements Factory<SharedPrefConfigProvider> {
  private final Provider<Context> appContextProvider;

  public SharedPrefConfigProvider_Factory(Provider<Context> appContextProvider) {
    assert appContextProvider != null;
    this.appContextProvider = appContextProvider;
  }

  @Override
  public SharedPrefConfigProvider get() {
    return new SharedPrefConfigProvider(appContextProvider.get());
  }

  public static Factory<SharedPrefConfigProvider> create(Provider<Context> appContextProvider) {
    return new SharedPrefConfigProvider_Factory(appContextProvider);
  }
}
