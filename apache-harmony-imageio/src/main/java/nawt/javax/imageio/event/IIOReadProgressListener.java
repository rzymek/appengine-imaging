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
 * @author Sergey I. Salishev
 */
package nawt.javax.imageio.event;

import java.util.EventListener;

import nawt.javax.imageio.ImageReader;

/**
 * @author Sergey I. Salishev
 */
public interface IIOReadProgressListener extends EventListener {

    void imageComplete(ImageReader source);
    void imageProgress(ImageReader source, float percentageDone);
    void imageStarted(ImageReader source, int imageIndex);
    void readAborted(ImageReader source);
    void sequenceComplete(ImageReader source);
    void sequenceStarted(ImageReader source, int minIndex);
    void thumbnailComplete(ImageReader source);
    void thumbnailProgress(ImageReader source, float percentageDone);
    void thumbnailStarted(ImageReader source, int imageIndex, int thumbnailIndex);
}

