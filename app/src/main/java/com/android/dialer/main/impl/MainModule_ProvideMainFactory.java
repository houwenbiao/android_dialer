package com.android.dialer.main.impl;

import com.android.dialer.main.Main;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public enum MainModule_ProvideMainFactory implements Factory<Main> {
  INSTANCE;

  @Override
  public Main get() {
    return Preconditions.checkNotNull(
        MainModule.provideMain(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<Main> create() {
    return INSTANCE;
  }
}
