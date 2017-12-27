package org.nd4j.linalg.api.ops.impl.shape.tensorops;

import onnx.OnnxProto3;
import org.nd4j.autodiff.samediff.SameDiff;
import org.nd4j.linalg.api.ops.Op;

import java.util.Map;

public class TensorSizeV3 extends BaseTensorOp {
   @Override
   public String tensorflowName() {
      return "TensorArraySizeV3";
   }


   @Override
   public String opName() {
      return "tensorarraysizev3";
   }



   @Override
   public void initFromOnnx(OnnxProto3.NodeProto node, SameDiff initWith, Map<String, OnnxProto3.AttributeProto> attributesForNode, OnnxProto3.GraphProto graph) {
   }
}