/*
 * Copyright (C) 2012 IOTOPE (http://www.iotope.com/)
 *
 * Licensed to IOTOPE under one or more contributor license 
 * agreements.  See the NOTICE file distributed with this work
 * for additional information regarding copyright ownership.
 * IOTOPE licenses this file to you under the Apache License, 
 * Version 2.0 (the "License"); you may not use this file except 
 * in compliance with the License.  You may obtain a copy of the 
 * License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.iotope.nfc.reader.pn532;

import org.iotope.nfc.reader.AbstractCommand;
import org.iotope.nfc.reader.ReaderCommand;
import org.iotope.nfc.reader.ReaderResponse;

public abstract class PN532AbstractCommand<COMMAND extends ReaderCommand,RESPONSE extends ReaderResponse> extends AbstractCommand<COMMAND,RESPONSE> {

    public PN532AbstractCommand(Class<RESPONSE> responseClass) {
        super(responseClass);
    }
}
