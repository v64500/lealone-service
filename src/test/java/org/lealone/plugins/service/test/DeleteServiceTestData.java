/*
 * Copyright Lealone Database Group.
 * Licensed under the Server Side Public License, v 1.
 * Initial Developer: zhh
 */
package org.lealone.plugins.service.test;

import java.io.IOException;

import org.lealone.test.misc.DeleteTestData;

public class DeleteServiceTestData {

    public static void main(String[] args) {
        try {
            DeleteTestData.main(args);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
