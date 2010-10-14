/*
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
/**
 * @author Dmitry A. Durnev
 */
package com.google.code.appengine.awt;


import javax.accessibility.AccessibleState;

import com.google.code.appengine.awt.TextField;
import com.google.code.appengine.awt.TextField.AccessibleAWTTextField;


import junit.framework.TestCase;

public class AccessibleAWTTextFieldTest extends TestCase {
    TextField textField;
    AccessibleAWTTextField aTextField;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        textField = new TextField();
        aTextField = textField.new AccessibleAWTTextField();
        assertTrue(textField.getAccessibleContext() instanceof AccessibleAWTTextField);
    }

    /*
     * Test method for 'java.nawt.TextField.AccessibleAWTTextField.getAccessibleStateSet()'
     */
    public void testGetAccessibleStateSet() {
        AccessibleState state = AccessibleState.SINGLE_LINE;
        assertTrue("text field is a single-line text",
                   aTextField.getAccessibleStateSet().contains(state));
    }

}