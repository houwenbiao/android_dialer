package com.android.dialer.binary.aosp;

import android.content.Context;

import com.android.dialer.calllog.CallLogComponent;
import com.android.dialer.calllog.CallLogFramework;
import com.android.dialer.calllog.CallLogFramework_Factory;
import com.android.dialer.calllog.CallLogModule_ProvideCallLogDataSourcesFactory;
import com.android.dialer.calllog.RefreshAnnotatedCallLogWorker;
import com.android.dialer.calllog.RefreshAnnotatedCallLogWorker_Factory;
import com.android.dialer.calllog.database.CallLogDatabaseComponent;
import com.android.dialer.calllog.database.Coalescer;
import com.android.dialer.calllog.database.Coalescer_Factory;
import com.android.dialer.calllog.database.MutationApplier;
import com.android.dialer.calllog.database.MutationApplier_Factory;
import com.android.dialer.calllog.datasources.DataSources;
import com.android.dialer.calllog.datasources.contacts.ContactsDataSource_Factory;
import com.android.dialer.calllog.datasources.systemcalllog.SystemCallLogDataSource_Factory;
import com.android.dialer.common.concurrent.DefaultDialerExecutorFactory_Factory;
import com.android.dialer.common.concurrent.DialerExecutorComponent;
import com.android.dialer.common.concurrent.DialerExecutorFactory;
import com.android.dialer.configprovider.ConfigProvider;
import com.android.dialer.configprovider.ConfigProviderComponent;
import com.android.dialer.configprovider.SharedPrefConfigProvider_Factory;
import com.android.dialer.enrichedcall.EnrichedCallComponent;
import com.android.dialer.enrichedcall.EnrichedCallManager;
import com.android.dialer.enrichedcall.RcsVideoShareFactory;
import com.android.dialer.enrichedcall.stub.StubEnrichedCallModule;
import com.android.dialer.enrichedcall.stub.StubEnrichedCallModule_ProvideEnrichedCallManagerFactory;
import com.android.dialer.enrichedcall.stub.StubEnrichedCallModule_ProvidesRcsVideoShareFactoryFactory;
import com.android.dialer.inject.ContextModule;
import com.android.dialer.inject.ContextModule_ProvideContextFactory;
import com.android.dialer.lightbringer.Lightbringer;
import com.android.dialer.lightbringer.LightbringerComponent;
import com.android.dialer.lightbringer.stub.LightbringerStub_Factory;
import com.android.dialer.main.Main;
import com.android.dialer.main.MainComponent;
import com.android.dialer.main.impl.MainModule_ProvideMainFactory;
import com.android.dialer.simulator.Simulator;
import com.android.dialer.simulator.SimulatorComponent;
import com.android.dialer.simulator.impl.SimulatorImpl_Factory;
import com.android.incallui.calllocation.CallLocation;
import com.android.incallui.calllocation.CallLocationComponent;
import com.android.incallui.calllocation.stub.StubCallLocationModule_StubCallLocation_Factory;
import com.android.incallui.maps.Maps;
import com.android.incallui.maps.MapsComponent;
import com.android.incallui.maps.stub.StubMapsModule_StubMaps_Factory;
import com.android.voicemail.VoicemailClient;
import com.android.voicemail.VoicemailComponent;
import com.android.voicemail.impl.VoicemailModule;
import com.android.voicemail.impl.VoicemailModule_ProvideVoicemailClientFactory;

import javax.annotation.Generated;
import javax.inject.Provider;

