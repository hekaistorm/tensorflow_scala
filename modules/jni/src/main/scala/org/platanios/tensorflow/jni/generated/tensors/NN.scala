/* DO NOT EDIT THIS FILE - it is machine generated */

/* Copyright 2017-19, Emmanouil Antonios Platanios. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package org.platanios.tensorflow.jni.generated.tensors

import org.platanios.tensorflow.jni.TensorFlow

object NN {
  TensorFlow.load()

  @native def biasAdd(contextHandle: Long, value: Long, bias: Long, data_format: Array[Byte]): Long
  @native def relu(contextHandle: Long, features: Long): Long
  @native def relu6(contextHandle: Long, features: Long): Long
  @native def elu(contextHandle: Long, features: Long): Long
  @native def selu(contextHandle: Long, features: Long): Long
  @native def softplus(contextHandle: Long, features: Long): Long
  @native def softsign(contextHandle: Long, features: Long): Long
  @native def softmax(contextHandle: Long, logits: Long): Long
  @native def logSoftmax(contextHandle: Long, logits: Long): Long
  @native def l2Loss(contextHandle: Long, t: Long): Long
  @native def softmaxCrossEntropyWithLogits(contextHandle: Long, features: Long, labels: Long): Array[Long]
  @native def sparseSoftmaxCrossEntropyWithLogits(contextHandle: Long, features: Long, labels: Long): Array[Long]
  @native def topKV2(contextHandle: Long, input: Long, k: Long, sorted: Boolean): Array[Long]
  @native def inTopKV2(contextHandle: Long, predictions: Long, targets: Long, k: Long): Long
  @native def avgPool(contextHandle: Long, value: Long, ksize: Array[Long], strides: Array[Long], padding: Array[Byte], data_format: Array[Byte]): Long
  @native def avgPool3D(contextHandle: Long, input: Long, ksize: Array[Long], strides: Array[Long], padding: Array[Byte], data_format: Array[Byte]): Long
  @native def maxPool(contextHandle: Long, input: Long, ksize: Array[Long], strides: Array[Long], padding: Array[Byte], data_format: Array[Byte]): Long
  @native def maxPoolGrad(contextHandle: Long, orig_input: Long, orig_output: Long, grad: Long, ksize: Array[Long], strides: Array[Long], padding: Array[Byte], data_format: Array[Byte]): Long
  @native def maxPoolGradGrad(contextHandle: Long, orig_input: Long, orig_output: Long, grad: Long, ksize: Array[Long], strides: Array[Long], padding: Array[Byte], data_format: Array[Byte]): Long
  @native def maxPool3D(contextHandle: Long, input: Long, ksize: Array[Long], strides: Array[Long], padding: Array[Byte], data_format: Array[Byte]): Long
  @native def maxPoolWithArgmax(contextHandle: Long, input: Long, ksize: Array[Long], strides: Array[Long], padding: Array[Byte], targmax: Int): Array[Long]
  @native def fractionalAvgPool(contextHandle: Long, value: Long, pooling_ratio: Array[Float], pseudo_random: Boolean, overlapping: Boolean, deterministic: Boolean, seed: Long, seed2: Long): Array[Long]
  @native def fractionalMaxPool(contextHandle: Long, value: Long, pooling_ratio: Array[Float], pseudo_random: Boolean, overlapping: Boolean, deterministic: Boolean, seed: Long, seed2: Long): Array[Long]
  @native def conv2D(contextHandle: Long, input: Long, filter: Long, strides: Array[Long], padding: Array[Byte], use_cudnn_on_gpu: Boolean, data_format: Array[Byte], dilations: Array[Long]): Long
  @native def conv2DBackpropInput(contextHandle: Long, input_sizes: Long, filter: Long, out_backprop: Long, strides: Array[Long], padding: Array[Byte], use_cudnn_on_gpu: Boolean, data_format: Array[Byte], dilations: Array[Long]): Long
  @native def conv2DBackpropFilter(contextHandle: Long, input: Long, filter_sizes: Long, out_backprop: Long, strides: Array[Long], padding: Array[Byte], use_cudnn_on_gpu: Boolean, data_format: Array[Byte], dilations: Array[Long]): Long
  @native def fusedResizeAndPadConv2D(contextHandle: Long, input: Long, size: Long, paddings: Long, filter: Long, mode: Array[Byte], strides: Array[Long], padding: Array[Byte], resize_align_corners: Boolean): Long
  @native def fusedPadConv2D(contextHandle: Long, input: Long, paddings: Long, filter: Long, mode: Array[Byte], strides: Array[Long], padding: Array[Byte]): Long
  @native def depthwiseConv2dNative(contextHandle: Long, input: Long, filter: Long, strides: Array[Long], padding: Array[Byte], data_format: Array[Byte], dilations: Array[Long]): Long
  @native def conv3D(contextHandle: Long, input: Long, filter: Long, strides: Array[Long], padding: Array[Byte], data_format: Array[Byte], dilations: Array[Long]): Long
  @native def dilation2D(contextHandle: Long, input: Long, filter: Long, strides: Array[Long], rates: Array[Long], padding: Array[Byte]): Long
  @native def lRN(contextHandle: Long, input: Long, depth_radius: Long, bias: Float, alpha: Float, beta: Float): Long
  @native def batchNormWithGlobalNormalization(contextHandle: Long, t: Long, m: Long, v: Long, beta: Long, gamma: Long, variance_epsilon: Float, scale_after_normalization: Boolean): Long
  @native def fusedBatchNorm(contextHandle: Long, x: Long, scale: Long, offset: Long, mean: Long, variance: Long, epsilon: Float, data_format: Array[Byte], is_training: Boolean): Array[Long]
  @native def quantizedBiasAdd(contextHandle: Long, input: Long, bias: Long, min_input: Long, max_input: Long, min_bias: Long, max_bias: Long, out_type: Int): Array[Long]
  @native def quantizedRelu(contextHandle: Long, features: Long, min_features: Long, max_features: Long, out_type: Int): Array[Long]
  @native def quantizedRelu6(contextHandle: Long, features: Long, min_features: Long, max_features: Long, out_type: Int): Array[Long]
  @native def quantizedReluX(contextHandle: Long, features: Long, max_value: Long, min_features: Long, max_features: Long, out_type: Int): Array[Long]
  @native def quantizedAvgPool(contextHandle: Long, input: Long, min_input: Long, max_input: Long, ksize: Array[Long], strides: Array[Long], padding: Array[Byte]): Array[Long]
  @native def quantizedMaxPool(contextHandle: Long, input: Long, min_input: Long, max_input: Long, ksize: Array[Long], strides: Array[Long], padding: Array[Byte]): Array[Long]
  @native def quantizedConv2D(contextHandle: Long, input: Long, filter: Long, min_input: Long, max_input: Long, min_filter: Long, max_filter: Long, strides: Array[Long], padding: Array[Byte], out_type: Int, dilations: Array[Long]): Array[Long]
  @native def quantizedBatchNormWithGlobalNormalization(contextHandle: Long, t: Long, t_min: Long, t_max: Long, m: Long, m_min: Long, m_max: Long, v: Long, v_min: Long, v_max: Long, beta: Long, beta_min: Long, beta_max: Long, gamma: Long, gamma_min: Long, gamma_max: Long, out_type: Int, variance_epsilon: Float, scale_after_normalization: Boolean): Array[Long]
}
