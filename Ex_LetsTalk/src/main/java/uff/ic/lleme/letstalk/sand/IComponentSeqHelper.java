package uff.ic.lleme.letstalk.sand;

/**
 * IComponentSeqHelper.java . Generated by the IDL-to-Java compiler (portable),
 * version "3.2" from deployment.idl Saturday, December 10, 2005 1:24:06 AM GMT
 */

abstract public class IComponentSeqHelper {
	private static String _id = "IDL:IComponentSeq:1.0";

	public static void insert(org.omg.CORBA.Any a, IComponent[] that) {
		org.omg.CORBA.portable.OutputStream out = a.create_output_stream();
		a.type(type());
		write(out, that);
		a.read_value(out.create_input_stream(), type());
	}

	public static IComponent[] extract(org.omg.CORBA.Any a) {
		return read(a.create_input_stream());
	}

	private static org.omg.CORBA.TypeCode __typeCode = null;

	synchronized public static org.omg.CORBA.TypeCode type() {
		if (__typeCode == null) {
			__typeCode = IComponentHelper.type();
			__typeCode = org.omg.CORBA.ORB.init().create_sequence_tc(0,
					__typeCode);
			__typeCode = org.omg.CORBA.ORB.init().create_alias_tc(
					IComponentSeqHelper.id(), "IComponentSeq", __typeCode);
		}
		return __typeCode;
	}

	public static String id() {
		return _id;
	}

	public static IComponent[] read(org.omg.CORBA.portable.InputStream istream) {
		IComponent value[] = null;
		int _len0 = istream.read_long();
		value = new IComponent[_len0];
		for (int _o1 = 0; _o1 < value.length; ++_o1)
			value[_o1] = IComponentHelper.read(istream);
		return value;
	}

	public static void write(org.omg.CORBA.portable.OutputStream ostream,
			IComponent[] value) {
		ostream.write_long(value.length);
		for (int _i0 = 0; _i0 < value.length; ++_i0)
			IComponentHelper.write(ostream, value[_i0]);
	}

}
