/**
 * Copyright (c) 2014-present, Facebook, Inc.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 */

 // @Generated by gentest/gentest.rb from gentest/fixtures/YGPaddingTest.html

package com.facebook.yoga;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class YGPaddingTest {
  @Test
  public void test_padding_no_size() {
    final YogaNode root = new YogaNode();
    root.setPadding(YogaEdge.LEFT, 10);
    root.setPadding(YogaEdge.TOP, 10);
    root.setPadding(YogaEdge.RIGHT, 10);
    root.setPadding(YogaEdge.BOTTOM, 10);
    root.setDirection(YogaDirection.LTR);
    root.calculateLayout();

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(20f, root.getLayoutWidth(), 0.0f);
    assertEquals(20f, root.getLayoutHeight(), 0.0f);

    root.setDirection(YogaDirection.RTL);
    root.calculateLayout();

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(20f, root.getLayoutWidth(), 0.0f);
    assertEquals(20f, root.getLayoutHeight(), 0.0f);
  }

  @Test
  public void test_padding_container_match_child() {
    final YogaNode root = new YogaNode();
    root.setPadding(YogaEdge.LEFT, 10);
    root.setPadding(YogaEdge.TOP, 10);
    root.setPadding(YogaEdge.RIGHT, 10);
    root.setPadding(YogaEdge.BOTTOM, 10);

    final YogaNode root_child0 = new YogaNode();
    root_child0.setWidth(10f);
    root_child0.setHeight(10f);
    root.addChildAt(root_child0, 0);
    root.setDirection(YogaDirection.LTR);
    root.calculateLayout();

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(30f, root.getLayoutWidth(), 0.0f);
    assertEquals(30f, root.getLayoutHeight(), 0.0f);

    assertEquals(10f, root_child0.getLayoutX(), 0.0f);
    assertEquals(10f, root_child0.getLayoutY(), 0.0f);
    assertEquals(10f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(10f, root_child0.getLayoutHeight(), 0.0f);

    root.setDirection(YogaDirection.RTL);
    root.calculateLayout();

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(30f, root.getLayoutWidth(), 0.0f);
    assertEquals(30f, root.getLayoutHeight(), 0.0f);

    assertEquals(10f, root_child0.getLayoutX(), 0.0f);
    assertEquals(10f, root_child0.getLayoutY(), 0.0f);
    assertEquals(10f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(10f, root_child0.getLayoutHeight(), 0.0f);
  }

  @Test
  public void test_padding_flex_child() {
    final YogaNode root = new YogaNode();
    root.setPadding(YogaEdge.LEFT, 10);
    root.setPadding(YogaEdge.TOP, 10);
    root.setPadding(YogaEdge.RIGHT, 10);
    root.setPadding(YogaEdge.BOTTOM, 10);
    root.setWidth(100f);
    root.setHeight(100f);

    final YogaNode root_child0 = new YogaNode();
    root_child0.setFlexGrow(1f);
    root_child0.setWidth(10f);
    root.addChildAt(root_child0, 0);
    root.setDirection(YogaDirection.LTR);
    root.calculateLayout();

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(100f, root.getLayoutWidth(), 0.0f);
    assertEquals(100f, root.getLayoutHeight(), 0.0f);

    assertEquals(10f, root_child0.getLayoutX(), 0.0f);
    assertEquals(10f, root_child0.getLayoutY(), 0.0f);
    assertEquals(10f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(80f, root_child0.getLayoutHeight(), 0.0f);

    root.setDirection(YogaDirection.RTL);
    root.calculateLayout();

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(100f, root.getLayoutWidth(), 0.0f);
    assertEquals(100f, root.getLayoutHeight(), 0.0f);

    assertEquals(80f, root_child0.getLayoutX(), 0.0f);
    assertEquals(10f, root_child0.getLayoutY(), 0.0f);
    assertEquals(10f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(80f, root_child0.getLayoutHeight(), 0.0f);
  }

  @Test
  public void test_padding_stretch_child() {
    final YogaNode root = new YogaNode();
    root.setPadding(YogaEdge.LEFT, 10);
    root.setPadding(YogaEdge.TOP, 10);
    root.setPadding(YogaEdge.RIGHT, 10);
    root.setPadding(YogaEdge.BOTTOM, 10);
    root.setWidth(100f);
    root.setHeight(100f);

    final YogaNode root_child0 = new YogaNode();
    root_child0.setHeight(10f);
    root.addChildAt(root_child0, 0);
    root.setDirection(YogaDirection.LTR);
    root.calculateLayout();

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(100f, root.getLayoutWidth(), 0.0f);
    assertEquals(100f, root.getLayoutHeight(), 0.0f);

    assertEquals(10f, root_child0.getLayoutX(), 0.0f);
    assertEquals(10f, root_child0.getLayoutY(), 0.0f);
    assertEquals(80f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(10f, root_child0.getLayoutHeight(), 0.0f);

    root.setDirection(YogaDirection.RTL);
    root.calculateLayout();

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(100f, root.getLayoutWidth(), 0.0f);
    assertEquals(100f, root.getLayoutHeight(), 0.0f);

    assertEquals(10f, root_child0.getLayoutX(), 0.0f);
    assertEquals(10f, root_child0.getLayoutY(), 0.0f);
    assertEquals(80f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(10f, root_child0.getLayoutHeight(), 0.0f);
  }

  @Test
  public void test_padding_center_child() {
    final YogaNode root = new YogaNode();
    root.setJustifyContent(YogaJustify.CENTER);
    root.setAlignItems(YogaAlign.CENTER);
    root.setPadding(YogaEdge.START, 10);
    root.setPadding(YogaEdge.END, 20);
    root.setPadding(YogaEdge.BOTTOM, 20);
    root.setWidth(100f);
    root.setHeight(100f);

    final YogaNode root_child0 = new YogaNode();
    root_child0.setWidth(10f);
    root_child0.setHeight(10f);
    root.addChildAt(root_child0, 0);
    root.setDirection(YogaDirection.LTR);
    root.calculateLayout();

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(100f, root.getLayoutWidth(), 0.0f);
    assertEquals(100f, root.getLayoutHeight(), 0.0f);

    assertEquals(40f, root_child0.getLayoutX(), 0.0f);
    assertEquals(35f, root_child0.getLayoutY(), 0.0f);
    assertEquals(10f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(10f, root_child0.getLayoutHeight(), 0.0f);

    root.setDirection(YogaDirection.RTL);
    root.calculateLayout();

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(100f, root.getLayoutWidth(), 0.0f);
    assertEquals(100f, root.getLayoutHeight(), 0.0f);

    assertEquals(50f, root_child0.getLayoutX(), 0.0f);
    assertEquals(35f, root_child0.getLayoutY(), 0.0f);
    assertEquals(10f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(10f, root_child0.getLayoutHeight(), 0.0f);
  }

  @Test
  public void test_child_with_padding_align_end() {
    final YogaNode root = new YogaNode();
    root.setJustifyContent(YogaJustify.FLEX_END);
    root.setAlignItems(YogaAlign.FLEX_END);
    root.setWidth(200f);
    root.setHeight(200f);

    final YogaNode root_child0 = new YogaNode();
    root_child0.setPadding(YogaEdge.LEFT, 20);
    root_child0.setPadding(YogaEdge.TOP, 20);
    root_child0.setPadding(YogaEdge.RIGHT, 20);
    root_child0.setPadding(YogaEdge.BOTTOM, 20);
    root_child0.setWidth(100f);
    root_child0.setHeight(100f);
    root.addChildAt(root_child0, 0);
    root.setDirection(YogaDirection.LTR);
    root.calculateLayout();

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(200f, root.getLayoutWidth(), 0.0f);
    assertEquals(200f, root.getLayoutHeight(), 0.0f);

    assertEquals(100f, root_child0.getLayoutX(), 0.0f);
    assertEquals(100f, root_child0.getLayoutY(), 0.0f);
    assertEquals(100f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(100f, root_child0.getLayoutHeight(), 0.0f);

    root.setDirection(YogaDirection.RTL);
    root.calculateLayout();

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(200f, root.getLayoutWidth(), 0.0f);
    assertEquals(200f, root.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child0.getLayoutX(), 0.0f);
    assertEquals(100f, root_child0.getLayoutY(), 0.0f);
    assertEquals(100f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(100f, root_child0.getLayoutHeight(), 0.0f);
  }

}
