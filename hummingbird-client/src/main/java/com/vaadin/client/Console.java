/*
 * Copyright 2000-2016 Vaadin Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.vaadin.client;

import com.google.gwt.core.shared.GWT;

import elemental.client.Browser;

/**
 * Helper class for using window.console
 *
 * @since
 * @author Vaadin Ltd
 */
public class Console {

    public static void debug(Object message) {
        if (GWT.isScript()) {
            Browser.getWindow().getConsole().debug(message);
        } else {
            System.out.println(message);
        }
    }

    public static void log(Object message) {
        if (GWT.isScript()) {
            Browser.getWindow().getConsole().log(message);
        } else {
            System.out.println(message);
        }
    }

    public static void warn(Object message) {
        if (GWT.isScript()) {
            Browser.getWindow().getConsole().warn(message);
        } else {
            System.err.println(message);
        }
    }

    public static void error(Object message) {
        if (GWT.isScript()) {
            Browser.getWindow().getConsole().error(message);
        } else {
            System.err.println(message);
        }
    }

}
