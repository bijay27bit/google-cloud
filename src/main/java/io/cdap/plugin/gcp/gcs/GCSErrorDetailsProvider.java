/*
 * Copyright © 2024 Cask Data, Inc.
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

package io.cdap.plugin.gcp.gcs;

import io.cdap.plugin.gcp.common.GCPErrorDetailsProvider;
import io.cdap.plugin.gcp.common.GCPUtils;

/**
 * A custom ErrorDetailsProvider for GCS plugins.
 */
public class GCSErrorDetailsProvider extends GCPErrorDetailsProvider {

  @Override
  protected String getExternalDocumentationLink() {
    return GCPUtils.GCS_SUPPORTED_DOC_URL;
  }
}
