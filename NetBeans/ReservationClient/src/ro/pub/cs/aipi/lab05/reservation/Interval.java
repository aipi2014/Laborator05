package ro.pub.cs.aipi.lab05.reservation;


/**
* reservation/Interval.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Reservation.idl
* Monday, November 10, 2014 3:19:56 AM EET
*/

public final class Interval implements org.omg.CORBA.portable.IDLEntity
{
  public ro.pub.cs.aipi.lab05.reservation.Time start = null;
  public ro.pub.cs.aipi.lab05.reservation.Time end = null;

  public Interval ()
  {
  } // ctor

  public Interval (ro.pub.cs.aipi.lab05.reservation.Time _start, ro.pub.cs.aipi.lab05.reservation.Time _end)
  {
    start = _start;
    end = _end;
  } // ctor

} // class Interval
