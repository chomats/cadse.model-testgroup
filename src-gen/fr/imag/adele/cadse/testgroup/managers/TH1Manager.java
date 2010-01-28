package fr.imag.adele.cadse.testgroup.managers;


import fr.imag.adele.cadse.core.CadseException;
import fr.imag.adele.cadse.cadseg.managers.dataModel.ItemManager;
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
public class TH1Manager extends ItemManager {

	/**
	    @generated
	*/
	public TH1Manager() {
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
	public static final long getATH1Attribute(Item tH1) {
		return tH1.getAttributeWithDefaultValue(TestGroupCST.TH1_at_ATH1_, 0L);
	}

	/**
		@generated
	*/
	public static final void setATH1Attribute(Item tH1, long value) {
		try {
			tH1.setAttribute(TestGroupCST.TH1_at_ATH1_, value);
		} catch (Throwable t) {

		}
	}

	/**
		get  links 'th1_th2' from 'TH1' to 'TH2'.
        @generated
    */
    static public List<Link> getTh1_th2Link(Item tH1) {
        return tH1.getOutgoingLinks(TestGroupCST.TH1_lt_TH1_TH2);
    }

	/**
        @generated
    */
    static public Collection<Item> getTh1_th2All(Item tH1) {
        return tH1.getOutgoingItems(TestGroupCST.TH1_lt_TH1_TH2, false);
    }

	/**
        @generated
    */
    static public Collection<Item> getTh1_th2(Item tH1) {
        return tH1.getOutgoingItems(TestGroupCST.TH1_lt_TH1_TH2,true);
    }

	/**
        @generated
    */
    static public void addTh1_th2(Item tH1, Item value) throws CadseException {
        tH1.addOutgoingItem(TestGroupCST.TH1_lt_TH1_TH2,value);
    }

	/**
        @generated
    */
    static public void removeTh1_th2(Item tH1, Item value) throws CadseException {
        tH1.removeOutgoingItem(TestGroupCST.TH1_lt_TH1_TH2,value);
    }

}

