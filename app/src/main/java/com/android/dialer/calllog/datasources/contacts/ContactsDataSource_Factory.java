package com.android.dialer.calllog.datasources.contacts;

import javax.annotation.Generated;

import dagger.internal.Factory;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public enum ContactsDataSource_Factory implements Factory<ContactsDataSource> {
  INSTANCE;

  @Override
  public ContactsDataSource get() {
    return new ContactsDataSource();
  }

  public static Factory<ContactsDataSource> create() {
    return INSTANCE;
  }
}
