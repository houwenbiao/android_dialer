// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: packages/apps/Dialer/java/com/android/dialer/phonenumberproto/dialer_phone_number.proto

package com.android.dialer;

public interface DialerPhoneNumberOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.android.dialer.DialerPhoneNumber)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * libphonenumber representation of the phone number. May be empty if the raw
   * input failed to parse, in which case raw_input should be used.
   * </pre>
   *
   * <code>optional .com.android.dialer.DialerInternalPhoneNumber dialer_internal_phone_number = 1;</code>
   */
  boolean hasDialerInternalPhoneNumber();
  /**
   * <pre>
   * libphonenumber representation of the phone number. May be empty if the raw
   * input failed to parse, in which case raw_input should be used.
   * </pre>
   *
   * <code>optional .com.android.dialer.DialerInternalPhoneNumber dialer_internal_phone_number = 1;</code>
   */
  com.android.dialer.DialerInternalPhoneNumber getDialerInternalPhoneNumber();

  /**
   * <pre>
   * Prefer to use dialer_internal_phone_number if present.
   * </pre>
   *
   * <code>optional .com.android.dialer.DialerPhoneNumber.RawInput raw_input = 2;</code>
   */
  boolean hasRawInput();
  /**
   * <pre>
   * Prefer to use dialer_internal_phone_number if present.
   * </pre>
   *
   * <code>optional .com.android.dialer.DialerPhoneNumber.RawInput raw_input = 2;</code>
   */
  DialerPhoneNumber.RawInput getRawInput();
}
