package ro.pub.cs.aipi.lab05.reservation;

/**
* reservation/DateHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Reservation.idl
* Monday, November 10, 2014 3:20:14 AM EET
*/

public final class DateHolder implements org.omg.CORBA.portable.Streamable
{
  public ro.pub.cs.aipi.lab05.reservation.Date value = null;

  public DateHolder ()
  {
  }

  public DateHolder (ro.pub.cs.aipi.lab05.reservation.Date initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = ro.pub.cs.aipi.lab05.reservation.DateHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    ro.pub.cs.aipi.lab05.reservation.DateHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return ro.pub.cs.aipi.lab05.reservation.DateHelper.type ();
  }

}
