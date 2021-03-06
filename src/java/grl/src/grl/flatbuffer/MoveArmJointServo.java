// automatically generated, do not modify

package grl.flatbuffer;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class MoveArmJointServo extends Table {
  public static MoveArmJointServo getRootAsMoveArmJointServo(ByteBuffer _bb) { return getRootAsMoveArmJointServo(_bb, new MoveArmJointServo()); }
  public static MoveArmJointServo getRootAsMoveArmJointServo(ByteBuffer _bb, MoveArmJointServo obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__init(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public MoveArmJointServo __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  public JointState goal() { return goal(new JointState()); }
  public JointState goal(JointState obj) { int o = __offset(4); return o != 0 ? obj.__init(__indirect(o + bb_pos), bb) : null; }

  public static int createMoveArmJointServo(FlatBufferBuilder builder,
      int goal) {
    builder.startObject(1);
    MoveArmJointServo.addGoal(builder, goal);
    return MoveArmJointServo.endMoveArmJointServo(builder);
  }

  public static void startMoveArmJointServo(FlatBufferBuilder builder) { builder.startObject(1); }
  public static void addGoal(FlatBufferBuilder builder, int goalOffset) { builder.addOffset(0, goalOffset, 0); }
  public static int endMoveArmJointServo(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
};

