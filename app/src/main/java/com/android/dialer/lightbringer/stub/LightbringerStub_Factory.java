package com.android.dialer.lightbringer.stub;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public enum LightbringerStub_Factory implements Factory<LightbringerStub> {
  INSTANCE;

  @Override
  public LightbringerStub get() {
    return new LightbringerStub();
  }

  public static Factory<LightbringerStub> create() {
    return INSTANCE;
  }
}
