package com.android.dialer.calllog;

import com.android.dialer.calllog.datasources.DataSources;
import com.android.dialer.calllog.datasources.contacts.ContactsDataSource;
import com.android.dialer.calllog.datasources.systemcalllog.SystemCallLogDataSource;

import javax.annotation.Generated;
import javax.inject.Provider;

import dagger.internal.Factory;
import dagger.internal.Preconditions;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CallLogModule_ProvideCallLogDataSourcesFactory implements Factory<DataSources> {
  private final Provider<SystemCallLogDataSource> systemCallLogDataSourceProvider;

  private final Provider<ContactsDataSource> contactsDataSourceProvider;

  public CallLogModule_ProvideCallLogDataSourcesFactory(
      Provider<SystemCallLogDataSource> systemCallLogDataSourceProvider,
      Provider<ContactsDataSource> contactsDataSourceProvider) {
    assert systemCallLogDataSourceProvider != null;
    this.systemCallLogDataSourceProvider = systemCallLogDataSourceProvider;
    assert contactsDataSourceProvider != null;
    this.contactsDataSourceProvider = contactsDataSourceProvider;
  }

  @Override
  public DataSources get() {
    return Preconditions.checkNotNull(
        CallLogModule.provideCallLogDataSources(
            systemCallLogDataSourceProvider.get(), contactsDataSourceProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<DataSources> create(
      Provider<SystemCallLogDataSource> systemCallLogDataSourceProvider,
      Provider<ContactsDataSource> contactsDataSourceProvider) {
    return new CallLogModule_ProvideCallLogDataSourcesFactory(
        systemCallLogDataSourceProvider, contactsDataSourceProvider);
  }
}