import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerAospDialerRootComponent implements AospDialerRootComponent {
  private Provider<DataSources> provideCallLogDataSourcesProvider;

  private Provider<CallLogFramework> callLogFrameworkProvider;

  private Provider<Context> provideContextProvider;

  @SuppressWarnings("rawtypes")
  private Provider sharedPrefConfigProvider;

  private Provider<ConfigProvider> toProvider;

  private Provider<EnrichedCallManager> provideEnrichedCallManagerProvider;

  private Provider<RcsVideoShareFactory> providesRcsVideoShareFactoryProvider;

  private Provider<Maps> bindMapsProvider;

  private Provider<Simulator> bindsSimulatorProvider;

  private Provider<VoicemailClient> provideVoicemailClientProvider;

  private Provider<Lightbringer> bindsLightbringerProvider;

  private DaggerAospDialerRootComponent(Builder builder) {
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {

    this.provideCallLogDataSourcesProvider =
        CallLogModule_ProvideCallLogDataSourcesFactory.create(
            SystemCallLogDataSource_Factory.create(), ContactsDataSource_Factory.create());

    this.callLogFrameworkProvider =
        DoubleCheck.provider(CallLogFramework_Factory.create(provideCallLogDataSourcesProvider));

    this.provideContextProvider = ContextModule_ProvideContextFactory.create(builder.contextModule);

    this.sharedPrefConfigProvider = SharedPrefConfigProvider_Factory.create(provideContextProvider);

    this.toProvider = DoubleCheck.provider((Provider) sharedPrefConfigProvider);

    this.provideEnrichedCallManagerProvider =
        DoubleCheck.provider(StubEnrichedCallModule_ProvideEnrichedCallManagerFactory.create());

    this.providesRcsVideoShareFactoryProvider =
        DoubleCheck.provider(StubEnrichedCallModule_ProvidesRcsVideoShareFactoryFactory.create());

    this.bindMapsProvider =
        DoubleCheck.provider((Provider) StubMapsModule_StubMaps_Factory.create());

    this.bindsSimulatorProvider = DoubleCheck.provider((Provider) SimulatorImpl_Factory.create());

    this.provideVoicemailClientProvider =
        DoubleCheck.provider(
            VoicemailModule_ProvideVoicemailClientFactory.create(provideContextProvider));

    this.bindsLightbringerProvider =
        DoubleCheck.provider((Provider) LightbringerStub_Factory.create());
  }

  @Override
  public CallLocationComponent callLocationComponent() {
    return new CallLocationComponentImpl();
  }

  @Override
  public CallLogComponent callLogComponent() {
    return new CallLogComponentImpl();
  }

  @Override
  public CallLogDatabaseComponent callLogDatabaseComponent() {
    return new CallLogDatabaseComponentImpl();
  }

  @Override
  public ConfigProviderComponent configProviderComponent() {
    return new ConfigProviderComponentImpl();
  }

  @Override
  public DialerExecutorComponent dialerExecutorComponent() {
    return new DialerExecutorComponentImpl();
  }

  @Override
  public MainComponent mainComponent() {
    return new MainComponentImpl();
  }

  @Override
  public EnrichedCallComponent enrichedCallComponent() {
    return new EnrichedCallComponentImpl();
  }

  @Override
  public MapsComponent mapsComponent() {
    return new MapsComponentImpl();
  }

  @Override
  public SimulatorComponent simulatorComponent() {
    return new SimulatorComponentImpl();
  }

  @Override
  public VoicemailComponent voicemailComponent() {
    return new VoicemailComponentImpl();
  }

  @Override
  public LightbringerComponent lightbringerComponent() {
    return new LightbringerComponentImpl();
  }

  public static final class Builder {
    private ContextModule contextModule;

    private Builder() {}

    public AospDialerRootComponent build() {
      if (contextModule == null) {
        throw new IllegalStateException(ContextModule.class.getCanonicalName() + " must be set");
      }
      return new DaggerAospDialerRootComponent(this);
    }

    public Builder contextModule(ContextModule contextModule) {
      this.contextModule = Preconditions.checkNotNull(contextModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://google.github.io/dagger/unused-modules.
     */
    @Deprecated
    public Builder stubEnrichedCallModule(StubEnrichedCallModule stubEnrichedCallModule) {
      Preconditions.checkNotNull(stubEnrichedCallModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://google.github.io/dagger/unused-modules.
     */
    @Deprecated
    public Builder voicemailModule(VoicemailModule voicemailModule) {
      Preconditions.checkNotNull(voicemailModule);
      return this;
    }
  }

  private final class CallLocationComponentImpl extends CallLocationComponent {
    private Provider<CallLocation> bindCallLocationProvider;

    private CallLocationComponentImpl() {
      initialize();
    }

    @SuppressWarnings("unchecked")
    private void initialize() {

      this.bindCallLocationProvider =
          (Provider) StubCallLocationModule_StubCallLocation_Factory.create();
    }

    @Override
    public CallLocation getCallLocation() {
      return bindCallLocationProvider.get();
    }
  }

  private final class CallLogComponentImpl extends CallLogComponent {
    private Provider<RefreshAnnotatedCallLogWorker> refreshAnnotatedCallLogWorkerProvider;

    private CallLogComponentImpl() {
      initialize();
    }

    @SuppressWarnings("unchecked")
    private void initialize() {

      this.refreshAnnotatedCallLogWorkerProvider =
          RefreshAnnotatedCallLogWorker_Factory.create(
              DaggerAospDialerRootComponent.this.provideContextProvider,
              DaggerAospDialerRootComponent.this.provideCallLogDataSourcesProvider);
    }

    @Override
    public CallLogFramework callLogFramework() {
      return DaggerAospDialerRootComponent.this.callLogFrameworkProvider.get();
    }

    @Override
    public RefreshAnnotatedCallLogWorker getRefreshAnnotatedCallLogWorker() {
      return refreshAnnotatedCallLogWorkerProvider.get();
    }
  }

  private final class CallLogDatabaseComponentImpl extends CallLogDatabaseComponent {
    private Provider<Coalescer> coalescerProvider;

    private CallLogDatabaseComponentImpl() {
      initialize();
    }

    @SuppressWarnings("unchecked")
    private void initialize() {

      this.coalescerProvider =
          Coalescer_Factory.create(
              DaggerAospDialerRootComponent.this.provideCallLogDataSourcesProvider);
    }

    @Override
    public Coalescer coalescer() {
      return coalescerProvider.get();
    }

    @Override
    public MutationApplier mutationApplier() {
      return MutationApplier_Factory.create().get();
    }
  }

  private final class ConfigProviderComponentImpl extends ConfigProviderComponent {
    private ConfigProviderComponentImpl() {}

    @Override
    public ConfigProvider getConfigProvider() {
      return DaggerAospDialerRootComponent.this.toProvider.get();
    }
  }

  private final class DialerExecutorComponentImpl extends DialerExecutorComponent {
    private Provider<DialerExecutorFactory> bindDialerExecutorFactoryProvider;

    private DialerExecutorComponentImpl() {
      initialize();
    }

    @SuppressWarnings("unchecked")
    private void initialize() {

      this.bindDialerExecutorFactoryProvider =
          (Provider) DefaultDialerExecutorFactory_Factory.create();
    }

    @Override
    public DialerExecutorFactory dialerExecutorFactory() {
      return bindDialerExecutorFactoryProvider.get();
    }
  }

  private final class MainComponentImpl extends MainComponent {
    private MainComponentImpl() {}

    @Override
    public Main getMain() {
      return MainModule_ProvideMainFactory.create().get();
    }
  }

  private final class EnrichedCallComponentImpl extends EnrichedCallComponent {
    private EnrichedCallComponentImpl() {}

    @Override
    public EnrichedCallManager getEnrichedCallManager() {
      return DaggerAospDialerRootComponent.this.provideEnrichedCallManagerProvider.get();
    }

    @Override
    public RcsVideoShareFactory getRcsVideoShareFactory() {
      return DaggerAospDialerRootComponent.this.providesRcsVideoShareFactoryProvider.get();
    }
  }

  private final class MapsComponentImpl extends MapsComponent {
    private MapsComponentImpl() {}

    @Override
    public Maps getMaps() {
      return DaggerAospDialerRootComponent.this.bindMapsProvider.get();
    }
  }

  private final class SimulatorComponentImpl extends SimulatorComponent {
    private SimulatorComponentImpl() {}

    @Override
    public Simulator getSimulator() {
      return DaggerAospDialerRootComponent.this.bindsSimulatorProvider.get();
    }
  }

  private final class VoicemailComponentImpl extends VoicemailComponent {
    private VoicemailComponentImpl() {}

    @Override
    public VoicemailClient getVoicemailClient() {
      return DaggerAospDialerRootComponent.this.provideVoicemailClientProvider.get();
    }
  }

  private final class LightbringerComponentImpl extends LightbringerComponent {
    private LightbringerComponentImpl() {}

    @Override
    public Lightbringer getLightbringer() {
      return DaggerAospDialerRootComponent.this.bindsLightbringerProvider.get();
    }
  }
}
