/*
 * Copyright (C) 2017 Seoul National University
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package edu.snu.vortex.runtime.master.resourcemanager;

import edu.snu.vortex.runtime.common.RuntimeAttribute;
import edu.snu.vortex.runtime.executor.ExecutorConfiguration;

/**
 * Manages resources depending on the environment in which jobs are executed.
 */
public interface ResourceManager {
  /**
   * Requests for an executor.
   * @param resourceType the resource type (ex. compute/storage) to request for the executor.
   * @param executorConfiguration the configuration for the executor to use.
   */
  void requestExecutor(final RuntimeAttribute resourceType, final ExecutorConfiguration executorConfiguration);

}