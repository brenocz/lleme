package corbaObjects.letstalk;

/**
 * corbaObjects/letstalk/stringListHolder.java . Generated by the IDL-to-Java
 * compiler (portable), version "3.2" from letstalk.idl Sexta-feira, 9 de
 * Dezembro de 2005 18h26min29s BRST
 */

public final class stringListHolder implements
		org.omg.CORBA.portable.Streamable {
	public String value[] = null;

	public stringListHolder() {
	}

	public stringListHolder(String[] initialValue) {
		value = initialValue;
	}

	public void _read(org.omg.CORBA.portable.InputStream i) {
		value = corbaObjects.letstalk.stringListHelper.read(i);
	}

	public void _write(org.omg.CORBA.portable.OutputStream o) {
		corbaObjects.letstalk.stringListHelper.write(o, value);
	}

	public org.omg.CORBA.TypeCode _type() {
		return corbaObjects.letstalk.stringListHelper.type();
	}

}