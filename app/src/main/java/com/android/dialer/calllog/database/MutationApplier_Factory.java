package com.android.dialer.calllog.database;

import javax.annotation.Generated;

import dagger.internal.Factory;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public enum MutationApplier_Factory implements Factory<MutationApplier> {
  INSTANCE;

  @Override
  public MutationApplier get() {
    return new MutationApplier();
  }

  public static Factory<MutationApplier> create() {
    return INSTANCE;
  }
}
