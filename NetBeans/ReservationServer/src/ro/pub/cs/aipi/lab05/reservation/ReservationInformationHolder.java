package ro.pub.cs.aipi.lab05.reservation;

/**
* reservation/ReservationInformationHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Reservation.idl
* Monday, November 10, 2014 3:20:14 AM EET
*/

public final class ReservationInformationHolder implements org.omg.CORBA.portable.Streamable
{
  public ro.pub.cs.aipi.lab05.reservation.ReservationInformation value = null;

  public ReservationInformationHolder ()
  {
  }

  public ReservationInformationHolder (ro.pub.cs.aipi.lab05.reservation.ReservationInformation initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = ro.pub.cs.aipi.lab05.reservation.ReservationInformationHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    ro.pub.cs.aipi.lab05.reservation.ReservationInformationHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return ro.pub.cs.aipi.lab05.reservation.ReservationInformationHelper.type ();
  }

}
