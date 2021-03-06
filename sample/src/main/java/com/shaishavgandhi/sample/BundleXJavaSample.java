package com.shaishavgandhi.sample;

import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;

import com.shaishavgandhi.navigator.Extra;

import java.util.ArrayList;

public class BundleXJavaSample {

    @Extra String javaString;
    @Extra long javaLong;
    @Extra long[] javaLongArray;
    @Extra Long javaBigLong;
    @Extra int javaInt;
    @Extra int[] javaIntArray;
    @Extra Integer javaBigInt;
    @Extra Double javaBigDouble;
    @Extra double javaDouble;
    @Extra double[] javaDoubleArray;
    @Extra Double[] javaBigDoubleArray;
    @Extra float javaFloat;
    @Extra float[] javaFloatArray;
    @Extra Float javaBigFloat;
    @Extra Float[] javaBigFloatArray;
    @Extra byte javaByte;
    @Extra byte[] javaByteArray;
    @Extra Byte javaBigByte;
    @Extra Byte[] javaBigByteArray;
    @Extra short javaShort;
    @Extra Short javaBigShort;
    @Extra short[] javaShortArray;
    @Extra Short[] javaBigShortArray; // Clever movie reference
    @Extra char javaChar;
    @Extra Character javaBigChar;
    @Extra char[] javaCharArray;
    @Extra Character[] javaBigCharArray;
    @Extra boolean javaBool;
    @Extra Boolean javaBigBool;
    @Extra boolean[] javaBoolArray;
    @Extra Boolean[] javaBigBoolArray;
    @Extra CharSequence javaCharSequence;
    @Extra CharSequence[] javaCharSequenceArray;
    @Extra ArrayList<CharSequence> javaCharSequenceList;
    @Extra Size androidSize;
    @Extra SizeF androidSizeF;
    @Extra SampleSerializable sampleSerializable;
    @Extra KotlinParcelable javaParcelable;
    @Extra ArrayList<KotlinParcelable> javaParcelableArrayList;
    @Extra KotlinParcelable[] javaParcelableArray;
    @Extra SparseArray<KotlinParcelable> javaParcelableSparseArray;
}
