/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;

/**
 * <p>
 * Represents a set of primary keys and, for each key, the attributes to
 * retrieve from the table.
 * </p>
 * <p>
 * For each primary key, you must provide <i>all</i> of the key
 * attributes. For example, with a simple primary key, you only need to
 * provide the partition key. For a composite primary key, you must
 * provide <i>both</i> the partition key and the sort key.
 * </p>
 */
public class KeysAndAttributes implements Serializable {

    /**
     * The primary key attribute values that define the items and the
     * attributes associated with the items.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<java.util.Map<String,AttributeValue>> keys;

    /**
     * One or more attributes to retrieve from the table or index. If no
     * attribute names are specified then all attributes will be returned. If
     * any of the specified attributes are not found, they will not appear in
     * the result.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> attributesToGet;

    /**
     * The consistency of a read operation. If set to <code>true</code>, then
     * a strongly consistent read is used; otherwise, an eventually
     * consistent read is used.
     */
    private Boolean consistentRead;

    /**
     * A string that identifies one or more attributes to retrieve from the
     * table. These attributes can include scalars, sets, or elements of a
     * JSON document. The attributes in the <i>ProjectionExpression</i> must
     * be separated by commas. <p>If no attribute names are specified, then
     * all attributes will be returned. If any of the requested attributes
     * are not found, they will not appear in the result. <p>For more
     * information, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.AccessingItemAttributes.html">Accessing
     * Item Attributes</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * <note><p><i>ProjectionExpression</i> replaces the legacy
     * <i>AttributesToGet</i> parameter.</note>
     */
    private String projectionExpression;

    /**
     * One or more substitution tokens for attribute names in an expression.
     * The following are some use cases for using
     * <i>ExpressionAttributeNames</i>: <ul> <li> <p>To access an attribute
     * whose name conflicts with a DynamoDB reserved word. </li> <li> <p>To
     * create a placeholder for repeating occurrences of an attribute name in
     * an expression. </li> <li> <p>To prevent special characters in an
     * attribute name from being misinterpreted in an expression. </li> </ul>
     * <p>Use the <b>#</b> character in an expression to dereference an
     * attribute name. For example, consider the following attribute name:
     * <ul><li><p><code>Percentile</code></li></ul> <p>The name of this
     * attribute conflicts with a reserved word, so it cannot be used
     * directly in an expression. (For the complete list of reserved words,
     * see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ReservedWords.html">Reserved
     * Words</a> in the <i>Amazon DynamoDB Developer Guide</i>). To work
     * around this, you could specify the following for
     * <i>ExpressionAttributeNames</i>:
     * <ul><li><p><code>{"#P":"Percentile"}</code></li></ul> <p>You could
     * then use this substitution in an expression, as in this example:
     * <ul><li><p><code>#P = :val</code></li></ul> <note><p>Tokens that begin
     * with the <b>:</b> character are <i>expression attribute values</i>,
     * which are placeholders for the actual value at runtime.</note> <p>For
     * more information on expression attribute names, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.AccessingItemAttributes.html">Accessing
     * Item Attributes</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     */
    private java.util.Map<String,String> expressionAttributeNames;

    /**
     * The primary key attribute values that define the items and the
     * attributes associated with the items.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return The primary key attribute values that define the items and the
     *         attributes associated with the items.
     */
    public java.util.List<java.util.Map<String,AttributeValue>> getKeys() {
        return keys;
    }
    
