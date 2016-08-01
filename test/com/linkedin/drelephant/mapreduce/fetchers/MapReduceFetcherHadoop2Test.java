/*
 * Copyright 2016 LinkedIn Corp.
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

package com.linkedin.drelephant.mapreduce.fetchers;

import org.junit.Assert;
import org.junit.Test;


public class MapReduceFetcherHadoop2Test {

  @Test
  public void testDiagnosticMatcher() {
    Assert.assertEquals("Task[\\s\\u00A0]+(.*)[\\s\\u00A0]+failed[\\s\\u00A0]+([0-9])[\\s\\u00A0]+times[\\s\\u00A0]+",
        ThreadContextMR2.getDiagnosticMatcher("Task task_1443068695259_9143_m_000475 failed 1 time")
            .pattern().toString());

    Assert.assertEquals(2, ThreadContextMR2.getDiagnosticMatcher("Task task_1443068695259_9143_m_000475 failed 1 time")
        .groupCount());
  }

}