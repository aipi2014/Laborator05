package ro.pub.cs.aipi.lab05.reservation;


/**
* reservation/ReservationsHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Reservation.idl
* Monday, November 10, 2014 3:20:14 AM EET
*/

abstract public class ReservationsHelper
{
  private static String  _id = "IDL:reservation/Reservations:1.0";

  public static void insert (org.omg.CORBA.Any a, ro.pub.cs.aipi.lab05.reservation.ReservationInformation[] that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static ro.pub.cs.aipi.lab05.reservation.ReservationInformation[] extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = ro.pub.cs.aipi.lab05.reservation.ReservationInformationHelper.type ();
      __typeCode = org.omg.CORBA.ORB.init ().create_sequence_tc (0, __typeCode);
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (ro.pub.cs.aipi.lab05.reservation.ReservationsHelper.id (), "Reservations", __typeCode);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static ro.pub.cs.aipi.lab05.reservation.ReservationInformation[] read (org.omg.CORBA.portable.InputStream istream)
  {
    ro.pub.cs.aipi.lab05.reservation.ReservationInformation value[] = null;
    int _len0 = istream.read_long ();
    value = new ro.pub.cs.aipi.lab05.reservation.ReservationInformation[_len0];
    for (int _o1 = 0;_o1 < value.length; ++_o1)
      value[_o1] = ro.pub.cs.aipi.lab05.reservation.ReservationInformationHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, ro.pub.cs.aipi.lab05.reservation.ReservationInformation[] value)
  {
    ostream.write_long (value.length);
    for (int _i0 = 0;_i0 < value.length; ++_i0)
      ro.pub.cs.aipi.lab05.reservation.ReservationInformationHelper.write (ostream, value[_i0]);
  }

}