    /**
     * The primary key attribute values that define the items and the
     * attributes associated with the items.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param keys The primary key attribute values that define the items and the
     *         attributes associated with the items.
     */
    public void setKeys(java.util.Collection<java.util.Map<String,AttributeValue>> keys) {
        if (keys == null) {
            this.keys = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<java.util.Map<String,AttributeValue>> keysCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<java.util.Map<String,AttributeValue>>(keys.size());
        keysCopy.addAll(keys);
        this.keys = keysCopy;
    }
    
    /**
     * The primary key attribute values that define the items and the
     * attributes associated with the items.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param keys The primary key attribute values that define the items and the
     *         attributes associated with the items.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public KeysAndAttributes withKeys(java.util.Map<String,AttributeValue>... keys) {
        if (getKeys() == null) setKeys(new java.util.ArrayList<java.util.Map<String,AttributeValue>>(keys.length));
        for (java.util.Map<String,AttributeValue> value : keys) {
            getKeys().add(value);
        }
        return this;
    }
    
    /**
     * The primary key attribute values that define the items and the
     * attributes associated with the items.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param keys The primary key attribute values that define the items and the
     *         attributes associated with the items.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public KeysAndAttributes withKeys(java.util.Collection<java.util.Map<String,AttributeValue>> keys) {
        if (keys == null) {
            this.keys = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<java.util.Map<String,AttributeValue>> keysCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<java.util.Map<String,AttributeValue>>(keys.size());
            keysCopy.addAll(keys);
            this.keys = keysCopy;
        }

        return this;
    }

    /**
     * One or more attributes to retrieve from the table or index. If no
     * attribute names are specified then all attributes will be returned. If
     * any of the specified attributes are not found, they will not appear in
     * the result.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return One or more attributes to retrieve from the table or index. If no
     *         attribute names are specified then all attributes will be returned. If
     *         any of the specified attributes are not found, they will not appear in
     *         the result.
     */
    public java.util.List<String> getAttributesToGet() {
        return attributesToGet;
    }
    
    /**
     * One or more attributes to retrieve from the table or index. If no
     * attribute names are specified then all attributes will be returned. If
     * any of the specified attributes are not found, they will not appear in
     * the result.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param attributesToGet One or more attributes to retrieve from the table or index. If no
     *         attribute names are specified then all attributes will be returned. If
     *         any of the specified attributes are not found, they will not appear in
     *         the result.
     */
    public void setAttributesToGet(java.util.Collection<String> attributesToGet) {
        if (attributesToGet == null) {
            this.attributesToGet = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> attributesToGetCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(attributesToGet.size());
        attributesToGetCopy.addAll(attributesToGet);
        this.attributesToGet = attributesToGetCopy;
    }
    
    /**
     * One or more attributes to retrieve from the table or index. If no
     * attribute names are specified then all attributes will be returned. If
     * any of the specified attributes are not found, they will not appear in
     * the result.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param attributesToGet One or more attributes to retrieve from the table or index. If no
     *         attribute names are specified then all attributes will be returned. If
     *         any of the specified attributes are not found, they will not appear in
     *         the result.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public KeysAndAttributes withAttributesToGet(String... attributesToGet) {
        if (getAttributesToGet() == null) setAttributesToGet(new java.util.ArrayList<String>(attributesToGet.length));
        for (String value : attributesToGet) {
            getAttributesToGet().add(value);
        }
        return this;
    }
    
    /**
     * One or more attributes to retrieve from the table or index. If no
     * attribute names are specified then all attributes will be returned. If
     * any of the specified attributes are not found, they will not appear in
     * the result.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param attributesToGet One or more attributes to retrieve from the table or index. If no
     *         attribute names are specified then all attributes will be returned. If
     *         any of the specified attributes are not found, they will not appear in
     *         the result.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public KeysAndAttributes withAttributesToGet(java.util.Collection<String> attributesToGet) {
        if (attributesToGet == null) {
            this.attributesToGet = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> attributesToGetCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(attributesToGet.size());
            attributesToGetCopy.addAll(attributesToGet);
            this.attributesToGet = attributesToGetCopy;
        }

        return this;
    }

    /**
     * The consistency of a read operation. If set to <code>true</code>, then
     * a strongly consistent read is used; otherwise, an eventually
     * consistent read is used.
     *
     * @return The consistency of a read operation. If set to <code>true</code>, then
     *         a strongly consistent read is used; otherwise, an eventually
     *         consistent read is used.
     */
    public Boolean isConsistentRead() {
        return consistentRead;
    }
    
    /**
     * The consistency of a read operation. If set to <code>true</code>, then
     * a strongly consistent read is used; otherwise, an eventually
     * consistent read is used.
     *
     * @param consistentRead The consistency of a read operation. If set to <code>true</code>, then
     *         a strongly consistent read is used; otherwise, an eventually
     *         consistent read is used.
     */
    public void setConsistentRead(Boolean consistentRead) {
        this.consistentRead = consistentRead;
    }
    
    /**
     * The consistency of a read operation. If set to <code>true</code>, then
     * a strongly consistent read is used; otherwise, an eventually
     * consistent read is used.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param consistentRead The consistency of a read operation. If set to <code>true</code>, then
     *         a strongly consistent read is used; otherwise, an eventually
     *         consistent read is used.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public KeysAndAttributes withConsistentRead(Boolean consistentRead) {
        this.consistentRead = consistentRead;
        return this;
    }

    /**
     * The consistency of a read operation. If set to <code>true</code>, then
     * a strongly consistent read is used; otherwise, an eventually
     * consistent read is used.
     *
     * @return The consistency of a read operation. If set to <code>true</code>, then
     *         a strongly consistent read is used; otherwise, an eventually
     *         consistent read is used.
     */
    public Boolean getConsistentRead() {
        return consistentRead;
    }

    /**
     * A string that identifies one or more attributes to retrieve from the
     * table. These attributes can include scalars, sets, or elements of a
     * JSON document. The attributes in the <i>ProjectionExpression</i> must
     * be separated by commas. <p>If no attribute names are specified, then
     * all attributes will be returned. If any of the requested attributes
     * are not found, they will not appear in the result. <p>For more
     * information, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.AccessingItemAttributes.html">Accessing
     * Item Attributes</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * <note><p><i>ProjectionExpression</i> replaces the legacy
     * <i>AttributesToGet</i> parameter.</note>
     *
     * @return A string that identifies one or more attributes to retrieve from the
     *         table. These attributes can include scalars, sets, or elements of a
     *         JSON document. The attributes in the <i>ProjectionExpression</i> must
     *         be separated by commas. <p>If no attribute names are specified, then
     *         all attributes will be returned. If any of the requested attributes
     *         are not found, they will not appear in the result. <p>For more
     *         information, see <a
     *         href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.AccessingItemAttributes.html">Accessing
     *         Item Attributes</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     *         <note><p><i>ProjectionExpression</i> replaces the legacy
     *         <i>AttributesToGet</i> parameter.</note>
     */
    public String getProjectionExpression() {
        return projectionExpression;
    }
    
    /**
     * A string that identifies one or more attributes to retrieve from the
     * table. These attributes can include scalars, sets, or elements of a
     * JSON document. The attributes in the <i>ProjectionExpression</i> must
     * be separated by commas. <p>If no attribute names are specified, then
     * all attributes will be returned. If any of the requested attributes
     * are not found, they will not appear in the result. <p>For more
     * information, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.AccessingItemAttributes.html">Accessing
     * Item Attributes</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * <note><p><i>ProjectionExpression</i> replaces the legacy
     * <i>AttributesToGet</i> parameter.</note>
     *
     * @param projectionExpression A string that identifies one or more attributes to retrieve from the
     *         table. These attributes can include scalars, sets, or elements of a
     *         JSON document. The attributes in the <i>ProjectionExpression</i> must
     *         be separated by commas. <p>If no attribute names are specified, then
     *         all attributes will be returned. If any of the requested attributes
     *         are not found, they will not appear in the result. <p>For more
     *         information, see <a
     *         href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.AccessingItemAttributes.html">Accessing
     *         Item Attributes</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     *         <note><p><i>ProjectionExpression</i> replaces the legacy
     *         <i>AttributesToGet</i> parameter.</note>
     */
    public void setProjectionExpression(String projectionExpression) {
        this.projectionExpression = projectionExpression;
    }
    
    /**
     * A string that identifies one or more attributes to retrieve from the
     * table. These attributes can include scalars, sets, or elements of a
     * JSON document. The attributes in the <i>ProjectionExpression</i> must
     * be separated by commas. <p>If no attribute names are specified, then
     * all attributes will be returned. If any of the requested attributes
     * are not found, they will not appear in the result. <p>For more
     * information, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.AccessingItemAttributes.html">Accessing
     * Item Attributes</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * <note><p><i>ProjectionExpression</i> replaces the legacy
     * <i>AttributesToGet</i> parameter.</note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param projectionExpression A string that identifies one or more attributes to retrieve from the
     *         table. These attributes can include scalars, sets, or elements of a
     *         JSON document. The attributes in the <i>ProjectionExpression</i> must
     *         be separated by commas. <p>If no attribute names are specified, then
     *         all attributes will be returned. If any of the requested attributes
     *         are not found, they will not appear in the result. <p>For more
     *         information, see <a
     *         href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.AccessingItemAttributes.html">Accessing
     *         Item Attributes</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     *         <note><p><i>ProjectionExpression</i> replaces the legacy
     *         <i>AttributesToGet</i> parameter.</note>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public KeysAndAttributes withProjectionExpression(String projectionExpression) {
        this.projectionExpression = projectionExpression;
        return this;
    }

    /**
     * One or more substitution tokens for attribute names in an expression.
     * The following are some use cases for using
     * <i>ExpressionAttributeNames</i>: <ul> <li> <p>To access an attribute
     * whose name conflicts with a DynamoDB reserved word. </li> <li> <p>To
     * create a placeholder for repeating occurrences of an attribute name in
     * an expression. </li> <li> <p>To prevent special characters in an
     * attribute name from being misinterpreted in an expression. </li> </ul>
     * <p>Use the <b>#</b> character in an expression to dereference an
     * attribute name. For example, consider the following attribute name:
     * <ul><li><p><code>Percentile</code></li></ul> <p>The name of this
     * attribute conflicts with a reserved word, so it cannot be used
     * directly in an expression. (For the complete list of reserved words,
     * see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ReservedWords.html">Reserved
     * Words</a> in the <i>Amazon DynamoDB Developer Guide</i>). To work
     * around this, you could specify the following for
     * <i>ExpressionAttributeNames</i>:
     * <ul><li><p><code>{"#P":"Percentile"}</code></li></ul> <p>You could
     * then use this substitution in an expression, as in this example:
     * <ul><li><p><code>#P = :val</code></li></ul> <note><p>Tokens that begin
     * with the <b>:</b> character are <i>expression attribute values</i>,
     * which are placeholders for the actual value at runtime.</note> <p>For
     * more information on expression attribute names, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.AccessingItemAttributes.html">Accessing
     * Item Attributes</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     *
     * @return One or more substitution tokens for attribute names in an expression.
     *         The following are some use cases for using
     *         <i>ExpressionAttributeNames</i>: <ul> <li> <p>To access an attribute
     *         whose name conflicts with a DynamoDB reserved word. </li> <li> <p>To
     *         create a placeholder for repeating occurrences of an attribute name in
     *         an expression. </li> <li> <p>To prevent special characters in an
     *         attribute name from being misinterpreted in an expression. </li> </ul>
     *         <p>Use the <b>#</b> character in an expression to dereference an
     *         attribute name. For example, consider the following attribute name:
     *         <ul><li><p><code>Percentile</code></li></ul> <p>The name of this
     *         attribute conflicts with a reserved word, so it cannot be used
     *         directly in an expression. (For the complete list of reserved words,
     *         see <a
     *         href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ReservedWords.html">Reserved
     *         Words</a> in the <i>Amazon DynamoDB Developer Guide</i>). To work
     *         around this, you could specify the following for
     *         <i>ExpressionAttributeNames</i>:
     *         <ul><li><p><code>{"#P":"Percentile"}</code></li></ul> <p>You could
     *         then use this substitution in an expression, as in this example:
     *         <ul><li><p><code>#P = :val</code></li></ul> <note><p>Tokens that begin
     *         with the <b>:</b> character are <i>expression attribute values</i>,
     *         which are placeholders for the actual value at runtime.</note> <p>For
     *         more information on expression attribute names, see <a
     *         href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.AccessingItemAttributes.html">Accessing
     *         Item Attributes</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     */
    public java.util.Map<String,String> getExpressionAttributeNames() {
        
        return expressionAttributeNames;
    }
    
    /**
     * One or more substitution tokens for attribute names in an expression.
     * The following are some use cases for using
     * <i>ExpressionAttributeNames</i>: <ul> <li> <p>To access an attribute
     * whose name conflicts with a DynamoDB reserved word. </li> <li> <p>To
     * create a placeholder for repeating occurrences of an attribute name in
     * an expression. </li> <li> <p>To prevent special characters in an
     * attribute name from being misinterpreted in an expression. </li> </ul>
     * <p>Use the <b>#</b> character in an expression to dereference an
     * attribute name. For example, consider the following attribute name:
     * <ul><li><p><code>Percentile</code></li></ul> <p>The name of this
     * attribute conflicts with a reserved word, so it cannot be used
     * directly in an expression. (For the complete list of reserved words,
     * see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ReservedWords.html">Reserved
     * Words</a> in the <i>Amazon DynamoDB Developer Guide</i>). To work
     * around this, you could specify the following for
     * <i>ExpressionAttributeNames</i>:
     * <ul><li><p><code>{"#P":"Percentile"}</code></li></ul> <p>You could
     * then use this substitution in an expression, as in this example:
     * <ul><li><p><code>#P = :val</code></li></ul> <note><p>Tokens that begin
     * with the <b>:</b> character are <i>expression attribute values</i>,
     * which are placeholders for the actual value at runtime.</note> <p>For
     * more information on expression attribute names, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.AccessingItemAttributes.html">Accessing
     * Item Attributes</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     *
     * @param expressionAttributeNames One or more substitution tokens for attribute names in an expression.
     *         The following are some use cases for using
     *         <i>ExpressionAttributeNames</i>: <ul> <li> <p>To access an attribute
     *         whose name conflicts with a DynamoDB reserved word. </li> <li> <p>To
     *         create a placeholder for repeating occurrences of an attribute name in
     *         an expression. </li> <li> <p>To prevent special characters in an
     *         attribute name from being misinterpreted in an expression. </li> </ul>
     *         <p>Use the <b>#</b> character in an expression to dereference an
     *         attribute name. For example, consider the following attribute name:
     *         <ul><li><p><code>Percentile</code></li></ul> <p>The name of this
     *         attribute conflicts with a reserved word, so it cannot be used
     *         directly in an expression. (For the complete list of reserved words,
     *         see <a
     *         href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ReservedWords.html">Reserved
     *         Words</a> in the <i>Amazon DynamoDB Developer Guide</i>). To work
     *         around this, you could specify the following for
     *         <i>ExpressionAttributeNames</i>:
     *         <ul><li><p><code>{"#P":"Percentile"}</code></li></ul> <p>You could
     *         then use this substitution in an expression, as in this example:
     *         <ul><li><p><code>#P = :val</code></li></ul> <note><p>Tokens that begin
     *         with the <b>:</b> character are <i>expression attribute values</i>,
     *         which are placeholders for the actual value at runtime.</note> <p>For
     *         more information on expression attribute names, see <a
     *         href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.AccessingItemAttributes.html">Accessing
     *         Item Attributes</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     */
    public void setExpressionAttributeNames(java.util.Map<String,String> expressionAttributeNames) {
        this.expressionAttributeNames = expressionAttributeNames;
    }
    
    /**
     * One or more substitution tokens for attribute names in an expression.
     * The following are some use cases for using
     * <i>ExpressionAttributeNames</i>: <ul> <li> <p>To access an attribute
     * whose name conflicts with a DynamoDB reserved word. </li> <li> <p>To
     * create a placeholder for repeating occurrences of an attribute name in
     * an expression. </li> <li> <p>To prevent special characters in an
     * attribute name from being misinterpreted in an expression. </li> </ul>
     * <p>Use the <b>#</b> character in an expression to dereference an
     * attribute name. For example, consider the following attribute name:
     * <ul><li><p><code>Percentile</code></li></ul> <p>The name of this
     * attribute conflicts with a reserved word, so it cannot be used
     * directly in an expression. (For the complete list of reserved words,
     * see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ReservedWords.html">Reserved
     * Words</a> in the <i>Amazon DynamoDB Developer Guide</i>). To work
     * around this, you could specify the following for
     * <i>ExpressionAttributeNames</i>:
     * <ul><li><p><code>{"#P":"Percentile"}</code></li></ul> <p>You could
     * then use this substitution in an expression, as in this example:
     * <ul><li><p><code>#P = :val</code></li></ul> <note><p>Tokens that begin
     * with the <b>:</b> character are <i>expression attribute values</i>,
     * which are placeholders for the actual value at runtime.</note> <p>For
     * more information on expression attribute names, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.AccessingItemAttributes.html">Accessing
     * Item Attributes</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param expressionAttributeNames One or more substitution tokens for attribute names in an expression.
     *         The following are some use cases for using
     *         <i>ExpressionAttributeNames</i>: <ul> <li> <p>To access an attribute
     *         whose name conflicts with a DynamoDB reserved word. </li> <li> <p>To
     *         create a placeholder for repeating occurrences of an attribute name in
     *         an expression. </li> <li> <p>To prevent special characters in an
     *         attribute name from being misinterpreted in an expression. </li> </ul>
     *         <p>Use the <b>#</b> character in an expression to dereference an
     *         attribute name. For example, consider the following attribute name:
     *         <ul><li><p><code>Percentile</code></li></ul> <p>The name of this
     *         attribute conflicts with a reserved word, so it cannot be used
     *         directly in an expression. (For the complete list of reserved words,
     *         see <a
     *         href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ReservedWords.html">Reserved
     *         Words</a> in the <i>Amazon DynamoDB Developer Guide</i>). To work
     *         around this, you could specify the following for
     *         <i>ExpressionAttributeNames</i>:
     *         <ul><li><p><code>{"#P":"Percentile"}</code></li></ul> <p>You could
     *         then use this substitution in an expression, as in this example:
     *         <ul><li><p><code>#P = :val</code></li></ul> <note><p>Tokens that begin
     *         with the <b>:</b> character are <i>expression attribute values</i>,
     *         which are placeholders for the actual value at runtime.</note> <p>For
     *         more information on expression attribute names, see <a
     *         href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.AccessingItemAttributes.html">Accessing
     *         Item Attributes</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public KeysAndAttributes withExpressionAttributeNames(java.util.Map<String,String> expressionAttributeNames) {
        setExpressionAttributeNames(expressionAttributeNames);
        return this;
    }

    /**
     * One or more substitution tokens for attribute names in an expression.
     * The following are some use cases for using
     * <i>ExpressionAttributeNames</i>: <ul> <li> <p>To access an attribute
     * whose name conflicts with a DynamoDB reserved word. </li> <li> <p>To
     * create a placeholder for repeating occurrences of an attribute name in
     * an expression. </li> <li> <p>To prevent special characters in an
     * attribute name from being misinterpreted in an expression. </li> </ul>
     * <p>Use the <b>#</b> character in an expression to dereference an
     * attribute name. For example, consider the following attribute name:
     * <ul><li><p><code>Percentile</code></li></ul> <p>The name of this
     * attribute conflicts with a reserved word, so it cannot be used
     * directly in an expression. (For the complete list of reserved words,
     * see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ReservedWords.html">Reserved
     * Words</a> in the <i>Amazon DynamoDB Developer Guide</i>). To work
     * around this, you could specify the following for
     * <i>ExpressionAttributeNames</i>:
     * <ul><li><p><code>{"#P":"Percentile"}</code></li></ul> <p>You could
     * then use this substitution in an expression, as in this example:
     * <ul><li><p><code>#P = :val</code></li></ul> <note><p>Tokens that begin
     * with the <b>:</b> character are <i>expression attribute values</i>,
     * which are placeholders for the actual value at runtime.</note> <p>For
     * more information on expression attribute names, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.AccessingItemAttributes.html">Accessing
     * Item Attributes</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * <p>
     * The method adds a new key-value pair into ExpressionAttributeNames
     * parameter, and returns a reference to this object so that method calls
     * can be chained together.
     *
     * @param key The key of the entry to be added into ExpressionAttributeNames.
     * @param value The corresponding value of the entry to be added into ExpressionAttributeNames.
     */
    public KeysAndAttributes addExpressionAttributeNamesEntry(String key, String value) {
        if (null == this.expressionAttributeNames) {
            this.expressionAttributeNames = new java.util.HashMap<String,String>();
        }
        if (this.expressionAttributeNames.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.expressionAttributeNames.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ExpressionAttributeNames.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     */
    public KeysAndAttributes clearExpressionAttributeNamesEntries() {
        this.expressionAttributeNames = null;
        return this;
    }
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getKeys() != null) sb.append("Keys: " + getKeys() + ",");
        if (getAttributesToGet() != null) sb.append("AttributesToGet: " + getAttributesToGet() + ",");
        if (isConsistentRead() != null) sb.append("ConsistentRead: " + isConsistentRead() + ",");
        if (getProjectionExpression() != null) sb.append("ProjectionExpression: " + getProjectionExpression() + ",");
        if (getExpressionAttributeNames() != null) sb.append("ExpressionAttributeNames: " + getExpressionAttributeNames() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getKeys() == null) ? 0 : getKeys().hashCode()); 
        hashCode = prime * hashCode + ((getAttributesToGet() == null) ? 0 : getAttributesToGet().hashCode()); 
        hashCode = prime * hashCode + ((isConsistentRead() == null) ? 0 : isConsistentRead().hashCode()); 
        hashCode = prime * hashCode + ((getProjectionExpression() == null) ? 0 : getProjectionExpression().hashCode()); 
        hashCode = prime * hashCode + ((getExpressionAttributeNames() == null) ? 0 : getExpressionAttributeNames().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof KeysAndAttributes == false) return false;
        KeysAndAttributes other = (KeysAndAttributes)obj;
        
        if (other.getKeys() == null ^ this.getKeys() == null) return false;
        if (other.getKeys() != null && other.getKeys().equals(this.getKeys()) == false) return false; 
        if (other.getAttributesToGet() == null ^ this.getAttributesToGet() == null) return false;
        if (other.getAttributesToGet() != null && other.getAttributesToGet().equals(this.getAttributesToGet()) == false) return false; 
        if (other.isConsistentRead() == null ^ this.isConsistentRead() == null) return false;
        if (other.isConsistentRead() != null && other.isConsistentRead().equals(this.isConsistentRead()) == false) return false; 
        if (other.getProjectionExpression() == null ^ this.getProjectionExpression() == null) return false;
        if (other.getProjectionExpression() != null && other.getProjectionExpression().equals(this.getProjectionExpression()) == false) return false; 
        if (other.getExpressionAttributeNames() == null ^ this.getExpressionAttributeNames() == null) return false;
        if (other.getExpressionAttributeNames() != null && other.getExpressionAttributeNames().equals(this.getExpressionAttributeNames()) == false) return false; 
        return true;
    }
    
}
    