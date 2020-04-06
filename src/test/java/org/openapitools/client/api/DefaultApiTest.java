/*
 * Copyright © NORD/LB Norddeutsche Landesbank Girozentrale, Hannover - Alle Rechte vorbehalten -
 */

package org.openapitools.client.api;

import org.junit.Test;
import org.openapitools.client.ApiException;
import org.openapitools.client.model.Params;

public class DefaultApiTest {

  @Test
  public void search() throws ApiException {
    final Params params = new Params();
    params.setName("name");
    params.setStreet("street");
    new DefaultApi().search(params);
  }
}