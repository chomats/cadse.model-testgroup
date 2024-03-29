/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *
 * Copyright (C) 2006-2010 Adele Team/LIG/Grenoble University, France
 */
package fr.imag.adele.cadse.testgroup.managers;


import fr.imag.adele.cadse.core.CadseException;
import fr.imag.adele.cadse.core.Item;
import fr.imag.adele.cadse.core.ItemType;
import fr.imag.adele.cadse.core.Link;
import fr.imag.adele.cadse.core.LinkType;
import fr.imag.adele.cadse.core.util.Convert;
import fr.imag.adele.cadse.testgroup.TestGroupCST;
import java.util.Collection;
import java.util.List;



/**
    @generated
*/
public class TH2Manager extends T2Manager {

	/**
	    @generated
	*/
	public TH2Manager() {
		super();
	}

	/**
		@generated
	*/
	@Override
	public String computeQualifiedName(Item item, String name, Item parent, LinkType lt) {
		StringBuilder sb = new StringBuilder();
		try {
			Object value;
			Item currentItem;
			if (sb.length() != 0) {
				sb.append(".");
			}
			sb.append(name);
			return sb.toString();
		} catch (Throwable e) {
			e.printStackTrace();
			return "error";
		}
	}

	/**
		@generated
	*/
	@Override
	public String getDisplayName(Item item) {
		try {
			Object value;
			return item.getName();
		} catch (Throwable e) {
			e.printStackTrace();
			return "error";
		}
	}

	/**
		@generated
	*/
	public static final long getATH2Attribute(Item tH2) {
		return tH2.getAttributeWithDefaultValue(TestGroupCST.TH2_at_ATH2_, 0L);
	}

	/**
		@generated
	*/
	public static final void setATH2Attribute(Item tH2, long value) {
		try {
			tH2.setAttribute(TestGroupCST.TH2_at_ATH2_, value);
		} catch (Throwable t) {

		}
	}

	/**
		get  links 'th2_tm' from 'TH2' to 'TM'.
        @generated
    */
    static public List<Link> getTh2_tmLink(Item tH2) {
        return tH2.getOutgoingLinks(TestGroupCST.TH2_lt_TH2_TM);
    }

	/**
        @generated
    */
    static public Collection<Item> getTh2_tmAll(Item tH2) {
        return tH2.getOutgoingItems(TestGroupCST.TH2_lt_TH2_TM, false);
    }

	/**
        @generated
    */
    static public Collection<Item> getTh2_tm(Item tH2) {
        return tH2.getOutgoingItems(TestGroupCST.TH2_lt_TH2_TM,true);
    }

	/**
        @generated
    */
    static public void addTh2_tm(Item tH2, Item value) throws CadseException {
        tH2.addOutgoingItem(TestGroupCST.TH2_lt_TH2_TM,value);
    }

	/**
        @generated
    */
    static public void removeTh2_tm(Item tH2, Item value) throws CadseException {
        tH2.removeOutgoingItem(TestGroupCST.TH2_lt_TH2_TM,value);
    }

}

