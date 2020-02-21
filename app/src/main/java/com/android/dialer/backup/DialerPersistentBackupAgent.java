/*
 * Copyright (C) 2017 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License
 */
package com.android.dialer.backup;

import android.app.backup.BackupDataInput;
import android.app.backup.BackupDataOutput;
import android.os.ParcelFileDescriptor;
import android.support.annotation.NonNull;
import android.support.annotation.VisibleForTesting;
import android.util.ArrayMap;

import com.android.dialer.common.Assert;
import com.android.dialer.common.LogUtil;
import com.android.dialer.logging.DialerImpression;
import com.android.dialer.logging.Logger;
import com.google.android.libraries.backup.BackupKeyPredicate;
import com.google.android.libraries.backup.BackupKeyPredicates;
import com.google.android.libraries.backup.PersistentBackupAgentHelper;

import java.io.IOException;
import java.util.Map;

/** Implementation of Key/Value Backup that powers Dialer's backup and restore. */
public class DialerPersistentBackupAgent extends PersistentBackupAgentHelper {

  private static final String DEFAULT_SHARED_PREFS_NAME = "com.google.android.dialer_preferences";

  @NonNull
  private final String sharedPrefsName;

  @VisibleForTesting(otherwise = VisibleForTesting.NONE)
  DialerPersistentBackupAgent(@NonNull String sharedPreferenceName) {
    this.sharedPrefsName = Assert.isNotNull(sharedPreferenceName);
    Logger.get(this).logImpression(DialerImpression.Type.BACKUP_KEY_VALUE_BACKUP_AGENT_CONSTRUCTOR);
  }

  public DialerPersistentBackupAgent() {
    this(DEFAULT_SHARED_PREFS_NAME);
  }

  @Override
  public void onRestore(BackupDataInput data, int appVersionCode, ParcelFileDescriptor stateFile)
      throws IOException {
    Logger.get(this).logImpression(DialerImpression.Type.BACKUP_KEY_VALUE_ON_RESTORE);
    LogUtil.i("DialerPersistentBackupAgent.onRestore", "restore from version: " + appVersionCode);
    super.onRestore(data, appVersionCode, stateFile);
  }

  @Override
  public void onBackup(
      ParcelFileDescriptor oldState, BackupDataOutput data, ParcelFileDescriptor newState)
      throws IOException {
    Logger.get(this).logImpression(DialerImpression.Type.BACKUP_KEY_VALUE_ON_BACKUP);
    LogUtil.i("DialerPersistentBackupAgent.onBackup", "onBackup being performed");
    super.onBackup(oldState, data, newState);
  }

  @Override
  public Map<String, BackupKeyPredicate> getBackupSpecification() {
    Logger.get(this).logImpression(DialerImpression.Type.BACKUP_KEY_VALUE_GET_BACKUP_SPECIFICATION);
    LogUtil.i(
        "DialerPersistentBackupAgent.getBackupSpecification",
        "file being backed up: " + sharedPrefsName);
    Map<String, BackupKeyPredicate> backupSpecification = new ArrayMap<>();
    backupSpecification.put(sharedPrefsName, BackupKeyPredicates.alwaysTrue());
    return backupSpecification;
  }

  @Override
  public void onRestoreFinished() {
    Logger.get(this).logImpression(DialerImpression.Type.BACKUP_KEY_VALUE_ON_RESTORE_FINISHED);
    super.onRestoreFinished();
  }
}
