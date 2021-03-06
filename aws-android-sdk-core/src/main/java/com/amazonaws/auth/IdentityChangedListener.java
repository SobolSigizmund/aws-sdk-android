/**
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */

package com.amazonaws.auth;

/**
 * The interface to handle the appropriate updates when an identity change event
 * was caught
 */
public interface IdentityChangedListener {

    /**
     * Defines the actions to be taken after an identity change event has been
     * captured to update data appropriately
     *
     * @param oldIdentityId the old identity, now out of date
     * @param newIdentityId the new identity which is to be kept
     */
    void identityChanged(String oldIdentityId, String newIdentityId);
}
