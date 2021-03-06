// automatically generated, do not modify

package grl.flatbuffer;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class EulerRotation extends Struct {
  public EulerRotation __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  public double r1() { return bb.getDouble(bb_pos + 0); }
  public double r2() { return bb.getDouble(bb_pos + 8); }
  public double r3() { return bb.getDouble(bb_pos + 16); }
  public byte eulerOrder() { return bb.get(bb_pos + 24); }

  public static int createEulerRotation(FlatBufferBuilder builder, double r1, double r2, double r3, byte eulerOrder) {
    builder.prep(8, 32);
    builder.pad(7);
    builder.putByte(eulerOrder);
    builder.putDouble(r3);
    builder.putDouble(r2);
    builder.putDouble(r1);
    return builder.offset();
  }
};

