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

package com.google.code.appengine.awt;

import java.util.EventListener;

import org.apache.harmony.awt.ListenerList;

import com.google.code.appengine.awt.Component;


final class AWTListenerList<T extends EventListener> extends ListenerList<T> {
    private static final long serialVersionUID = -2622077171532840953L;

    private final Component owner;
    
    AWTListenerList() {
        super();
        this.owner = null;
    }

    AWTListenerList(Component owner) {
        super();
        this.owner = owner;
    }

    @Override
    public void addUserListener(T listener) {
        super.addUserListener(listener);

        if (owner != null) {
            owner.deprecatedEventHandler = false;
        }
    }
}
