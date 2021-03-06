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
 * @author Michael Danilov
 */
package com.google.code.appengine.awt.dnd;

import com.google.code.appengine.awt.dnd.DragSourceDragEvent;
import com.google.code.appengine.awt.dnd.DragSourceDropEvent;
import com.google.code.appengine.awt.dnd.DragSourceEvent;
import com.google.code.appengine.awt.dnd.DragSourceListener;
import com.google.code.appengine.awt.dnd.DragSourceMotionListener;

public abstract class DragSourceAdapter implements DragSourceListener, DragSourceMotionListener {

    public DragSourceAdapter() {
    }

    public void dragExit(DragSourceEvent dse) {
    }

    public void dragDropEnd(DragSourceDropEvent dsde) {
    }

    public void dropActionChanged(DragSourceDragEvent dsde) {
    }

    public void dragOver(DragSourceDragEvent dsde) {
    }

    public void dragMouseMoved(DragSourceDragEvent dsde) {
    }

    public void dragEnter(DragSourceDragEvent dsde) {
    }

}
