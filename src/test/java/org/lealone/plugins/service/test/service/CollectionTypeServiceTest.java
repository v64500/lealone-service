/*
 * Copyright Lealone Database Group.
 * Licensed under the Server Side Public License, v 1.
 * Initial Developer: zhh
 */
package org.lealone.plugins.service.test.service;

import org.junit.Test;
import org.lealone.db.LealoneDatabase;
import org.lealone.plugins.service.test.orm.SqlScript;
import org.lealone.test.sql.SqlTestBase;

public class CollectionTypeServiceTest extends SqlTestBase {

    public CollectionTypeServiceTest() {
        super(LealoneDatabase.NAME);
    }

    @Test
    public void testService() throws Exception {
        SqlScript.createCollectionTypeService(this);
    }
}
