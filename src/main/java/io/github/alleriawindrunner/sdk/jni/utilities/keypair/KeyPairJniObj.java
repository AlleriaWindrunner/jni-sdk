package io.github.alleriawindrunner.sdk.jni.utilities.keypair;

import io.github.alleriawindrunner.sdk.jni.common.JniException;
import io.github.alleriawindrunner.sdk.jni.common.JniLibLoader;

public class KeyPairJniObj {

  static {
    JniLibLoader.loadJniLibrary();
  }

  public static native long createJniKeyPair(int cryptoType) throws JniException;

  public static native long createJniKeyPair(int cryptoType, byte[] priKeyBytes)
      throws JniException;

  public static native String getJniKeyPairAddress(long keyPair);

  public static native String getJniKeyPairPubKey(long keyPair);

  public static native String getJniKeyPairPrivateKey(long keyPair);

  public static native int getJniKeyPairCryptoType(long keyPair);

  public static native void destroyJniKeyPair(long keyPair);
}
