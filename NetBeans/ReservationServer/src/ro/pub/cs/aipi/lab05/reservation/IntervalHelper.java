package ro.pub.cs.aipi.lab05.reservation;


/**
* reservation/IntervalHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Reservation.idl
* Monday, November 10, 2014 3:20:14 AM EET
*/

abstract public class IntervalHelper
{
  private static String  _id = "IDL:reservation/Interval:1.0";

  public static void insert (org.omg.CORBA.Any a, ro.pub.cs.aipi.lab05.reservation.Interval that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static ro.pub.cs.aipi.lab05.reservation.Interval extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  private static boolean __active = false;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      synchronized (org.omg.CORBA.TypeCode.class)
      {
        if (__typeCode == null)
        {
          if (__active)
          {
            return org.omg.CORBA.ORB.init().create_recursive_tc ( _id );
          }
          __active = true;
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [2];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = ro.pub.cs.aipi.lab05.reservation.TimeHelper.type ();
          _members0[0] = new org.omg.CORBA.StructMember (
            "start",
            _tcOf_members0,
            null);
          _tcOf_members0 = ro.pub.cs.aipi.lab05.reservation.TimeHelper.type ();
          _members0[1] = new org.omg.CORBA.StructMember (
            "end",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (ro.pub.cs.aipi.lab05.reservation.IntervalHelper.id (), "Interval", _members0);
          __active = false;
        }
      }
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static ro.pub.cs.aipi.lab05.reservation.Interval read (org.omg.CORBA.portable.InputStream istream)
  {
    ro.pub.cs.aipi.lab05.reservation.Interval value = new ro.pub.cs.aipi.lab05.reservation.Interval ();
    value.start = ro.pub.cs.aipi.lab05.reservation.TimeHelper.read (istream);
    value.end = ro.pub.cs.aipi.lab05.reservation.TimeHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, ro.pub.cs.aipi.lab05.reservation.Interval value)
  {
    ro.pub.cs.aipi.lab05.reservation.TimeHelper.write (ostream, value.start);
    ro.pub.cs.aipi.lab05.reservation.TimeHelper.write (ostream, value.end);
  }

}